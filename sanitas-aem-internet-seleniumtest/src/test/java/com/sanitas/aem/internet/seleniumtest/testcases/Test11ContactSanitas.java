package com.sanitas.aem.internet.seleniumtest.testcases;

import com.relevantcodes.extentreports.LogStatus;
import com.sanitas.aem.core.helper.ReportHelper;

public class Test11ContactSanitas extends ReusableSteps  {
   @Override
    public String getTestName() {
        return "Test11ContactSanitas (11)";
    }

    @Override
    public String getBasePath() {
        return getInternetBasePath();
    }


    public void executeTest(){

        ReportHelper.getTest().log(LogStatus.UNKNOWN, "11.01 started - Contact sanitas");

        contactSanitas.ClickOnContact();
        contactSanitas.AndereAnliegen();
        waitForScreenReadyStepSpecific();
        contactSanitas.halbprivateSelect();
        contactSanitas.kontaktformularTeaser();

        ReportHelper.getTest().log(LogStatus.PASS, "11.01 passed - Contact sanitas");
    }
}
