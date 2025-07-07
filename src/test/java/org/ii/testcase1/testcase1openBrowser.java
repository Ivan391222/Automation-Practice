package org.ii.testcase1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase1openBrowser {

    @Test
    public void openBrowser() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("http://training.skillo-bg.com:4300");
        Thread.sleep(1300);

        driver.quit();
    }
}