package com.sanitas.aem.internet.seleniumtest.pageobjects;

import com.sanitas.aem.core.helper.TimeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Screen07Questionnaire extends AbstractStepInternet {
    public Screen07Questionnaire(WebDriver driver, TimeHelper timeHelper) {
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

    public void scrollByClassname(String s) {
        WebElement element = driver.findElement(By.className(s));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void questionaire(){
        driver.get("https://acc01-www.sanitas.com/content/sanitas-internet/main/de/index/privatkunden/services/gesundheitsprogramme/psychischebalance/onlinefragebogen.html#contentpar_contentcontainer");
        scrollByClassname("san-row");
    }
    public  void questionSet() {
        for (int i = 0; i <= 11; i++) {
            if (i == 0) {
                WebElement element = driver.findElement(By.tagName("sanitas-quiz"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
            }
            answerQuestions(i);
        }
    }

    public void answerQuestions(int i){
        tagList = new String[]{"sanitas-quiz", "sanitas-form-radio-group#question"+i, "paper-radio-button"};
        WebElement searchElement = findWebElement(waitForElement(By.xpath("//body")), tagList);
        searchElement.click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        tagList = new String[]{"sanitas-quiz", "sanitas-button"};
        searchElement = findWebElement(waitForElement(By.xpath("//body")), tagList);
        searchElement.click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
}
