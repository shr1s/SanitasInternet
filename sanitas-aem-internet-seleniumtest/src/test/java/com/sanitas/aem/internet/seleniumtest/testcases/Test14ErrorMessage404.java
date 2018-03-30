package com.sanitas.aem.internet.seleniumtest.testcases;

import com.relevantcodes.extentreports.LogStatus;
import com.sanitas.aem.core.helper.ReportHelper;

public class Test14ErrorMessage404 extends ReusableSteps {

        @Override
        public String getTestName() {
            return "Test14ErrorMessage404 (14)";
        }

        @Override
        public String getBasePath() {
            return getInternetBasePath();
        }

        @Override
        public void executeTest() {

            ReportHelper.getTest().log(LogStatus.UNKNOWN, "14.01 started - ErrorMessage404");

            errorMessage404.startseitePramienrechner();

            ReportHelper.getTest().log(LogStatus.PASS, "14.01 passed - ErrorMessage404");
        }
    }