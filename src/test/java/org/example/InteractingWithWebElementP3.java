package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class InteractingWithWebElementP3 extends DriverSetUp{

    @Test

    public void interactWithElement() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement head = driver.findElement(By.xpath("//h1[normalize-space()='Practice Page']"));

        String headText = head.getText();             //Head er moddhe ki text ache seta dekhar jonno
        System.out.println(headText);

        //kono clickable element click korar jonno (ex:RadioButton)
        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='radio2']"));
        radioButton2.click();
        Thread.sleep(1000);

/*
        //Kono blank field e kicu likhar jonno(ex:form er first name,email etc)
        driver.findElement(By.cssSelector("#name")).sendKeys("SQA Batch-31");
        Thread.sleep(3000);

        //Fiest ei field e kicu likha ache seta clear kore abr likhar jonno

        driver.findElement(By.cssSelector("#name")).clear();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#name")).sendKeys("Misrat Jahan");
        Thread.sleep(3000);
*/

        //Bar bar select na kore ekbare variable declear kore select kora
        WebElement name = driver.findElement(By.cssSelector("#name"));
        name.sendKeys("SQA Batch-31");
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("#name")).clear();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#name")).sendKeys("Misrat Jahan");
        Thread.sleep(2000);

        //Attribute diye value ber kora
        String placeholder_text = name.getAttribute("placeholder");
        System.out.println(placeholder_text);

        //CSS Element diye value dekhar jonno
        WebElement OpenTab = driver.findElement(By.cssSelector("#opentab"));
        String color = OpenTab.getCssValue("background-color");
        System.out.println(color);

        //Kono element selected ache kina seta dekhar jonno
        WebElement radioButton1 = driver.findElement(By.cssSelector("input[value='radio1']"));
        System.out.println("Button1: " + radioButton1.isSelected());
        System.out.println("Button2: " + radioButton2.isSelected());

        //Displayed er jonno
        WebElement show_hide_box = driver.findElement(By.xpath("//input[@id='displayed-text']"));
        System.out.println("Displayed: " + show_hide_box.isDisplayed());

        driver.findElement(By.cssSelector("#hide-textbox")).click();
        System.out.println("When click hide: " + show_hide_box.isDisplayed());

        //kono element enable ache kina
        WebElement Check_box_option = driver.findElement(By.id("checkBoxOption1"));
        System.out.println("CheckBox State: " + Check_box_option.isEnabled());
        
    }
}
