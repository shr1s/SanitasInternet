package com.sanitas.aem.internet.seleniumtest.pageobjects;

import com.sanitas.aem.core.helper.TimeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.IOException;
import java.util.Set;
import java.util.Iterator;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Screen12PrintBenefitsOfMySupplementaryInsurance extends AbstractStepInternet{

    public Screen12PrintBenefitsOfMySupplementaryInsurance(WebDriver driver, TimeHelper timeHelper) {
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

    public void searchResult(String input){

        driver.findElement(By.xpath("//nav/div/label")).click();

        tagList = new String[]{"sanitas-modal", "sanitas-search", "sanitas-form-search", "sanitas-form-input-text",
                "paper-input"};
        WebElement searchElement = findWebElement(waitForElement(By.xpath("//body")), tagList);
        searchElement.sendKeys(input);

        tagList = new String[]{"sanitas-modal", "sanitas-search", "sanitas-form-search", "sanitas-icon[1]"};
        searchElement = findWebElement(waitForElement(By.xpath("//body")), tagList);
        searchElement.click();

        tagList = new String[]{"sanitas-modal", "sanitas-search", "sanitas-search-list","div > div > div:nth-child(3) > sanitas-search-result:nth-child(1)"};
        WebElement searchResult = findWebElement(waitForElement(By.xpath("//body")), tagList);
        searchResult.click();
        waitForScreenReadyStepSpecific();
    }
    public void printPage() throws AWTException, IOException, InterruptedException {

        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_P);
        r.keyRelease(KeyEvent.VK_P);
        r.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(5000);

        String subWindowHandler = null;
        Set<String> handles = driver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()){
            subWindowHandler = iterator.next();
        }
        driver.switchTo().window(subWindowHandler);

        // click print button
        WebElement printButton = driver.findElement(By.tagName("button"));
        printButton.click();
        Thread.sleep(2000);

        //download .pdf
        r.keyPress(KeyEvent.VK_T);
        r.keyRelease(KeyEvent.VK_T);
        r.keyPress(KeyEvent.VK_E);
        r.keyRelease(KeyEvent.VK_E);
        r.keyPress(KeyEvent.VK_PERIOD);
        r.keyRelease(KeyEvent.VK_PERIOD);
        r.keyPress(KeyEvent.VK_P);
        r.keyRelease(KeyEvent.VK_P);
        r.keyPress(KeyEvent.VK_D);
        r.keyRelease(KeyEvent.VK_D);
        r.keyPress(KeyEvent.VK_F);
        r.keyRelease(KeyEvent.VK_F);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
    }

    @Override
    public void waitForScreenReadyStepSpecific() {
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
