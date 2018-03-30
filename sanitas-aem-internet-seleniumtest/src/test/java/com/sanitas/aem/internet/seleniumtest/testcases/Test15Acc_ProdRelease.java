package com.sanitas.aem.internet.seleniumtest.testcases;


public class Test15Acc_ProdRelease extends ReusableSteps{

    @Override
    public String getTestName() {
        return "Test 15 Acc_Prod Release (15)";
    }

    @Override
    public String getBasePath() {
        return getInternetBasePath();
    }

    @Override
    public void executeTest() {
        acc_ProdRelease.compareMiniTeasers();
        acc_ProdRelease.closeOvpEntry();
        driver.get("https://www.sanitas.com/de/index/privatkunden.html");
        acc_ProdRelease.compareMiniTeasers();
        acc_ProdRelease.closeOvpEntry();
    }
}
