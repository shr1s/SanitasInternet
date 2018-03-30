package com.sanitas.aem.internet.seleniumtest.pageobjects;

import com.sanitas.aem.core.helper.TimeHelper;
import org.openqa.selenium.WebDriver;

public class Screen08WithoutJS extends AbstractStepInternet {
    public Screen08WithoutJS(WebDriver driver, TimeHelper timeHelper) {
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

    public void withoutJS(){
        driver.get("https://acc01-www.sanitas.com/de/index/produkte.html");
    }
}
