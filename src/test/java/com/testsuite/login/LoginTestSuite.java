package com.testsuite.login;

import com.pages.BookingDashboard;
import com.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTestSuite {
    private  static WebDriver driver=null;
    static String email="supplier@phptravels.com";
    static String password="demosupplier";
    static SoftAssert soft = new SoftAssert(); //use soft assets here
    static  WebDriverWait wait;

@Test
    public static void login()
    {
        DesiredCapabilities caps=new DesiredCapabilities(); //use to set properies in web browser
        caps.setBrowserName("test");
//        System.setProperty("webdriver.gecko.driver","D:\\Automation\\POMCarSupplier\\src\\test\\java\\resources\\Drivers\\geckodriver\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver","D:\\Automation\\POMCarSupplier\\src\\test\\java\\resources\\Drivers\\chrome\\chromedriver.exe");
//        driver = new FirefoxDriver();
        driver = new ChromeDriver(caps); //pass desired capabilities object here
        driver.manage().window().maximize();
        driver.get("https://www.phptravels.net/supplier");
        LoginPage login=new LoginPage(driver);
        login.enterEmailAddress(email);
        login.enterPassword(password);
        login.clickRemember();
        login.submitThelogin();
        wait = new WebDriverWait(driver, 20);
        BookingDashboard dashboard=new BookingDashboard(driver);
        soft.assertEquals(dashboard.avalabilityOfCarsMenu(),"fals");
    }

}
