package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class HandleWebAlertP4 extends DriverSetUp{

    @Test

    public void interactWithAlert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // Example-1: Click for JS Alert
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Thread.sleep(2000);

        //switch korar jonno
        Alert alert = driver.switchTo().alert();

        //Alert e ki message ache seta dekhar jonno
        String alertText = alert.getText();
        System.out.println(alertText);
        alert.accept();                        //jodi alert accept korte chai like ok/yes etc
        Thread.sleep(2000);


        // Example-2: Click for JS Confirm
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        Thread.sleep(2000);
        alertText = alert.getText();
        System.out.println(alertText);
        alert.dismiss();                     // cancle korar jonno
        Thread.sleep(2000);


        // Example-3: Click for JS Prompt
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        alertText = alert.getText();
        System.out.println(alertText);

        alert.sendKeys("Hello");           //Alert e kicu likhte chaile
        Thread.sleep(2000);

        alert.accept();
        Thread.sleep(2000);

    }
}
