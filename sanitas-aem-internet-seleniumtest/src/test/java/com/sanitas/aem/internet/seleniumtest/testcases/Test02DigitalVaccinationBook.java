package com.sanitas.aem.internet.seleniumtest.testcases;

import com.relevantcodes.extentreports.LogStatus;
import com.sanitas.aem.core.helper.ReportHelper;

public class Test02DigitalVaccinationBook extends ReusableSteps {

    @Override
    public String getTestName() {
        return "test02DigitalVaccinationBook (02)";
    }

    @Override
    public String getBasePath() {
        return getInternetBasePath();
    }

    @Override
    public void executeTest() {
        ReportHelper.getTest().log(LogStatus.UNKNOWN, "02.01 started - Digitale Vaccination Book");

        searchText("Digitales Impfbüchlein", 1);
        digitalVaccinationBook.waitForScreenReady();
        okButtonClick();
        scrollByClassName("actionbutton");
        digitalVaccinationBook.waitForScreenReady();
        digitalVaccinationBook.faqButton();
        digitalVaccinationBook.waitForScreenReady();
        digitalVaccinationBook.faqByNav();

        ReportHelper.getTest().log(LogStatus.PASS, "02.01 passed - Digitale Vaccination Book");
    }
}
