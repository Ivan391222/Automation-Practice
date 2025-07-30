package org.ii.tests;

import org.ii.pages.HomePage;
import org.testng.annotations.Test;

public class testcase1openBrowser extends BaseTest{

    @Test
    public void openBrowser() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.navigateTo();
        //assertion?

        Thread.sleep(5000);

    }
}