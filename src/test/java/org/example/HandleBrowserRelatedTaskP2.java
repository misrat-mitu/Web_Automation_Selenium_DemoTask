package org.example;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HandleBrowserRelatedTaskP2 extends DriverSetUp{

    @Test
    public void testBrowserTask() throws InterruptedException {
        driver.get("https://www.google.com");

        //kon site ta loaded ache seta dekhar jonno
        String title = driver.getTitle();
        System.out.println("Title:" + title);

        //if show the URL
        String url = driver.getCurrentUrl();
        System.out.println("URL:" + url);

        //Browser open er por browser say er time limit
        Thread.sleep(1000);

        //Browser Full screen,minimize,maximize vabe open korte chaile
        driver.manage().window().fullscreen();
        Thread.sleep(1000);

        driver.manage().window().minimize();
        Thread.sleep(1000);

        driver.manage().window().maximize();
        Thread.sleep(1000);

        //Navigate
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(1000);

        //Ek step back e gele ki hobe
        driver.navigate().back();
        Thread.sleep(1000);

        //Ek step shamne gele ki hobe
        driver.navigate().forward();
        Thread.sleep(1000);

        //Refresh
        driver.navigate().refresh();
        Thread.sleep(1000);

        //Create new Tab
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://whatsapp.com");

        //Create new window
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://youtube.com");

        //Suppose switch kore last amra youtube e ashchi then abr amk switch kore facebook e back korte hobe
        String tabHandle = driver.getWindowHandle();
        System.out.println("Insta:" + tabHandle);

        //Every site has a id like (Insta:5DA0CB1CD3F158A9EFA150F51F0AB1AE)
        //so eirokom id ekshathe shobgulo print korar jonno
        List<String> handles = new ArrayList<>(driver.getWindowHandles());
        for (String handle:handles){
            System.out.println(handle);
        }

        //current kon window te achi
        System.out.println("Before Switching:" + driver.getCurrentUrl());

        //first kono window te switch korte chaile
        driver.switchTo().window(handles.get(0));

        System.out.println("After Switching:" + driver.getCurrentUrl());

     /*
        driver.close();
        Thread.sleep(1000);
    */

        //driver.quit();

    }
}
