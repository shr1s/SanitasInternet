package com.sanitas.aem.internet.seleniumtest.pageobjects;

import com.sanitas.aem.core.helper.TimeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Screen01CalculatePremium extends AbstractStepInternet {

    public Screen01CalculatePremium(WebDriver driver, TimeHelper timeHelper) {
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

    public void fillForm(String zip, String birthDate, String gender, String type) {
        if (type == "search") {
            tagList = new String[]{"sanitas-com-ovp-entry", "sanitas-form-zipchooser", "sanitas-form-zipchooser-legacy",
                    "sanitas-form-input-text"};
            WebElement zipElement = findWebElement(waitForElement(By.xpath("//body")), tagList);
            zipElement.sendKeys(zip);

            //click first element in dropdown
            tagList = new String[]{"sanitas-com-ovp-entry", "sanitas-form-zipchooser", "sanitas-form-zipchooser-legacy", "paper-item[1]"};
            WebElement chooseZipElement = findWebElement(waitForElement(By.xpath("//body")), tagList);
            chooseZipElement.click();

            //fill birth date
            tagList = new String[]{"sanitas-com-ovp-entry", "sanitas-form-input-date"};
            WebElement personBirthDateField = findWebElement(waitForElement(By.xpath("//body")), tagList);
            setAttributeValue(personBirthDateField, "value", "01.02.1980");
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }

            if (gender.equals("male")) {
                tagList = new String[]{"sanitas-com-ovp-entry", "sanitas-form-gender-chooser", "div.male"};
            } else {
                tagList = new String[]{"sanitas-com-ovp-entry", "sanitas-form-gender-chooser", "div.female"};
            }
            WebElement genderElement = findWebElement(waitForElement(By.xpath("//body")), tagList);
            genderElement.click();

            tagList = new String[]{"sanitas-com-ovp-entry", "sanitas-button", "button"};
            WebElement nextButton = findWebElement(waitForElement(By.xpath("//body")), tagList);
            nextButton.click();

        } else if (type == "nav") {
            Actions action = new Actions(driver);
            action.moveToElement(driver.findElement(By.linkText("Produkte"))).perform();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            action.moveToElement(driver.findElement(By.linkText("Spitalversicherungen"))).perform();
            action.moveToElement(driver.findElement(By.linkText("Spital Halbprivat"))).click().build().perform();
            okButton();
            scrollByClassname("reference");

            tagList = new String[]{"sanitas-com-ovp-entry", "sanitas-form-zipchooser", "sanitas-form-zipchooser-legacy",
                    "sanitas-form-input-text"};
            WebElement zipElement = findWebElement(waitForElement(By.xpath("//body")), tagList);
            zipElement.sendKeys(zip);

            //click first element in dropdown
            tagList = new String[]{"sanitas-com-ovp-entry", "sanitas-form-zipchooser", "sanitas-form-zipchooser-legacy", "paper-item[1]"};
            WebElement chooseZipElement = findWebElement(waitForElement(By.xpath("//body")), tagList);
            chooseZipElement.click();

            //fill birth date
            tagList = new String[]{"sanitas-com-ovp-entry", "sanitas-form-input-date"};
            WebElement personBirthDateField = findWebElement(waitForElement(By.xpath("//body")), tagList);
            setAttributeValue(personBirthDateField, "value", "01.02.1980");
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }

            if (gender.equals("male")) {
                tagList = new String[]{"sanitas-com-ovp-entry", "sanitas-form-gender-chooser", "div.male"};
            } else {
                tagList = new String[]{"sanitas-com-ovp-entry", "sanitas-form-gender-chooser", "div.female"};
            }
            WebElement genderElement = findWebElement(waitForElement(By.xpath("//body")), tagList);
            genderElement.click();

            tagList = new String[]{"sanitas-com-ovp-entry", "sanitas-button", "button"};
            WebElement nextButton = findWebElement(waitForElement(By.xpath("//body")), tagList);
            nextButton.click();
        } else {
            tagList = new String[]{"sanitas-ovp-alert", "sanitas-com-ovp-entry", "sanitas-form-zipchooser", "sanitas-form-zipchooser-legacy",
                    "sanitas-form-input-text"};
            WebElement zipElement = findWebElement(waitForElement(By.xpath("//body")), tagList);
            zipElement.sendKeys(zip);

            //click first element in dropdown
            tagList = new String[]{"sanitas-ovp-alert", "sanitas-com-ovp-entry", "sanitas-form-zipchooser", "sanitas-form-zipchooser-legacy", "paper-item[1]"};
            WebElement chooseZipElement = findWebElement(waitForElement(By.xpath("//body")), tagList);
            chooseZipElement.click();

            //fill birth date
            tagList = new String[]{"sanitas-ovp-alert", "sanitas-com-ovp-entry", "sanitas-form-input-date"};
            WebElement personBirthDateField = findWebElement(waitForElement(By.xpath("//body")), tagList);
            setAttributeValue(personBirthDateField, "value", "01.02.1980");
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }

            if (gender.equals("male")) {
                tagList = new String[]{"sanitas-ovp-alert", "sanitas-com-ovp-entry", "sanitas-form-gender-chooser", "div.male"};
            } else {
                tagList = new String[]{"sanitas-ovp-alert", "sanitas-com-ovp-entry", "sanitas-form-gender-chooser", "div.female"};
            }
            WebElement genderElement = findWebElement(waitForElement(By.xpath("//body")), tagList);
            genderElement.click();

            tagList = new String[]{"sanitas-ovp-alert", "sanitas-com-ovp-entry", "sanitas-button", "button"};
            WebElement nextButton = findWebElement(waitForElement(By.xpath("//body")), tagList);
            nextButton.click();
        }
    }

    public void okButton() {
        tagList = new String[]{"sanitas-cookie-alert", "sanitas-button", "button"};
        WebElement searchElement = findWebElement(waitForElement(By.xpath("//body")), tagList);
        searchElement.click();
    }

    public void scrollByClassname(String s) {
        WebElement element = driver.findElement(By.className(s));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void changeToSanitasOVPTab() {
        Set<String> tabHandle = driver.getWindowHandles();
        for (String eachHandle : tabHandle) {
            driver.switchTo().window(eachHandle);
            if (driver.getTitle().equals("Sanitas OVP")) {
                break;
            }
        }
    }

    public void changeToPreviousTab() {
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }
}
