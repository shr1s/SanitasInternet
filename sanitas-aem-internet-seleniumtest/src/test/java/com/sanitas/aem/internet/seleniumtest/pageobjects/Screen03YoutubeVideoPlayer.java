package com.sanitas.aem.internet.seleniumtest.pageobjects;

import com.sanitas.aem.core.helper.TimeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Screen03YoutubeVideoPlayer extends AbstractStepInternet{
    public Screen03YoutubeVideoPlayer(WebDriver driver, TimeHelper timeHelper) {
        super(driver, timeHelper);
        this.timeHelper = timeHelper;
    }
    @Override
    public String getScreenId() {
        return null;
    }

    @Override
    public int getScreenNumber() {
        return 0;
    }

    public void alertStripeClose(){
        tagList= new String[]{"sanitas-ovp-alert", "sanitas-alert-stripe", "sanitas-icon"};
        WebElement searchElement = findWebElement(waitForElement(By.xpath("//body")),tagList);
        searchElement.click();
    }

    public void scrollByCss(String s) {
        WebElement element = driver.findElement(By.cssSelector(s));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }
}
