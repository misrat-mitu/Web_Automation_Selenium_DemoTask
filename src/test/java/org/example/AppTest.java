package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class AppTest extends DriverSetUp {

    @Test
    public void testWebPageLoad() {
        driver.get("https://google.com");              //Open and Load the Browser
        System.out.println(driver.getCurrentUrl());
    }


    @Test
    public void testWebPageTitle() {
        driver.get("https://google.com");              //Open and Load the Browser
        System.out.println(driver.getTitle());

    }

}
/*
    public static void main(String[] args) {
        //New Browser Open
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");              //Open and Load the Browser
        //Close Browser
        driver.close();
    }
*/


