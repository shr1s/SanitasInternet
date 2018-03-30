package com.sanitas.aem.internet.seleniumtest.testcases;

import com.relevantcodes.extentreports.LogStatus;
import com.sanitas.aem.core.helper.ReportHelper;

public class Test04FormRegistration extends ReusableSteps {

    @Override
    public String getTestName() {
        return "Test04FormRegistration (04)";
    }

    @Override
    public String getBasePath() {
        return getInternetBasePath();
    }

    @Override
    public void executeTest() {
        ReportHelper.getTest().log(LogStatus.UNKNOWN, "04.01 started - Form Registration");

        searchText("Kunden werben Kunden", 1);
        registrationForm.waitForScreenReady();
        driver.get("https://acc01-www.sanitas.com/de/index/privatkunden/services/spartipps/kunden-werben-kunden/mgm-sc.html");
        okButtonClick();
        scrollByCss("div.col-md-8");
        registrationForm.fillForm();
        registrationForm.waitForScreenReady();

        ReportHelper.getTest().log(LogStatus.PASS, "04.01 passed - Form Registration");
    }
}
