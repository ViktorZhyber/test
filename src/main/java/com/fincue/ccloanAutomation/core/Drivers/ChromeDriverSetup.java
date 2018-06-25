package com.fincue.ccloanAutomation.core.Drivers;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverSetup {
    ChromeDriver driver;

    public ChromeDriver getDriver() {  return driver;    }

    public ChromeDriverSetup() {
        System.setProperty("webdriver.chrome.driver", "./helperfiles/chromedriver");
//        For Windows
//        System.setProperty("webdriver.chrome.driver", "./helperfiles/chromedriver.exe");
        driver = new ChromeDriver();
    }
}
