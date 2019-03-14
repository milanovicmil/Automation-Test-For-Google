package com.mycompany.automatictestsforgoogle.test;

import com.mycompany.automatictestsforgoogle.util.InitWebDriver;
import com.mycompany.automatictestsforgoogle.util.WebController;
import java.util.List;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

/**
 *
 * @author milica.milanovic
 */
public class TestsForRegisterAccount {

    public WebController webController = new WebController();
    private static final InitWebDriver initWebDriver = new InitWebDriver();
    private static final String FIRST_NAME = "input-firstname";
    private static final String LAST_NAME = "input-lastname";
    private static final String EMAIL = "input-email";
    private static final String TELEPHONE = "input-telephone";
    private static final String PASSWORD = "input-password";
    private static final String PASSWORD_CONFIRM = "input-confirm";
    private static final String BTN = "//*[@value='Continue']";
    private static final String CHECKBOX = "input[type='checkbox']";
    private static final String EMPTY = "";
    private static final String TWO_CHARACTERS = "AB";
    private static final String MORE_CHAR = "mdhfgfisdyfjfjsfiusufoifhodugughprfihoeoegirhieovu";
    private static final String SPEC_SYMBOLS = "!@$%^&^&^$$#@##@#@%%^^*&";
    private static final String WIHNOUT = "milica.milanovic95hotmail.com";
    private static final String WIHNOUT_DOMAINS = "milica.milanovic@hotmail";
    private static final String PASS_BR = "1234";
    private static final String PASS_COM1="MM";
    private static final String PASS_COM2="EFEDRGNKDJNFDMFFLGDNLFDKMKMGDLKBJKKIOOMNKUYJHGF";
    private static final String PASS_COM3="4567";
    private static final String FIRST_VAL = "milica";
    private static final String LAST_NAME_VAL = "Milanovic";
    private static final String EMAIL_VAL = "milica.milanovic95@hotmail.com";
    private static final String TELEPHONE_VAL = "0611844727";
    private static final String PASSWORD_VALL = "4567";
    private static final String PASSWORD_CONFIRM_VAL = "4567";

    @BeforeClass
    public static void startWebDriver() {
        initWebDriver.initializeAndStartWebDriver("http://tutorialsninja.com/demo/index.php?route=account/register");
    }

    @Before
    public void openPage() {
        webController.findElementById(FIRST_NAME).clear();
        webController.findElementById(LAST_NAME).clear();
        webController.findElementById(EMAIL).clear();
        webController.findElementById(TELEPHONE).clear();
        webController.findElementById(PASSWORD).clear();
        webController.findElementById(PASSWORD_CONFIRM).clear();
    }

    @Test
    public void allFieldsEmpty() {
        System.out.println("=================Run allFieldsEmpty test====================");
        populateFields(EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY);
        webController.findElementByXpath(BTN).click();
        validateErrorMessages();
    }

    public void populateFields(String firstName, String lastName, String email, String telephone, String password, String passwordConfirm) {
        webController.findElementById(FIRST_NAME).click();
        webController.findElementById(FIRST_NAME).clear();
        webController.findElementById(FIRST_NAME).sendKeys(firstName);
        webController.findElementById(LAST_NAME).click();
        webController.findElementById(LAST_NAME).clear();
        webController.findElementById(LAST_NAME).sendKeys(lastName);
        webController.findElementById(EMAIL).click();
        webController.findElementById(EMAIL).clear();
        webController.findElementById(EMAIL).sendKeys(email);
        webController.findElementById(TELEPHONE).click();
        webController.findElementById(TELEPHONE).clear();
        webController.findElementById(TELEPHONE).sendKeys(telephone);
        webController.findElementById(PASSWORD).click();
        webController.findElementById(PASSWORD).clear();
        webController.findElementById(PASSWORD).sendKeys(password);
        webController.findElementById(PASSWORD_CONFIRM).click();
        webController.findElementById(PASSWORD_CONFIRM).clear();
        webController.findElementById(PASSWORD_CONFIRM).sendKeys(passwordConfirm);

    }

    public void validateErrorMessages() {
        List<WebElement> list = webController.findElementsByClassName("text-danger");
        Assert.assertTrue(list.get(0).getText().equals("First Name must be between 1 and 32 characters!"));
        Assert.assertTrue(list.get(1).getText().equals("Last Name must be between 1 and 32 characters!"));
        Assert.assertTrue(list.get(2).getText().equals("E-Mail Address does not appear to be valid!"));
        Assert.assertTrue(list.get(3).getText().equals("Telephone must be between 3 and 32 characters!"));
        Assert.assertTrue(list.get(4).getText().equals("Password must be between 4 and 20 characters!"));
        System.out.println("=================Finished allFieldsEmpty test====================");
    }

    @Test
    public void validateFirstNameField() {
        System.out.println("=================Run validateFirstNameField test====================");
        populateFields(MORE_CHAR, LAST_NAME_VAL, EMAIL_VAL, TELEPHONE_VAL, PASSWORD_VALL, PASSWORD_CONFIRM_VAL);
        webController.findElementByXpath(BTN).click();
        List<WebElement> list = webController.findElementsByClassName("text-danger");
        Assert.assertTrue(list.get(0).getText().equals("First Name must be between 1 and 32 characters!"));
        System.out.println("=================Finished validateFirstNameField test====================");
    }

    
    @Test
    public void validatePassword() {
        System.out.println("=================Run validatePassword test====================");
        populateFields(FIRST_VAL, LAST_NAME_VAL, EMAIL_VAL, TELEPHONE_VAL, TWO_CHARACTERS, PASSWORD_CONFIRM_VAL);
        webController.findElementByXpath(BTN).click();
        List<WebElement> list = webController.findElementsByClassName("text-danger");
        Assert.assertTrue(list.get(0).getText().equals("Password must be between 4 and 20 characters!"));
        
      

        populateFields(FIRST_VAL, LAST_NAME_VAL, EMAIL_VAL, TELEPHONE_VAL, MORE_CHAR, PASSWORD_CONFIRM_VAL);
        webController.findElementByXpath(BTN).click();
        list = webController.findElementsByClassName("text-danger");
        Assert.assertTrue(list.get(0).getText().equals("Password must be between 4 and 20 characters!"));
      
        populateFields(FIRST_VAL, LAST_NAME_VAL, EMAIL_VAL, TELEPHONE_VAL, PASSWORD_VALL, PASS_COM1);
        webController.findElementByXpath(BTN).click();
        list = webController.findElementsByClassName("text-danger");
        Assert.assertTrue(list.get(0).getText().equals("Password confirmation does not match password!"));
        
        populateFields(FIRST_VAL, LAST_NAME_VAL, EMAIL_VAL, TELEPHONE_VAL, PASSWORD_VALL, PASS_COM2);
        webController.findElementByXpath(BTN).click();
        list = webController.findElementsByClassName("text-danger");
        Assert.assertTrue(list.get(0).getText().equals("Password confirmation does not match password!"));
        
        populateFields(FIRST_VAL, LAST_NAME_VAL, EMAIL_VAL, TELEPHONE_VAL, PASS_BR, PASS_COM3);
        webController.findElementByXpath(BTN).click();
        list = webController.findElementsByClassName("text-danger");
        Assert.assertTrue(list.get(0).getText().equals("Password confirmation does not match password!"));
        
         System.out.println("=================Finished validateEmailAddressField test====================");
    }


    @AfterClass
    public static void quitWebDriver() {
        initWebDriver.quitWebDriver();
    }

}
