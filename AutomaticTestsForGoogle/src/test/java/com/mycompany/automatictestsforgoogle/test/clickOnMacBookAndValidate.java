
package com.mycompany.automatictestsforgoogle.test;

import com.mycompany.automatictestsforgoogle.util.InitWebDriver;
import com.mycompany.automatictestsforgoogle.util.WebController;
import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

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
    public void clickOnMacBookAndValidateMacBookPage(){
    System.out.println("=================Run clickOnMacBookAndValidateMacBookPage test====================");
    webController.findElementByPartilLinkText("MacBook").click();
    System.out.println("Validate Is Photo displayed");
    Assert.assertTrue(webController.isElementDisplayedByClassName("thumbnail"));
        System.out.println("Validate is desrpition text displayed");
    Assert.assertTrue(webController.isElementDisplayedByClassName("col-sm-4"));
        System.out.println("Validate is 'Add to Cart' button displayed");
    Assert.assertTrue(webController.isElementDisplayedByClassName("btn"));
        System.out.println("Validate is 'Description' displayed");
    Assert.assertTrue(webController.IsElementDisplayedByPartilLinkText("Description"));
        System.out.println("Validate is 'Specification' displayed");
    Assert.assertTrue(webController.IsElementDisplayedByPartilLinkText("Specification"));
        System.out.println("Validate is 'Reviews' displayed");
    Assert.assertTrue(webController.IsElementDisplayedByPartilLinkText("Reviews "));
        System.out.println("Validate is hart button displayed");
        System.out.println("Validate is 'Add to wish' button displayed");
    Assert.assertTrue(webController.isElementDisplayedByXpath("//button[@data-original-title='Add to Wish List']"));
        System.out.println("Validate is 'Compare this product' button displayed");
    Assert.assertTrue(webController.isElementDisplayedByXpath("//button[@data-original-title='Compare this Product']"));
        System.out.println("Validate is price dispayed");
    Assert.assertTrue(webController.findElementByXpath(".//div[@class='col-sm-4']/ul/li/h2").getText().equals("$602.00"));
        System.out.println("Validate is input field displayed");
    Assert.assertTrue(webController.isElementDisplayedByXpath("//button[@class='btn btn-default btn-lg']"));
        System.out.println("Click on Add to cart button");
    webController.findElementById("button-cart").click();
        System.out.println("Click on 'Items' button");
    webController.findElementByXpath("//button[@class='btn btn-default btn-lg']");
        System.out.println("Validate is drop down wish list displayed");
    webController.findElementByXpath("//button[@data-loading-text='Loading...']").click();
        System.out.println("Validate is selected product displayed");
    Assert.assertTrue(webController.IsElementDisplayedByPartilLinkText("MacBook"));
    System.out.println("=================Finished clickOnMacBookAndValidateMacBookPage test====================");
    }
    
     @AfterClass
    public static void quitWebDriver() {
        initWebDriver.quitWebDriver();
    }
    
}
