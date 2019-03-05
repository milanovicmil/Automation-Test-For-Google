
package com.mycompany.automatictestsforgoogle.test;

import static com.mycompany.automatictestsforgoogle.test.SeleniumEasyTest.INPUT_FIELD_A;
import static com.mycompany.automatictestsforgoogle.test.SeleniumEasyTest.INPUT_FIELD_B;
import com.mycompany.automatictestsforgoogle.util.InitWebDriver;
import com.mycompany.automatictestsforgoogle.util.WebController;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author milica.milanovic
 */
public class GlobalsqaTest {
     public WebController webController = new WebController();
    private static final InitWebDriver initWebDriver = new InitWebDriver();
    private static final String INPUT_NAME= "g2599-name";
    private static final String INPUT_EMAIL="g2599-email";
    private static final String INPUT_WEBSITE="g2599-website";
    private static final String EXPERIENCE_YEARS="g2599-experienceinyears";
    private static final String FUNCTIONAL_CHECKBOX= "//*[text() = '  Functional Testing']";
    private static final String AUTOMATION_TESTING_CHECKBOX="//*[text() = ' Automation Testing']";
    private static final String MANUAL_TESTING_CHECKBOX="//*[text() = ' Manual Testing']]";
    private static final String GRADUATE_RADIO_BTN="//*[text() = ' Graduate']";
    private static final String POST_GRADUATE_RADIO_BTN="//*[text() = ' Post Graduate']";
    private static final String OTHER_RADIO_BTN="//*[text() = ' Other']";
    private static final String ALERT_BOX="//*[text() = 'Alert Box : Click Here']";
    private static final String COMMENT="contact-form-comment-g2599-comment";
    private static final String  SUBMIT_BUTTON="pushbutton-wide";
    
    @BeforeClass
    public static void startWebDriver() {
        initWebDriver.initializeAndStartWebDriver("http://www.globalsqa.com/samplepagetest/");
     }
    
    @Before
    public void prepairForTest(){
    webController.findElementById(INPUT_NAME).clear();
    webController.findElementById(INPUT_EMAIL).clear();
    webController.findElementById(INPUT_WEBSITE).clear();
    webController.findElementById(INPUT_WEBSITE).clear();
    webController.findElementById(COMMENT).clear();
    
    }
    
     @Test
     public void InputTextInInputField(){
       webController.findElementById(INPUT_NAME).click();
       webController.findElementById(INPUT_NAME).sendKeys("MilIca");
       webController.findElementById(INPUT_EMAIL).click();
       webController.findElementById(INPUT_EMAIL).sendKeys("milica.milanovic95@hotmail.com");
       webController.findElementById(INPUT_WEBSITE).click();
       webController.findElementById(INPUT_WEBSITE).sendKeys("https://www.google.com/");
       webController.findElementById(EXPERIENCE_YEARS).click();
       webController.findElementByXpath(AUTOMATION_TESTING_CHECKBOX).click();
       webController.findElementByXpath(GRADUATE_RADIO_BTN).click();
       webController.findElementByXpath(ALERT_BOX).click();
       webController.acceptSystemAlert();
       webController.findElementById(COMMENT).click();
       webController.findElementById(COMMENT).sendKeys("message");
       webController.findElementByClassName(SUBMIT_BUTTON).click();
       
     }
      
      // @Test
        public void InputTextInInputField2(){
       webController.findElementById(INPUT_NAME).click();
       webController.findElementById(INPUT_NAME).sendKeys("Milca");
       webController.findElementById(INPUT_EMAIL).click();
       webController.findElementById(INPUT_EMAIL).sendKeys("milica.milanovic95@hotmail.com");
       webController.findElementById(INPUT_WEBSITE).click();
       webController.findElementById(INPUT_WEBSITE).sendKeys("https://www.google.com/");
       webController.goBack();
       webController.findElementById(EXPERIENCE_YEARS).click();
       webController.findElementByXpath(FUNCTIONAL_CHECKBOX).click();
       webController.findElementByXpath(POST_GRADUATE_RADIO_BTN).click();
       webController.findElementByXpath(ALERT_BOX).click();
       webController.acceptSystemAlert();
       webController.findElementById(COMMENT).click();
       webController.findElementById(COMMENT).sendKeys("message");
       webController.findElementByClassName(SUBMIT_BUTTON).click();
     }
       
      // @Test
        public void InputTextInInputField3(){
       webController.findElementById(INPUT_NAME).click();
       webController.findElementById(INPUT_NAME).sendKeys("Milca");
       webController.findElementById(INPUT_EMAIL).click();
       webController.findElementById(INPUT_EMAIL).sendKeys("milica.milanovic95@hotmail.com");
       webController.findElementById(INPUT_WEBSITE).click();
       webController.findElementById(INPUT_WEBSITE).sendKeys("https://www.google.com/");
       webController.goBack();
       webController.findElementById(EXPERIENCE_YEARS).click();
       webController.findElementByXpath(MANUAL_TESTING_CHECKBOX).click();
       webController.findElementByXpath(OTHER_RADIO_BTN).click();
       webController.findElementByXpath(ALERT_BOX).click();
       webController.acceptSystemAlert();
       webController.findElementById(COMMENT).click();
       webController.findElementById(COMMENT).sendKeys("message");
       webController.findElementByClassName(COMMENT).click();
   }

     @AfterClass
    public static void quitWebDriver() {
        initWebDriver.quitWebDriver();
    
}    
}
