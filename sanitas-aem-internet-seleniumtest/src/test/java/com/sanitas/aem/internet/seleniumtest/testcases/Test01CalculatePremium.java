package com.sanitas.aem.internet.seleniumtest.testcases;

import com.relevantcodes.extentreports.LogStatus;
import com.sanitas.aem.core.helper.ReportHelper;

public class Test01CalculatePremium extends ReusableSteps {
    String type;

    @Override
    public String getTestName() {
        return "test01CalculatePremium (01)";
    }

    @Override
    public String getBasePath() {
        return getInternetBasePath();
    }

    @Override
    public void executeTest() {
        ReportHelper.getTest().log(LogStatus.UNKNOWN, "01.01 started - Calculate Premium");

        type="ovpIndex";
        calculatePremium.fillForm("8000" , "01.02.1980" , "male" , type);
        calculatePremium.changeToSanitasOVPTab();
        calculatePremium.waitForScreenReady();
        calculatePremium.changeToPreviousTab();

//        By navigation
        type="nav";
        calculatePremium.fillForm("8000" , "01.02.1980" , "male" , type);
        calculatePremium.changeToSanitasOVPTab();
        calculatePremium.waitForScreenReady();
        calculatePremium.changeToPreviousTab();

        driver.navigate().back();

//        By search
        searchText("Prämienrechner", 1);
        calculatePremium.waitForScreenReady();
        type="search";
        calculatePremium.fillForm("8000" , "01.02.1980" , "male" , type);
        calculatePremium.changeToSanitasOVPTab();
        calculatePremium.waitForScreenReady();
        calculatePremium.changeToPreviousTab();

        ReportHelper.getTest().log(LogStatus.PASS, "01.01 passed - Calculate Premium");
    }
}

