package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleDifferentActionsP5 extends DriverSetUp{

    @Test
    public void testActions() throws InterruptedException {

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Actions actions = new Actions(driver);

/*
//Scroll down korar jonno (Amount diye)
//        actions.scrollByAmount(0,1000).build().perform();
//        Thread.sleep(3000);


//Kono Specific element porjonto Scroll korar jonno
        WebElement el = driver.findElement(By.xpath("//legend[normalize-space()='Mouse Hover Example']"));
        actions.scrollToElement(el).build().perform();
        Thread.sleep(3000);
*/

//Mouse Hover kivabe kore

        actions.scrollByAmount(0,1000).build().perform();
        actions.moveToElement(driver.findElement(By.xpath("//button[@id='mousehover']"))).build().perform();

//Scroll down kore abe back korar jonno 34 ei 1 line
        actions.scrollToElement(driver.findElement(By.xpath("//legend[normalize-space()='Suggession Class Example']"))).build().perform();

        //Kono box e kicu likhar jonno
        WebElement el = driver.findElement(By.xpath("//input[@id='autocomplete']"));
        el.sendKeys("Bangladesh");
        Thread.sleep(3000);

        //Suppose kono textbox e"Bangladesh" likha copy korar jonno
        actions.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
        Thread.sleep(3000);

        //Likha ta Cut korte chaile
        actions.keyDown(Keys.CONTROL).sendKeys("x").build().perform();
        Thread.sleep(3000);

        //Anywhere Paste korar jonno
        el = driver.findElement(By.xpath("//input[@id='name']"));
        actions.click().keyDown(Keys.CONTROL).sendKeys("v").build().perform();
        Thread.sleep(3000);

        
    }
}
