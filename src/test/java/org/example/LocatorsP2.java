package org.example;

//import com.sun.tools.javac.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorsP2 extends DriverSetUp{

    @Test
    public void testLocators() throws InterruptedException {

        driver.get("https://www.google.com");

        WebElement searchArea ;


        //ID diye locate kora
        //searchArea= driver.findElement(By.id("APjFqb"));

        //Name diye locate korar jonno
       // searchArea = driver.findElement(By.name("q"));

        //Tag Name
        //searchArea = driver.findElement(By.tagName("textarea"));

        //Class Name
        searchArea = driver.findElement(By.className("gLFyf"));

        //Kono kicu likhar jonno
        searchArea.sendKeys("Bangladesh");
        Thread.sleep(3000);
        searchArea.clear();
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //Partial Link Locate
        driver.findElement(By.partialLinkText("কীভাবে কাজ করে")).click();
        Thread.sleep(3000);

        driver.navigate().back();

        //Gmail Click
        driver.findElement(By.linkText("Gmail")).click();
        Thread.sleep(3000);



        /*
        searchArea = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        searchArea.sendKeys("Bangladesh");
        Thread.sleep(3000);

        //List<WebElement> childs = driver.findElements(By.xpath("//div[@class=\"KxwPGc AghGtd\"]/a"));

        List<WebElement> childes = driver.findElements(By.cssSelector("div[class=\"KxwPGc AghGtd\"]>a"));

        for (WebElement child: childes){
            System.out.println(child.getText());
        }
      */

    }
}
