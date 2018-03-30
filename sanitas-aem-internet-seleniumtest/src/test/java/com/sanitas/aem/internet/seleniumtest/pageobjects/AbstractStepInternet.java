package com.sanitas.aem.internet.seleniumtest.pageobjects;

import com.sanitas.aem.core.base.AbstractStep;
import com.sanitas.aem.core.helper.TimeHelper;
import org.openqa.selenium.WebDriver;

public abstract class AbstractStepInternet extends AbstractStep {

    public AbstractStepInternet(WebDriver driver, TimeHelper timeHelper) {

        super(driver, timeHelper);
    }
}
