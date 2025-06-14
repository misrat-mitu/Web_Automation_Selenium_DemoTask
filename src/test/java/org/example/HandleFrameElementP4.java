package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleFrameElementP4 extends DriverSetUp{

    @Test

    public void interactWithFrameElement() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //driver.findElement(By.xpath("//legend[normalize-space()='iFrame Example']"));

        //driver.switchTo().frame("courses-iframe");         //id diye kora
        //driver.switchTo().frame("iframe-name");           // Name diye switch kora
        driver.switchTo().frame(0);                   //index diye switch

//        WebElement iframe = driver.findElement(By.id("courses-iframe"));        // web element diye switch kora
//        driver.switchTo().frame(iframe);


        driver.findElement(By.xpath("//a[normalize-space()='Register']"));

        driver.switchTo().defaultContent();                      //iframe theke ber howar jonno karon 14 no code jodi lasr e dile registration pay na

        driver.findElement(By.xpath("//legend[normalize-space()='iFrame Example']"));

    }
}
