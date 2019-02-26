package com.mycompany.automatictestsforgoogle.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class InitWebDriver {
    
    private static WebDriver webDriver;
    
    public void initializeAndStartWebDriver(String URL){
        System.setProperty("webdriver.gecko.driver",
            "C:\\Users\\milica.milanovic\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setCapability("webdriver_accept_untrusted_certs", true);
        webDriver = new FirefoxDriver(firefoxOptions);
        webDriver.manage().window().maximize();
        webDriver.get(URL);   
  }
    
    public void quitWebDriver(){
        webDriver.quit();
    }
    
    public WebDriver getWebDriver(){
        return webDriver;
    }
    
}