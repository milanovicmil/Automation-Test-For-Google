package com.mycompany.automatictestsforgoogle.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author milica.milanovic
 */
public class WebController {

    protected WebDriver webDriver;

    public WebController() {
        InitWebDriver initWebDriver = new InitWebDriver();
        webDriver = initWebDriver.getWebDriver();
    }
    
    public void getPageSource(){
        System.out.println(webDriver.getPageSource());
    }
    
    public WebElement findElementByClassName(String className){
        return webDriver.findElement(By.className(className));
    }
            
    
     public WebElement findElementById(String idElement){
        return webDriver.findElement(By.id( idElement));
    }
     
     public WebElement findElementByName(String name){
        return webDriver.findElement(By.name(name));
     }

}
