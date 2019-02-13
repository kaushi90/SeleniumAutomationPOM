package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver=null;

    By emailTextBox=By.xpath("//input[@type='text']");
    By passwordTextBox=By.xpath("//input[@type='password']");
    By rememberCheckBox=By.xpath("//ins[@class='iCheck-helper']");
    By loginButton=By.xpath("//button[@type='submit']");

    public  LoginPage (WebDriver driver){
        this.driver=driver;  //this driver mean ,the driver which is define within the class
    }

    public void enterEmailAddress(String email)
    {
        driver.findElement(emailTextBox).sendKeys(email);
    }

    public void enterPassword(String password)
    {
        driver.findElement(passwordTextBox).sendKeys(password);
    }
    public void clickRemember()
    {
        driver.findElement(rememberCheckBox).click();
    }
    public void submitThelogin()
    {
        driver.findElement(loginButton).click();
    }

}
