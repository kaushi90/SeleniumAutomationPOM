package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookingDashboard {

    By carsBookingMenu=By.xpath("//a[@href='#Cars']");
    WebDriver driver=null;
    WebDriverWait wait;

    public  BookingDashboard (WebDriver driver){
        this.driver=driver;  //this driver mean ,the driver which is define within the class
    }

    public boolean avalabilityOfCarsMenu(){


        wait.until(ExpectedConditions.visibilityOfElementLocated(carsBookingMenu));
        Boolean result=false;
        result= driver.findElement(carsBookingMenu).isDisplayed();
        return result;

    }
}
