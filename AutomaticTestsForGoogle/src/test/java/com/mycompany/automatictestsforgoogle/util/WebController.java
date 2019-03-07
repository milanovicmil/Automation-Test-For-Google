package com.mycompany.automatictestsforgoogle.util;

import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import static org.openqa.selenium.By.linkText;
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

    public void getPageSource() {
        System.out.println(webDriver.getPageSource());
    }

    public WebElement findElementByClassName(String className) {
        return webDriver.findElement(By.className(className));
    }

    public WebElement findElementById(String idElement) {
        return webDriver.findElement(By.id(idElement));
    }

    public WebElement findElementByName(String name) {
        return webDriver.findElement(By.name(name));
    }

    public WebElement findElementByLinkText(String link) {
        return webDriver.findElement(By.linkText(link));
    }

    public WebElement findElementByXpath(String text) {
        return webDriver.findElement(By.xpath(text));
    }

    public WebElement findElementByPartilLinkText(String partialLinkText) {
        return webDriver.findElement(By.partialLinkText(partialLinkText));
    }

    public void goBack() {
        webDriver.navigate().back();

    }

    public void acceptSystemAlert() {
        Alert alert = webDriver.switchTo().alert();
        alert.accept();
    }
  
    public List<WebElement> findElements(String name){
               return webDriver.findElements(By.className(name));
           }
           
    public List<WebElement> findCheckBoxes(){
        return webDriver.findElements(By.cssSelector("input[type='checkbox']"));
           }
    
    public boolean buttonIsSelected(WebElement webElement){
        return webElement.isSelected();
    }
    public List<WebElement> findRadioButton(){
              return webDriver.findElements(By.cssSelector("input[type='radio']"));
                      }
    public List<WebElement> findByCssSelector(String text){
             return webDriver.findElements(By.cssSelector(text));
    }
    public void selectFromDropDown(String tekst){
             findElementById("select-demo").click();
       }
    public List<WebElement> findElementsBytagName(String name){
        return webDriver.findElements(By.tagName(name));
      
    }
  }
  