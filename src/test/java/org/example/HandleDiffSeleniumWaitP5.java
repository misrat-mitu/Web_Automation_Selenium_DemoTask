package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandleDiffSeleniumWaitP5 extends DriverSetUp{

    @Test
    public void testDelayElements() throws InterruptedException {
        driver.get("https://qavbox.github.io/demo/delay/");

        //Implicit Wait: Driver e jodi kono exception hoy tahole sei wait er jonno use kora hoy

        driver.findElement(By.xpath("//input[@name='commit1']")).click();
        //Thread.sleep(10000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement h2 = driver.findElement(By.xpath("//div[@id='oneMore']//h2"));
        System.out.println(h2.getText());
        driver.findElement(By.xpath("//input[@id='loaderStart']")).click();
        h2 = driver.findElement(By.xpath("//h2[@id='loaderdelay']"));
        System.out.println(h2.getText());


/*
        //Specific condition er jonno Explicit wait (Click me!)

        driver.findElement(By.xpath("//input[@name='commit']")).click();

        h2 = driver.findElement(By.xpath("//h2[@id='two']"));

        WebDriverWait wait = new WebDriverWait((WebDriver) driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElement(h2, "I am here!"));          //When khow the element
        System.out.println("Text: " + h2.getText());
*/


    // Another way when search locator and text/element

        driver.findElement(By.xpath("//input[@name='commit']")).click();

        WebDriverWait wait = new WebDriverWait((WebDriver) driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h2[@id='two']"),"I am here!"));
        System.out.println("Text: " + driver.findElement(By.xpath("//h2[@id='two']")).getText());

    }
}
