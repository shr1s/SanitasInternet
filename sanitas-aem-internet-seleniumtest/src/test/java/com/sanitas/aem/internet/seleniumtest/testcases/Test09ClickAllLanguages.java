package com.sanitas.aem.internet.seleniumtest.testcases;

import com.relevantcodes.extentreports.LogStatus;
import com.sanitas.aem.core.helper.ReportHelper;
import org.openqa.selenium.interactions.Actions;

public class Test09ClickAllLanguages extends ReusableSteps {

    @Override
    public String getTestName() {
        return "Test09ClickAllLanguages (09)";
    }

    @Override
    public String getBasePath() {
        return getInternetBasePath();
    }

    @Override
    public void executeTest() {
        ReportHelper.getTest().log(LogStatus.UNKNOWN, "08.01 started - All Languages");

        Actions action = new Actions(driver);
        //DE Language
        clickAllLanguages.sanitasLanguageTest("DE",action,"Unser Service","Unsere Leistungen","Schwangerschaft");
        okButtonClick();

        //FR Language
        clickAllLanguages.sanitasLanguageTest("FR",action,"Service","Nos prestations","Grossesse");

        //IT Language
        clickAllLanguages.sanitasLanguageTest("IT",action,"Servizi","Le nostre prestazioni","Gravidanza");

        //EN Language
        clickAllLanguages.sanitasLanguageTest("EN",action,"Services","What Sanitas offers","Alternative medicine");

        ReportHelper.getTest().log(LogStatus.PASS, "08.01 passed - All Languages");
    }
}
