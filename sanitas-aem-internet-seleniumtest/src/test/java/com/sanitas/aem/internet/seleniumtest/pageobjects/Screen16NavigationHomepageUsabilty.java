package com.sanitas.aem.internet.seleniumtest.pageobjects;

import com.sanitas.aem.core.helper.TimeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Screen16NavigationHomepageUsabilty extends AbstractStepInternet{
    public Screen16NavigationHomepageUsabilty(WebDriver driver, TimeHelper timeHelper) {
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

    public void teaserArticle(){
        plusButton();
        closeButton();
        waitTillLoad();
        leftShiftArrow();
        waitTillLoad();
        plusButton();
        closeButton();
        waitTillLoad();
        leftShiftArrow();
        waitTillLoad();
        plusButton();
        driver.navigate().back();
        waitTillLoad();
        rightShiftArrow();
        waitTillLoad();
        plusButton();
        closeButton();
        waitTillLoad();
        rightShiftArrow();
        waitTillLoad();
        plusButton();
        driver.navigate().back();
        waitTillLoad();

    }

        public void plusButton(){

            tagList = new String[]{"sanitas-circular-nav-master-container", "sanitas-circular-nav-mask", "sanitas-icon-button#actionButton"};
            WebElement selectPlusButoon = findWebElement(waitForElement(By.xpath("//body")),tagList);
            selectPlusButoon.click();
        }
        public void closeButton(){

            tagList = new String[]{"sanitas-circular-nav-master-container", "sanitas-circular-nav-detail-view", "sanitas-icon-button#closeButton"};
            WebElement selectCloseButoon = findWebElement(waitForElement(By.xpath("//body")),tagList);
            selectCloseButoon.click();
        }
        public void leftShiftArrow(){

            tagList = new String[]{"sanitas-circular-nav-master-container", "div.button-left "};
            WebElement selectCloseButoon = findWebElement(waitForElement(By.xpath("//body")),tagList);
            selectCloseButoon.click();
        }
        public void rightShiftArrow() {

            tagList = new String[]{"sanitas-circular-nav-master-container", "div.button-right "};
            WebElement selectCloseButoon = findWebElement(waitForElement(By.xpath("//body")), tagList);
            selectCloseButoon.click();
        }
        public void waitTillLoad()
        {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        public void closeOvpEntry(){

            tagList = new String[]{"sanitas-ovp-alert", "sanitas-alert-stripe","sanitas-icon#icon-close"};
            WebElement selectCloseButoon = findWebElement(waitForElement(By.xpath("//body")), tagList);
            selectCloseButoon.click();

    }

}
