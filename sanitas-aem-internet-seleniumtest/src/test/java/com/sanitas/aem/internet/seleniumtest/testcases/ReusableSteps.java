package com.sanitas.aem.internet.seleniumtest.testcases;

import com.relevantcodes.extentreports.LogStatus;
import com.sanitas.aem.core.helper.ReportHelper;
import com.sanitas.aem.internet.seleniumtest.InternetBaseTest;

public abstract class ReusableSteps extends InternetBaseTest {
    protected static final String PHONE = "781234567";
    protected static final String EMAIL = "test@mail.com";
    protected static final String STREET = "Testweg";
    protected static final String NR = "99";
    protected static final String ZIP = "8001";
    protected static final String FIRST_NAME = "Selenium";
    protected static final String LAST_NAME = "Test";

    protected void okButtonClick() {
        ReportHelper.getTest().log(LogStatus.UNKNOWN, "started - okButton");
        calculatePremium.okButton();
        ReportHelper.getTest().log(LogStatus.PASS, "passed - okButton");
    }

    protected void scrollByClassName(String element) {
        ReportHelper.getTest().log(LogStatus.UNKNOWN, "started - scrollByClassName");
        calculatePremium.scrollByClassname(element);
        ReportHelper.getTest().log(LogStatus.PASS, "passed - scrollByClassName");
    }

    protected void scrollByCss(String element) {
        ReportHelper.getTest().log(LogStatus.UNKNOWN, "started - scrollByCss");
        youtubeVideoPlayer.scrollByCss(element);
        ReportHelper.getTest().log(LogStatus.PASS, "passed - scrollByCss");
    }

    protected void searchText(String input, int value) {
        ReportHelper.getTest().log(LogStatus.UNKNOWN, "started - searchText");
        digitalVaccinationBook.searchText(input, value);
        ReportHelper.getTest().log(LogStatus.PASS, "passed - searchText");
    }

    public void waitForScreenReadyStepSpecific() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
