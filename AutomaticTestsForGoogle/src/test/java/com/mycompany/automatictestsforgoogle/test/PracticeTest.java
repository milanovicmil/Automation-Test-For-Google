package com.mycompany.automatictestsforgoogle.test;

import com.mycompany.automatictestsforgoogle.util.InitWebDriver;
import com.mycompany.automatictestsforgoogle.util.WebController;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author milica.milanovic
 */
public class PracticeTest {

    public WebController webController = new WebController();
    private static final InitWebDriver initWebDriver = new InitWebDriver();
    public static final String BTN_CLASS_NAME = "buttonClass";

    @BeforeClass
    public static void startWebDriver() {
        initWebDriver.initializeAndStartWebDriver("https://www.ultimateqa.com/simple-html-elements-for-automation/");
    }

    //@Test
    public void testGetPageSource() {
        webController.getPageSource();
    }

    //@Test
    public void findByClassNameAndClickOnBtn() {
        System.out.println("=================Run findAndClickOnBtn test====================");
        webController.findElementByClassName(BTN_CLASS_NAME).click();
        System.out.println("=================Finished findAndClickOnBtn test====================");
    }

    //@Test 
    public void findByIdAndClickBtn() {
        System.out.println("=================Run findByNameAndClickBtn test====================");
        webController.findElementById("button1").click();
        System.out.println("=================Finished findByIdAndClickBtn test====================");
    }

    //@Test 
    public void findByNameAndClickBtn() {
        System.out.println("=================Run findByNameAndClickBtn test====================");
        webController.findElementByName("button1");
        System.out.println("=================Finished findByNameAndClickBtn test====================");
    }

    //@Test
    public void validateBtnText() {
        System.out.println("=================Run validateBtnText test====================");
        String buttonText = webController.findElementByClassName(BTN_CLASS_NAME).getText();
        System.out.println(buttonText);
        Assert.assertTrue(buttonText.equals("Button"));
        String button1Text = webController.findElementById("button1").getText();
        Assert.assertTrue(button1Text.equals("Click Me!"));
        String button2Text = webController.findElementByName("button1").getText();
        Assert.assertTrue(button2Text.equals("Button"));
      System.out.println("=================Finished validateBtnText test====================");
    }
    
    @Test 
    public void validateLinkTextOnPage(){
        System.out.println("=================Run validateLinkTextOnPage test====================");
        String textText1 = webController.findElementByClassName("et_pb_code_inner").getText();
        System.out.println(textText1);
        Assert.assertTrue(textText1.equals("Click me using this link text"));
        String textText2 = webController.findElementByClassName("et_pb_module_header").getText();
        System.out.println(textText2);
        Assert.assertTrue(textText2.equals("Click button using ClassName"));
        System.out.println("=================Finished validateLinkTextOnPage test====================");
        
    }

    @AfterClass
    public static void quitWebDriver() {
        initWebDriver.quitWebDriver();
    }

}
