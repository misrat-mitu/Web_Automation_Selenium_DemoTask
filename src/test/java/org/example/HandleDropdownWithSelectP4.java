package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class HandleDropdownWithSelectP4 extends DriverSetUp{

    @Test

    public void interactWithdropdown() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //Dropdown theke konokicu select korar jonno
        WebElement selectElement = driver.findElement(By.id("dropdown-class-example"));
        Select select = new Select(selectElement);

        //How to show something on screen
        System.out.println("Show Select Option: " + selectElement.isDisplayed());

        selectElement.click();          //select er fild click korar jonno
        select.selectByIndex(2);        //dropdown Joto number index select korte chai
        Thread.sleep(2000);

        //visible text diye kicu locate kore dropdown er option select kora
        select.selectByVisibleText("Option3");
        Thread.sleep(2000);

        //value diye dropdown er kicu select
        select.selectByValue("option1");
        Thread.sleep(2000);

        //Currently dropdown er ki selected ache seta dekhar jonno
        WebElement selected_option = select.getFirstSelectedOption();
        System.out.println("Another Option: " + selected_option.getText());


        //Dropdown e ki ki option ache shobgulo dekhar jonno
        List<WebElement> all_option = select.getOptions();
        System.out.println(all_option.size());             //kotogulo option ache seta dekhar jonno
        for (WebElement option : all_option){
            System.out.println(option.getText());
        }


        //deselect
//        select.deselectByValue("option1");
//        Thread.sleep(2000);
    }
}
