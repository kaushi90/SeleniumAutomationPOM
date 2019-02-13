package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookingDashboard {

    By carsBookingMenu=By.xpath("//ul[@id='Hotels']");
    WebDriver driver=null;

    public  BookingDashboard (WebDriver driver){
        this.driver=driver;  //this driver mean ,the driver which is define within the class
    }

    public boolean avalabilityOfCarsMenu(){

        Boolean result=false;
        result= driver.findElement(carsBookingMenu).isDisplayed();
        return result;

    }
}
