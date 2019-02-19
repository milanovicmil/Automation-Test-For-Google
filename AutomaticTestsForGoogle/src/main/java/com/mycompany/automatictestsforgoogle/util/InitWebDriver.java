package com.mycompany.automatictestsforgoogle.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class InitWebDriver {
    
    WebDriver webDriver;
    
    public InitWebDriver(){
    }
    
    public WebDriver initializeWebDriver(){
        System.setProperty("webdriver.gecko.driver",
            "C:\\Users\\milica.milanovic\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setCapability("webdriver_accept_untrusted_certs", true);
        webDriver = new FirefoxDriver(firefoxOptions);
        webDriver.manage().window().maximize();
        webDriver.get("https://www.google.rs");   
       return webDriver;
  }
    
    public void quitWebDriver(WebDriver webDriver){
        webDriver.quit();
    }
    
    public static void main(String[] args) {
        InitWebDriver init = new InitWebDriver();
        WebDriver testDriver = init.initializeWebDriver();
        init.quitWebDriver(testDriver);
    }
}