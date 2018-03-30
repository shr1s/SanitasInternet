package com.sanitas.aem.internet.seleniumtest.testcases;

import com.relevantcodes.extentreports.LogStatus;
import com.sanitas.aem.core.helper.ReportHelper;

public class Test08WithoutJS extends ReusableSteps {

    @Override
    public String getTestName() {
        return "Test08WithoutJS (08)";
    }

    @Override
    public String getBasePath() {
        return getInternetBasePath();
    }

    @Override
    public void executeTest() {
        ReportHelper.getTest().log(LogStatus.UNKNOWN, "08.01 started - Without JS");

        withoutJS.withoutJS();

        ReportHelper.getTest().log(LogStatus.PASS, "08.01 passed - Without JS");

    }
}
