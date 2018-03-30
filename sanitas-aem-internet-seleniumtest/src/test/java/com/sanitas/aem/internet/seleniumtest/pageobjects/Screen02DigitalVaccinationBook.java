package com.sanitas.aem.internet.seleniumtest.pageobjects;

import com.sanitas.aem.core.helper.TimeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class Screen02DigitalVaccinationBook extends AbstractStepInternet {
    public Screen02DigitalVaccinationBook(WebDriver driver, TimeHelper timeHelper) {
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

    public void searchText(String input, int value) {
        driver.findElement(By.xpath("//nav/div/label")).click();

        tagList = new String[]{"sanitas-modal", "sanitas-search", "sanitas-form-search", "sanitas-form-input-text",
                "paper-input"};
        WebElement searchElement = findWebElement(waitForElement(By.xpath("//body")), tagList);
        searchElement.sendKeys(input);

        tagList = new String[]{"sanitas-modal", "sanitas-search", "sanitas-form-search", "sanitas-icon[1]"};
        searchElement = findWebElement(waitForElement(By.xpath("//body")), tagList);
        searchElement.click();

        tagList = new String[]{"sanitas-modal", "sanitas-search", "sanitas-search-list", "sanitas-search-result["+value+"]"};
        searchElement = findWebElement(waitForElement(By.xpath("//body")), tagList);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", searchElement);
        searchElement.click();
    }

    public void scrollByClassname(String s, WebDriver d) {
        WebElement element = d.findElement(By.className(s));
        ((JavascriptExecutor) d).executeScript("arguments[0].scrollIntoView();", element);

    }

    public void faqButton() {
        tagList = new String[]{"sanitas-button"};
        WebElement searchElement = findWebElement(waitForElement(By.xpath("//body")), tagList);
        searchElement.click();
    }

    public void faqByNav() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Kundenportal')])[3]"))).perform();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        action.moveToElement(driver.findElement(By.linkText("Digitales Impfbüchlein"))).click().build().perform();
        scrollByClassname("actionbutton", driver);
        faqButton();
    }
}
