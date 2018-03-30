package com.sanitas.aem.internet.seleniumtest.pageobjects;

import com.sanitas.aem.core.helper.TimeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Screen14ErrorMessage404 extends AbstractStepInternet {
    public Screen14ErrorMessage404(WebDriver driver, TimeHelper timeHelper) {
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

    public void startseitePramienrechner() {

        driver.get("https://acc01-www.sanitas.com/testli");
        driver.findElement(By.cssSelector("body > div.contentcontainer > div > div > div:nth-child(2) > div:nth-child(1) > sanitas-button:nth-child(2)")).click();
        driver.navigate().back();
        tagList = new String[]{"sanitas-button[2]", "button"};
        WebElement praemienrechnerButton = findWebElement(waitForElement(By.xpath("//body")), tagList);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", praemienrechnerButton);
        praemienrechnerButton.click();
    }
}
