package com.fincue.ccloanAutomation.core;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import java.io.IOException;
import java.net.MalformedURLException;

public class BaseConfigurationTest {
    private static ChromeConfigurationTest chromeCT;
    @BeforeClass
    public static void initialEnvironmentSetup() {

        chromeCT = new ChromeConfigurationTest();
    }
    @Before
    public void setUpBrowser() throws MalformedURLException {

        chromeCT.setUpBrowser();
    }

    @After
    public void tearDown()throws IOException {
        chromeCT.tearDown();
    }

    @AfterClass
    public static void closeDriver() {

        chromeCT.closeDriver();
    }



    //chromeCT = new ChromeConfigurationTest
    /* in future for different browser
       @BeforeClass
    public static void initialEnvironmentSetup() {

        switch (boPlatformName) {
            case WIN_CHROME:
                chromeCT = new ChromeConfigurationTest();
                chromeCT.initialEnvironmentSetup();
                break;
            case MAC_CHROME:
                remoteChromeCT = new RemoteChromeConfigurationTest();
                remoteChromeCT.initialEnvironmentSetup();
                break;
            case MAC_SAFARI:
                //remoteSafariCT = new RemoteSafariConfigurationTest();
                //remoteSafariCT.initialEnvironmentSetup();
                break;
        }
    }
     */



}
