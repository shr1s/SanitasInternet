package com.sanitas.aem.internet.seleniumtest.testcases;

import com.relevantcodes.extentreports.LogStatus;
import com.sanitas.aem.core.helper.ReportHelper;
import com.sanitas.aem.internet.seleniumtest.pageobjects.Screen10RegisterForShwangershaftService;
import org.openqa.selenium.By;

public class Test10RegisterForShwangershaftService extends ReusableSteps {

    public String getTestName() {
        return "Test10RegisterForShwangershaftService (10)";
    }

    @Override
    public String getBasePath() {
        return getInternetBasePath();
    }

    @Override
    public void executeTest() {

        ReportHelper.getTest().log(LogStatus.UNKNOWN, "10.01 started - Registration For Schwangershaft");

        searchText("Schwangerschaft", 3);
        waitForScreenReadyStepSpecific();
        scrollByClassName("san-richtext");
        okButtonClick();
        waitForScreenReadyStepSpecific();
        driver.findElement(By.linkText("sanitas.com/schwangerschaft")).click();
        waitForScreenReadyStepSpecific();
        registerForShwangershaftService.fillForm1(Screen10RegisterForShwangershaftService.Anrede.FRAU, FIRST_NAME, LAST_NAME, ZIP, STREET, EMAIL);

        ReportHelper.getTest().log(LogStatus.PASS, "10.01 passed - Registration For Schwangershaft");
    }
}
