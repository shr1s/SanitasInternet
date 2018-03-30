package com.sanitas.aem.internet.seleniumtest.testcases;

import com.relevantcodes.extentreports.LogStatus;
import com.sanitas.aem.core.helper.ReportHelper;

public class Test05SanitasApp extends ReusableSteps {

    @Override
    public String getTestName() {
        return "Test05SanitasApp (05)";
    }

    @Override
    public String getBasePath() {
        return getInternetBasePath();
    }

    @Override
    public void executeTest() {
        ReportHelper.getTest().log(LogStatus.UNKNOWN, "05.01 started - Sanitas App");

        sanitasApp.alertStripeClose();
        sanitasApp.sanitasAppNav1();
        okButtonClick();
        sanitasApp.sanitasAppNav2();

        ReportHelper.getTest().log(LogStatus.PASS, "05.01 passed - Sanitas App");
    }
}
