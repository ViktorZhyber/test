package com.fincue.ccloanAutomation.core;

import com.codeborne.selenide.Configuration;
import com.fincue.ccloanAutomation.core.Drivers.ChromeDriverSetup;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;
import static com.fincue.ccloanAutomation.testdata.TestData.ecashClientURL;

public class ChromeConfigurationTest {
    public ChromeDriver driver;


    //Before
    public void setUpBrowser() {
        ChromeDriverSetup chromeDriver = new ChromeDriverSetup();
        driver = chromeDriver.getDriver();


        //set Selenide driver
        setWebDriver(driver);
        Configuration.timeout = 8000;
        getWebDriver().manage().deleteAllCookies();
        getWebDriver().manage().window().maximize();
        open(ecashClientURL);
    }
    //AfterCalss
    public static void closeDriver(){

    }
    //After
    public void tearDown (){
        getWebDriver().quit();
    }
}
