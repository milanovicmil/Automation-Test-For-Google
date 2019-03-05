package com.mycompany.automatictestsforgoogle.test;

import com.mycompany.automatictestsforgoogle.util.InitWebDriver;
import com.mycompany.automatictestsforgoogle.util.WebController;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author milica.milanovic
 */
public class SeleniumEasyTest {

    public WebController webController = new WebController();
    private static final InitWebDriver initWebDriver = new InitWebDriver();
    public static final String INPUT_FIELD_ID = "user-message";
    public static final String USER_MESSAGE_ID = "display";
    public static final String INPUT_FIELD_A = "sum1";
    public static final String INPUT_FIELD_B = "sum2";

    @BeforeClass
    public static void startWebDriver() {
        initWebDriver.initializeAndStartWebDriver("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        
    }

    @Before
    public void prepairForTest() {
        webController.findElementById(INPUT_FIELD_A).clear();
        webController.findElementById(INPUT_FIELD_B).clear();

    }

    @Test
    public void InputFileAndValidate() {
        webController.findElementById(INPUT_FIELD_ID).click();
        webController.findElementById(INPUT_FIELD_ID).sendKeys("12312455");
        String Txt1 = webController.findElementById(INPUT_FIELD_ID).getText();
        webController.findElementByClassName("btn").click();
        String message = webController.findElementById("display").getText();
        Assert.assertTrue(message.equals("12312455"));

    }

    @Test
    public void test1() {
        validateSum("1234", "5678");
    }

    @Test
    public void test2() {
        validateSum("0", "5");
    }

    @Test
    public void test3() {
        validateSum("125434", "5");
    }

    private void validateSum(String a, String b) {
        webController.findElementById(INPUT_FIELD_A).click();
        webController.findElementById(INPUT_FIELD_A).sendKeys(a);
        String txt2 = webController.findElementById(INPUT_FIELD_A).getText();
        webController.findElementById(INPUT_FIELD_B).click();
        webController.findElementById(INPUT_FIELD_B).sendKeys(b);
        String txt3 = webController.findElementById(INPUT_FIELD_B).getText();
        webController.findElementByXpath("//*[text() = 'Get Total']").click();
        String txt4 = webController.findElementById("displayvalue").getText();
        int sum = Integer.parseInt(a) + Integer.parseInt(b);
        Assert.assertTrue(txt4.equals(String.valueOf(sum)));
    }

  
    @AfterClass
    public static void quitWebDriver() {
        initWebDriver.quitWebDriver();
    }
}
