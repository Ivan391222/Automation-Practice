package org.ii.testcase1;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    private final String SCREENSHOTS_DIR = "screenshots/";

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            takeScreenshot(result);
        }
        if (driver != null) {
            driver.quit();
        }
    }

    void takeScreenshot(ITestResult testResult) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File screenshot = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String testName = testResult.getName();
        try {
            FileUtils.copyFile(screenshot, new File(SCREENSHOTS_DIR + testName + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    }


//    @AfterMethod(alwaysRun = true);
//
//    public void tearDown(ITestResult testResult) throws IOException {
//        takeScreenshot(testResult);
//        log.info("Bye bye driver");
//        driver.quit();
//    }
//
//    private void takeScreenshot(ITestResult testResult) throws IOException {
//        if (ITestResult.FAILURE == testResult.getStatus()) {
//            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//            File screenshot = takesScreenshot.getScreenshotAs(OutputType.FILE);
//            String testName = testResult.getName();
//
//            FileUtils.copyFile(screenshot, new File(SCREENSHOTS_DIR.concat(testName).concat(".jpg")));
//
//        }

