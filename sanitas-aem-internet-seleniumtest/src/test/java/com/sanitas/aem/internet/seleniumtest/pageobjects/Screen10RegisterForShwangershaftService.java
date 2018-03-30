package com.sanitas.aem.internet.seleniumtest.pageobjects;

import com.sanitas.aem.core.helper.TimeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Screen10RegisterForShwangershaftService extends AbstractStepInternet{

    public Screen10RegisterForShwangershaftService(WebDriver driver, TimeHelper timeHelper) {
        super(driver, timeHelper);
        this.timeHelper = timeHelper;
    }

    public String getScreenId() {
        return null;
    }

    @Override
    public int getScreenNumber() {
        return 0;
    }
    public enum Anrede {
        FRAU(1), HERR(2);

        private int value;

        Anrede(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public void fillForm1(Anrede anred, String firstname, String lastname, String zip, String street, String email) {
        //AnredeSelect
        tagList = new String[]{"sanitas-form-dropdown-menu", "sanitas-form-dropdown-desktop", "input#dropDown"};
        WebElement dropdownElement = findWebElement(waitForElement(By.xpath("//body")), tagList);
        scrollByCss("body > div:nth-child(7)");
        dropdownElement.click();

        tagList = new String[]{"sanitas-form-dropdown-menu","sanitas-form-dropdown-desktop", "paper-item["+anred.getValue()+"]"};
        dropdownElement = findWebElement(waitForElement(By.xpath("//body")), tagList);
        dropdownElement.click();

        //FirstNameEntry
        tagList = new String[]{"sanitas-form-input-text#firstname", "paper-input#inputField"};
        WebElement firstnameElement = findWebElement(waitForElement(By.xpath("//body")), tagList);
        firstnameElement.sendKeys(firstname);

        //lastnameEntry
        tagList = new String[]{"sanitas-form-input-text#lastname", "paper-input#inputField"};
        WebElement lastnameElement = findWebElement(waitForElement(By.xpath("//body")), tagList);
        lastnameElement.sendKeys(lastname);

        //zipEntry
        tagList = new String[]{"sanitas-form-input-text#zip", "paper-input#inputField"};
        WebElement zipElement = findWebElement(waitForElement(By.xpath("//body")), tagList);
        zipElement.sendKeys(zip);

        //streetEntry
        tagList = new String[]{"sanitas-form-input-text#ort", "paper-input#inputField"};
        WebElement streetElement = findWebElement(waitForElement(By.xpath("//body")), tagList);
        streetElement.sendKeys(street);

        //phonenumber
        tagList = new String[]{"sanitas-form-phone-number", "input#ironinput"};
        WebElement phoneElement = findWebElement(waitForElement(By.xpath("//body")), tagList);
        phoneElement.sendKeys("781234567");

        //emailEntry
        tagList = new String[]{"sanitas-form-input-text#email","paper-input", "input#input-7"};
        WebElement emailElement = findWebElement(waitForElement(By.xpath("//body")), tagList);
        emailElement.sendKeys(email);

        //radioButton
        tagList = new String[]{"sanitas-form-radio-group","paper-radio-button[1]"};
        WebElement radioButton = findWebElement(waitForElement(By.xpath("//body")), tagList);
        radioButton.click();

        driver.findElement(By.tagName("sanitas-button")).click();

    }

    public void scrollByCss(String s) {
        WebElement element = driver.findElement(By.cssSelector(s));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void waitForScreenReadyStepSpecific() {
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
