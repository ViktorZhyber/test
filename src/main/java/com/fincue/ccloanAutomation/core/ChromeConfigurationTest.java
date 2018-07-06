package com.fincue.ccloanAutomation.core;

import com.codeborne.selenide.Configuration;
import com.fincue.ccloanAutomation.core.Drivers.ChromeDriverSetup;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.MalformedURLException;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;
import static com.fincue.ccloanAutomation.testdata.TestData.ecashClientURL;

public class ChromeConfigurationTest {
    public ChromeDriver driver;


    //Before
    public void setUpBrowser() throws MalformedURLException {
        ChromeDriverSetup chromeDriver = new ChromeDriverSetup();
        driver = chromeDriver.getDriver();


        //set Selenide driver
        setWebDriver(driver);

        Configuration.timeout = 8000;
        getWebDriver().manage().deleteAllCookies();
        //getWebDriver().manage().window().maximize();

        open(ecashClientURL);
    }

    //After
   public void tearDown () throws IOException {
        getWebDriver().quit();
    }

    //AfterCalss
    public static void closeDriver(){
    }
}
