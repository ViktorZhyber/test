package com.fincue.ccloanAutomation.core.Drivers;


import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;

public class ChromeDriverSetup {
    ChromeDriver driver;

    public ChromeDriver getDriver() {  return driver;    }

    public ChromeDriverSetup() {
        //Setup Chromedriver
        //System.setProperty("webdriver.chrome.driver", ".\\helperfiles\\chromedriver");
        ChromeDriverManager.getInstance().setup();

        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);

        //options.addArguments("-incognito");
        options.addArguments("start-maximized");
        options.addArguments("disable-extensions");
        options.addArguments("disable-infobars");
        options.addArguments("ignore-certificate-errors"); //disable certification verification;
        options.addArguments("ignore-urlfetcher-cert-requests"); //disable certification verification;
        //options.addArguments("headless"); //make chrome starting without UI;
        //options.addArguments("disable-gpu"); //make chrome starting without UI;

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(capabilities);


//        ChromeDriverManager.getInstance().setup();
//        Configuration.browser = "chrome";
        //options.addArguments("headless","disable-gpu");
//        For Windows
//        System.setProperty("webdriver.chrome.driver", "./helperfiles/chromedriver.exe");


    }
}
