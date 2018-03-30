package com.sanitas.aem.internet.seleniumtest.pageobjects;

import com.sanitas.aem.core.helper.TimeHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Screen11ContactSanitas  extends AbstractStepInternet {
    public Screen11ContactSanitas(WebDriver driver, TimeHelper timeHelper) {
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

    public void ClickOnContact(){

        driver.findElement(By.xpath("//div[3]/label")).click();
    }

    public void AndereAnliegen() {
        tagList = new String[]{"sanitas-modal", "sanitas-contact-wizard", "sanitas-cwizard-cards", "sanitas-teaser-mini[6]"};
        WebElement selectkAndereAnliegen = findWebElement(waitForElement(By.xpath("//body")), tagList);
        selectkAndereAnliegen.click();
    }

    public void halbprivateSelect(){
        tagList = new String[]{"sanitas-modal", "sanitas-contact-wizard", "div > div > iron-pages > div.iron-selected > sanitas-cwizard-form",
                "sanitas-cwizard-triage", "sanitas-cwizard-triage-full", "sanitas-form-radio-group", "paper-radio-button[2]"};
        WebElement clickhalbprivate = findWebElement(waitForElement(By.xpath("//body")),tagList);
        clickhalbprivate.click();
    }

    public void kontaktformularTeaser(){
        tagList= new String[]{"sanitas-modal", "sanitas-contact-wizard", "div > div > iron-pages > div.iron-selected > sanitas-cwizard-form", "sanitas-accordion"};
        WebElement clickkontaktformularTeaser = findWebElement(waitForElement(By.xpath("//body")),tagList);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", clickkontaktformularTeaser);
        clickkontaktformularTeaser.click();
        waitForScreenReadyStepSpecific();

        //fillCustomerNumberEntry
        tagList= new String[]{"sanitas-modal", "sanitas-contact-wizard", "div > div > iron-pages > div.iron-selected > sanitas-cwizard-form", "sanitas-form-input-text#Kundennummer"};
        WebElement fillkundennummer = findWebElement(waitForElement(By.xpath("//body")),tagList);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", fillkundennummer);
        fillkundennummer.sendKeys("3283581-9");

        //firstnameEntry
        tagList= new String[]{"sanitas-modal", "sanitas-contact-wizard", "div > div > iron-pages > div.iron-selected > sanitas-cwizard-form", "sanitas-form-input-text#Name"};
        WebElement firstname = findWebElement(waitForElement(By.xpath("//body")),tagList);
        firstname.sendKeys("Selenium");

        //lastnameEntry
        tagList= new String[]{"sanitas-modal", "sanitas-contact-wizard", "div > div > iron-pages > div.iron-selected > sanitas-cwizard-form", "sanitas-form-input-text#Vorname"};
        WebElement lastname = findWebElement(waitForElement(By.xpath("//body")),tagList);
        lastname.sendKeys("Test");

        //streetEntry
        tagList= new String[]{"sanitas-modal", "sanitas-contact-wizard", "div > div > iron-pages > div.iron-selected > sanitas-cwizard-form", "sanitas-form-input-text#strasse"};
        WebElement street = findWebElement(waitForElement(By.xpath("//body")),tagList);
        street.sendKeys("Testroot");

        //NrEntry
        tagList= new String[]{"sanitas-modal", "sanitas-contact-wizard", "div > div > iron-pages > div.iron-selected > sanitas-cwizard-form", "sanitas-form-input-text#nr"};
        WebElement Nr = findWebElement(waitForElement(By.xpath("//body")),tagList);
        Nr.sendKeys("11");

        //zipEntry
        tagList= new String[]{"sanitas-modal", "sanitas-contact-wizard", "div > div > iron-pages > div.iron-selected > sanitas-cwizard-form", "sanitas-form-input-text#plz"};
        WebElement zip = findWebElement(waitForElement(By.xpath("//body")),tagList);
        zip.sendKeys("8000");

        //ortEntry
        tagList= new String[]{"sanitas-modal", "sanitas-contact-wizard", "div > div > iron-pages > div.iron-selected > sanitas-cwizard-form", "sanitas-form-input-text#ort"};
        WebElement ort = findWebElement(waitForElement(By.xpath("//body")),tagList);
        ort.sendKeys("Testroot2");

        //telefonEntry
        tagList= new String[]{"sanitas-modal", "sanitas-contact-wizard", "div > div > iron-pages > div.iron-selected > sanitas-cwizard-form", "sanitas-form-phone-number"};
        WebElement telefon = findWebElement(waitForElement(By.xpath("//body")),tagList);
        telefon.sendKeys("781234567");

        //emailEntry
        tagList= new String[]{"sanitas-modal", "sanitas-contact-wizard", "div > div > iron-pages > div.iron-selected > sanitas-cwizard-form", "sanitas-form-input-text#email"};
        WebElement email = findWebElement(waitForElement(By.xpath("//body")),tagList);
        email.sendKeys("test@mail.com");

        //sendButton
        tagList= new String[]{"sanitas-modal", "sanitas-contact-wizard", "div > div > iron-pages > div.iron-selected > sanitas-cwizard-form", "sanitas-button", "button"};
        WebElement sendButton = findWebElement(waitForElement(By.xpath("//body")),tagList);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", sendButton);
        sendButton.click();
    }

}
