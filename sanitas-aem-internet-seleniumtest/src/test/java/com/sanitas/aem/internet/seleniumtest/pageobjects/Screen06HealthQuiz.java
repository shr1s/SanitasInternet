package com.sanitas.aem.internet.seleniumtest.pageobjects;

import com.sanitas.aem.core.helper.TimeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class Screen06HealthQuiz extends AbstractStepInternet {
    public Screen06HealthQuiz(WebDriver driver, TimeHelper timeHelper) {
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

    public void quizByNav(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("Unser Service"))).perform();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        action.moveToElement(driver.findElement(By.linkText("Aktuelles"))).perform();
        action.moveToElement(driver.findElement(By.linkText("Gesundheitsquiz"))).click().build().perform();
    }

    public void questionaire(){
        driver.get("https://acc01-www.sanitas.com/de/index/privatkunden/services/aktuelles/gesundheitsquiz.html");
        WebElement element = driver.findElement(By.className("container-wrapper"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        questionSet();
    }

    public void questionSet() {
        for(int i = 0; i <= 11; i++){
            if(i==0){
                WebElement element = driver.findElement(By.className("contentcontainer"));
                (  (JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
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
