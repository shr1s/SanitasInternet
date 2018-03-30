package com.sanitas.aem.internet.seleniumtest.testSuites;

import com.sanitas.aem.core.base.AemCoreBaseTest;
import com.sanitas.aem.core.helper.ReportHelper;
import com.sanitas.aem.internet.seleniumtest.testcases.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        Test01CalculatePremium.class,
        Test02DigitalVaccinationBook.class,
        Test03YoutubeVideoPlayer.class,
        Test04FormRegistration.class,
        Test05SanitasApp.class,
        Test06HealthQuiz.class,
        Test07Questionnaire.class,
        Test09ClickAllLanguages.class
})
public class InternetDETestSuite{

    @BeforeClass
    public static void setLanguageUrl() {
        System.setProperty(AemCoreBaseTest.PARAM_LANGUAGE, String.valueOf(AemCoreBaseTest.Language.DE));
    }
    @AfterClass
    public static void tearDown() {
        ReportHelper.getReports().flush();
        ReportHelper.getReports().close();
    }
}
