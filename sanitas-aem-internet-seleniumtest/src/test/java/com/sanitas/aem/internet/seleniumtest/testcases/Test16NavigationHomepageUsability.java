package com.sanitas.aem.internet.seleniumtest.testcases;

public class Test16NavigationHomepageUsability extends ReusableSteps{

    @Override
    public String getTestName() {
        return "Test16NavigationHomepageUsability (16)";
    }

    @Override
    public String getBasePath() {
        return getInternetBasePath();
    }

    @Override
    public void executeTest() {
        navHomepageUsabilty.teaserArticle();

    }
}
