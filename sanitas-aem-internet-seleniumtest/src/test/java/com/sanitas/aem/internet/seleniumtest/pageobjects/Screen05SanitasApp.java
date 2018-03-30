package com.sanitas.aem.internet.seleniumtest.pageobjects;

import com.sanitas.aem.core.helper.TimeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Screen05SanitasApp extends AbstractStepInternet {
    public Screen05SanitasApp(WebDriver driver, TimeHelper timeHelper) {
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

    public void sanitasAppNav1(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("Unser Service"))).perform();
        action.moveToElement(driver.findElement(By.linkText("Online-Kundenservices"))).perform();
        action.moveToElement(driver.findElement(By.linkText("Sanitas App"))).click().build().perform();
    }

    public void sanitasAppNav2() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Kundenportal')])[3]"))).perform();
        action.moveToElement(driver.findElement(By.linkText("Digitales Impfbüchlein"))).click().build().perform();

        WebElement element2 = driver.findElement(By.xpath("//div[11]/div/div/div/div"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element2);

        driver.findElement(By.xpath("//img[@alt='Sanitas App']")).click();
        waitForScreenReady();
        String parentHandle = driver.getWindowHandle();
        driver.switchTo().window(parentHandle);
        driver.findElement(By.xpath("(//img[@alt='Sanitas App'])[2]")).click();
        waitForScreenReady();
        driver.switchTo().window(parentHandle);
    }

}

