package com.sanitas.aem.internet.seleniumtest.pageobjects;

import com.sanitas.aem.core.helper.TimeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Screen04RegistrationForm extends AbstractStepInternet{
    public Screen04RegistrationForm(WebDriver driver, TimeHelper timeHelper) {
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

    public void fillForm() {
        tagList = new String[]{"sanitas-form-input-text", "paper-input"};
        WebElement searchElement = findWebElement(waitForElement(By.xpath("//body")), tagList);
        searchElement.sendKeys("38-04567-8");

        driver.findElement(By.id("Vorname-Bestandeskunde")).sendKeys("Silvia");
        driver.findElement(By.id("Nachname-Bestandeskunde")).sendKeys("pattern");
        driver.findElement(By.name("email-bestandeskunde")).sendKeys("agile-testing@sanitas.com");
        scrollByTagname("sanitas-form-multiform");

        searchElement = driver.findElement(By.tagName("sanitas-form-multiform"));
        searchElement = expandRootElement(searchElement);

        searchElement.findElement(By.id("Vorname-Neukunde")).sendKeys("Max");
        searchElement.findElement(By.id("Nachname-Neukunde")).sendKeys("pattern");
        searchElement.findElement(By.id("strasse-neukunde")).sendKeys("Musterstrasse");
        searchElement.findElement(By.id("nr_neukunde")).sendKeys("11");
        searchElement.findElement(By.id("plz-Neukunde")).sendKeys("8000");
        searchElement.findElement(By.id("ort-neukunde")).sendKeys("Zurich");
        searchElement.findElement(By.id("E-Mail-Neukunde")).sendKeys("agile-testing@sanitas.com");
        scrollByTagname("sanitas-button");

        tagList = new String[]{"sanitas-form-multiform", "sanitas-form-phone-number"};
        searchElement = findWebElement(waitForElement(By.xpath("//body")), tagList);
        searchElement.sendKeys("0787894567");

        scrollByTagname("sanitas-button");

        buttonClick();
    }
        public void buttonClick() {

        WebElement registerButton = driver.findElement(By.tagName("sanitas-button"));
        WebElement shadowRoot = expandRootElement(registerButton);
        shadowRoot.findElement(By.className("button")).click();
    }

    public void scrollByTagname(String ele){
        WebElement element = driver.findElement(By.tagName(ele));
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", element);
    }
}


