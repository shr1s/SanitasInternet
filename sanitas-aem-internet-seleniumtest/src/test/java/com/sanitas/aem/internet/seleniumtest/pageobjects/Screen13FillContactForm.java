package com.sanitas.aem.internet.seleniumtest.pageobjects;

import com.sanitas.aem.core.helper.TimeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.AWTException;

import java.lang.String;

public class Screen13FillContactForm extends AbstractStepInternet {
    public Screen13FillContactForm(WebDriver driver, TimeHelper timeHelper) {
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

    public void fillForm(){

        driver.findElement(By.id("Kundennummer")).sendKeys("3283581-9");
        driver.findElement(By.id("Name")).sendKeys("Test");
        driver.findElement(By.id("Vorname")).sendKeys("Selenium");
        driver.findElement(By.id("strasse")).sendKeys("Testr");
        driver.findElement(By.id("nr")).sendKeys("02");
        driver.findElement(By.id("plz")).sendKeys("8000");
        driver.findElement(By.id("ort")).sendKeys("testp");
        driver.findElement(By.id("Telefon")).sendKeys("781234567");
        driver.findElement(By.id("E_Mail")).sendKeys("test@mail.com");
        driver.findElement(By.id("Bemerkungen")).sendKeys("testing");

        tagList = new String[]{"sanitas-button", "button"};
        WebElement sendButton = findWebElement(waitForElement(By.xpath("//body")), tagList);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", sendButton);
        sendButton.click();

    }
}
