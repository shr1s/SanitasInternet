package com.sanitas.aem.internet.seleniumtest.testcases;

import com.relevantcodes.extentreports.LogStatus;
import com.sanitas.aem.core.helper.ReportHelper;

public class Test06HealthQuiz extends ReusableSteps {

    @Override
    public String getTestName() {
        return "Test06HealthQuiz (06)";
    }

    @Override
    public String getBasePath() {
        return getInternetBasePath();
    }

    @Override
    public void executeTest() {
        ReportHelper.getTest().log(LogStatus.UNKNOWN, "06.01 started - Health quiz");

        healthQuiz.alertStripeClose();
        healthQuiz.quizByNav();
        okButtonClick();
        healthQuiz.questionaire();

        ReportHelper.getTest().log(LogStatus.PASS, "06.01 passed - Health quiz");
    }
}
