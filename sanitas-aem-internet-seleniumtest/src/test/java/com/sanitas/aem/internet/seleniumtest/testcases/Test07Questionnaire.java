package com.sanitas.aem.internet.seleniumtest.testcases;

import com.relevantcodes.extentreports.LogStatus;
import com.sanitas.aem.core.helper.ReportHelper;

public class Test07Questionnaire extends ReusableSteps {

    @Override
    public String getTestName() {
        return "Test07Questionnaire (07)";
    }

    @Override
    public String getBasePath() {
        return getInternetBasePath();
    }

    @Override
    public void executeTest() {
        ReportHelper.getTest().log(LogStatus.UNKNOWN, "06.01 started - Questionnaire");

        searchText("Psychische Balance", 1);
        questionnaire.waitForScreenReady();
        okButtonClick();
        registrationForm.waitForScreenReady();
        scrollByClassName("san-richtext");
        registrationForm.waitForScreenReady();
        questionnaire.questionaire();
        questionnaire.questionSet();

        ReportHelper.getTest().log(LogStatus.PASS, "06.01 passed - Questionnaire");
    }

}
