package com.testsuite.login;

import com.pages.BookingDashboard;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestClassTwo {
    static SoftAssert soft = new SoftAssert(); //use soft assets here

    @Test(priority = 1, enabled = true)
    public void checkElement()
    {
        System.out.println("Paralla running");
        WebDriverInstance ff=new WebDriverInstance();
        BookingDashboard booking=new BookingDashboard(ff.browserset());
        soft.assertEquals(booking.avalabilityOfCarsMenu(),"false");
    }

}
