package com.testsuite.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class WebDriverInstance {

    private  static WebDriver driver=null;

    @BeforeSuite
    public WebDriver  browserset()
    {
        System.setProperty("webdriver.chrome.driver","D:\\Automation\\POMCarSupplier\\src\\test\\java\\resources\\Drivers\\chrome\\chromedriver.exe");
        driver = new ChromeDriver(); //pass desired capabilities object here
        driver.manage().window().maximize();
        driver.get("https://www.phptravels.net/supplier");
        return driver;
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("Closed");
        driver.quit();
    }

}
