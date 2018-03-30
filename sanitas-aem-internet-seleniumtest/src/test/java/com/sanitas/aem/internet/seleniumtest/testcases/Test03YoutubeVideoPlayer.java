package com.sanitas.aem.internet.seleniumtest.testcases;

import com.relevantcodes.extentreports.LogStatus;
import com.sanitas.aem.core.helper.ReportHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Test03YoutubeVideoPlayer extends ReusableSteps {


    @Override
    public String getTestName() {
        return "Test03YoutubeVideoPlayer (03)";
    }

    @Override
    public String getBasePath() {
        return getInternetBasePath();
    }

    @Override
    public void executeTest() {
        ReportHelper.getTest().log(LogStatus.UNKNOWN, "03.01 started - Youtube Video Player");

        youtubeVideoPlayer.alertStripeClose();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("Unser Service"))).perform();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        action.moveToElement(driver.findElement(By.linkText("Spartipps"))).perform();
        action.moveToElement(driver.findElement(By.linkText("Prämienvergünstigung"))).click().build().perform();
        okButtonClick();
        scrollByCss("h4.accordion-title > span");
        driver.findElement(By.className("san-youtube__video-container")).click();

        ReportHelper.getTest().log(LogStatus.PASS, "03.01 passed - Youtube Video Player");

    }
}
