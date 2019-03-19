
package com.mycompany.automatictestsforgoogle.test;

import com.mycompany.automatictestsforgoogle.util.InitWebDriver;
import com.mycompany.automatictestsforgoogle.util.WebController;
import java.util.List;
import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 *
 * @author milica.milanovic
 */
public class clickOnMacBookAndValidate {
    public WebController webController = new WebController();
    private static final InitWebDriver initWebDriver = new InitWebDriver();

    @BeforeClass
    public static void startWebDriver() {
        initWebDriver.initializeAndStartWebDriver("http://tutorialsninja.com/demo/index.php?route=common/home");
    }
    
    @Test 
    public void clickOnMacBook(){
    System.out.println("=================Run clickOnMacBook test====================");
    webController.findElementByPartilLinkText("MacBook").click();
    System.out.println("=================Finished clickOnMacBook test====================");
    Assert.assertTrue(webController.isElementDisplayedByClassName("thumbnail"));
    Assert.assertTrue(webController.isElementDisplayedByClassName("col-sm-4"));
    Assert.assertTrue(webController.isElementDisplayedByClassName("btn"));
    Assert.assertTrue(webController.IsElementDisplayedByPartilLinkText("Description"));
    Assert.assertTrue(webController.IsElementDisplayedByPartilLinkText("Specification"));
    Assert.assertTrue(webController.IsElementDisplayedByPartilLinkText("Reviews "));
    Assert.assertTrue(webController.isElementDisplayedByXpath("//button[@data-original-title='Add to Wish List']"));
    Assert.assertTrue(webController.isElementDisplayedByXpath("//button[@data-original-title='Compare this Product']"));
    Assert.assertTrue(webController.isElementDisplayedByClassName("list-unstyled"));
    Assert.assertTrue(webController.isElementDisplayedByClassName("form-control"));
    webController.findElementByClassName("btn").click();
    webController.findElementByXpath("//button[@data-loading-text='Loading...']").click();
    Assert.assertTrue(webController.IsElementDisplayedByPartilLinkText("MacBook"));
    }
    
     @AfterClass
    public static void quitWebDriver() {
        initWebDriver.quitWebDriver();
    }
    
}
