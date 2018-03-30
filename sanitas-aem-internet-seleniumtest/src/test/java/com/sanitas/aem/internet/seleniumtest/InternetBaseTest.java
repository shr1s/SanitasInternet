package com.sanitas.aem.internet.seleniumtest;

import com.sanitas.aem.core.base.AemCoreBaseTest;
import com.sanitas.aem.internet.seleniumtest.pageobjects.*;

public abstract class InternetBaseTest extends AemCoreBaseTest {

    protected Screen01CalculatePremium calculatePremium;
    protected Screen02DigitalVaccinationBook digitalVaccinationBook;
    protected Screen03YoutubeVideoPlayer youtubeVideoPlayer;
    protected Screen04RegistrationForm registrationForm;
    protected Screen05SanitasApp sanitasApp;
    protected Screen06HealthQuiz healthQuiz;
    protected Screen07Questionnaire questionnaire;
    protected Screen08WithoutJS withoutJS;
    protected Screen09ClickAllLanguages clickAllLanguages;
    protected Screen10RegisterForShwangershaftService registerForShwangershaftService;
    protected Screen11ContactSanitas contactSanitas;
    protected Screen12PrintBenefitsOfMySupplementaryInsurance printBenefitsOfMySupplementaryInsurance;
    protected Screen13FillContactForm fillcontactform;
    protected Screen14ErrorMessage404 errorMessage404;
    protected Screen16NavigationHomepageUsabilty navHomepageUsabilty;
    protected Screen15Acc_ProdRelease acc_ProdRelease;

    public String getInternetBasePath() {
        if( getLanguage() == Language.FR) {
            return FR_CMS_PAGEURL;
        }
        else   if( getLanguage() == Language.IT) {
            return IT_CMS_PAGEURL;
        }
        else   if( getLanguage() == Language.EN) {
            return EN_CMS_PAGEURL;
        }
        else {
            return DE_CMS_PAGEURL;
        }
    }

    @Override
    public void customInitialize() {
        // init step helper classes
        calculatePremium = new Screen01CalculatePremium(driver,timeHelper);
        digitalVaccinationBook = new Screen02DigitalVaccinationBook(driver,timeHelper);
        youtubeVideoPlayer = new Screen03YoutubeVideoPlayer(driver,timeHelper);
        registrationForm = new Screen04RegistrationForm(driver,timeHelper);
        sanitasApp = new Screen05SanitasApp(driver,timeHelper);
        healthQuiz = new Screen06HealthQuiz(driver,timeHelper);
        questionnaire = new Screen07Questionnaire(driver,timeHelper);
        withoutJS = new Screen08WithoutJS(driver,timeHelper);
        clickAllLanguages = new Screen09ClickAllLanguages(driver,timeHelper);
        registerForShwangershaftService = new Screen10RegisterForShwangershaftService(driver,timeHelper);
        contactSanitas = new Screen11ContactSanitas(driver,timeHelper);
        printBenefitsOfMySupplementaryInsurance = new Screen12PrintBenefitsOfMySupplementaryInsurance(driver,timeHelper);
        errorMessage404 = new Screen14ErrorMessage404(driver, timeHelper);
        navHomepageUsabilty = new Screen16NavigationHomepageUsabilty(driver, timeHelper );
        acc_ProdRelease = new Screen15Acc_ProdRelease(driver,  timeHelper);
    }
}
