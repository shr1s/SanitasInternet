package com.sanitas.aem.internet.seleniumtest.testcases;

import com.relevantcodes.extentreports.LogStatus;
import com.sanitas.aem.core.helper.ReportHelper;

public class Test12PrintBenefitsOfMySupplementaryInsurance extends  ReusableSteps {

    public String getTestName() {
        return "Test12PrintBenefitsOfMySupplementaryInsurance (12)";
    }

    @Override
    public String getBasePath() {
        return getInternetBasePath();
    }

    @Override
    public void executeTest(){

        ReportHelper.getTest().log(LogStatus.UNKNOWN, "12.01 started - Print Supplementary Benefits");
        waitForScreenReadyStepSpecific();
        printBenefitsOfMySupplementaryInsurance.searchResult("family");
        okButtonClick();
        waitForScreenReadyStepSpecific();
        try {
            printBenefitsOfMySupplementaryInsurance.printPage();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        ReportHelper.getTest().log(LogStatus.PASS, "12.01 passed - Print Supplementary Benefits");
    }
}
