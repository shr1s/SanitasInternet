package com.sanitas.aem.internet.seleniumtest.testcases;

import com.relevantcodes.extentreports.LogStatus;
import com.sanitas.aem.core.helper.ReportHelper;

public class Test13FillContactForm extends ReusableSteps {

    String type;

    @Override
    public String getTestName() {
        return "Test13FillContactForm (13)";
    }

    @Override
    public String getBasePath() {
        return getInternetBasePath();
    }

    @Override
    public void executeTest() {

        ReportHelper.getTest().log(LogStatus.UNKNOWN, "13.01 started - Fill Contact Form");

        driver.get("https://acc01-www.sanitas.com/en/index/ueber-sanitas/kontakt/kontaktformulare/kontaktformular.html");
        okButtonClick();
        waitForScreenReadyStepSpecific();
        fillcontactform.fillForm();

        ReportHelper.getTest().log(LogStatus.PASS, "13.01 passed - Fill Contact Form\"");
    }
}
