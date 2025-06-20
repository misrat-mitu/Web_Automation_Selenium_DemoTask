package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import javax.crypto.spec.PSource;

public class TestNGAnnotationsP6 {

    @Test(priority = 0)                        //for the test case priority [priority 0 means its more priority for first run, then 1,2,3.....]
    public void testCases2(){
        System.out.println("This is the A Normal Test Case 2");
    }

    @Test(priority = 1)
    public void testCases1(){
        System.out.println("This is the A Normal Test Case 1");
    }

    @BeforeMethod
    public void  beforeMethod (){
        System.out.println("This will execute before every Method");
    }

    @AfterMethod
    public void  afterMethod (){
        System.out.println("This will execute after every Method");
    }


    @BeforeClass
    public void beforeClass(){
        System.out.println("This will execute before the Class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("This will execute after the Class");
    }


    @BeforeTest
    public void beforeTest(){
        System.out.println("This will execute before the Test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("This will execute after the Test");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("This will execute before the Test Suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("This will execute after the Test Suite");
    }


    @Test
    public void testAssertion(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");
        driver.getTitle();
        Assert.assertEquals(driver.getTitle(),"Google");
        System.out.println("Test Done 1");
        Assert.assertTrue(true);           //Hard Assertion [It means jekhanei test failed hobe tar porer baki test case run hobe na]
        Assert.assertFalse(false);

        System.out.println("Test Done 2");

        //Soft Assert
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Send Keys");
        softAssert.assertEquals(1,1);

        System.out.println("Click on Element");
        softAssert.assertFalse(true);

        System.out.println("Visible");

        softAssert.assertTrue(true);
    }

}
