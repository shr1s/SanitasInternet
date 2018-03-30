package com.sanitas.aem.internet.seleniumtest.pageobjects;

import com.sanitas.aem.core.helper.TimeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class Screen09ClickAllLanguages extends AbstractStepInternet {
    String DE_INTERNET_PAGEURL = "/de/index/privatkunden.html";
    String FR_INTERNET_PAGEURL = "/fr/index/privatkunden.html";
    String IT_INTERNET_PAGEURL = "/it/index/privatkunden.html";
    String EN_INTERNET_PAGEURL = "/en/index/privatkunden.html";
    public Screen09ClickAllLanguages(WebDriver driver, TimeHelper timeHelper) {
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

    public void sanitasLanguageTest( String lang, Actions action, String ele1, String ele2, String ele3) {
        String baseurl = "https://acc01-www.sanitas.com";
        switch (lang){
            case "DE":
                lang=DE_INTERNET_PAGEURL;
                break;
            case "FR":
                lang=FR_INTERNET_PAGEURL;
                break;
            case "IT":
                lang=IT_INTERNET_PAGEURL;
                break;
            case "EN":
                lang=EN_INTERNET_PAGEURL;
                break;
        }
        driver.get(baseurl + "" + lang);
        action.moveToElement(driver.findElement(By.linkText(ele1))).perform();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        action.moveToElement(driver.findElement(By.linkText(ele2))).perform();
        action.moveToElement(driver.findElement(By.linkText(ele3))).click().build().perform();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
}
