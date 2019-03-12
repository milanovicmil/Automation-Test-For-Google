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
public class DataListFilterTextTests {

    public WebController webController = new WebController();
    public static final InitWebDriver initWebDriver = new InitWebDriver();
    public static final String BOX_1 = "info-block";
    public static final String COMPANY_NAME = "Company Name";
    public static final String NAME_1 = "Tyreese Burn";
    public static final String TITLE_MANAGER = "Manager";
    public static final String PHONE_1 = "321-456-1111,";
    public static final String EMAIL_1 = "test1@company.com";
    public static final String NAME_2 = "Brenda Tree";
    public static final String PHONE_2 = "644-555-2222, ";
    public static final String EMAIL_2 = "test2@company.com";
    public static final String NAME_3 = "Glenn Pho shizzle";
    public static final String PHONE_3 = "980-543-3333, ";
    public static final String EMAIL_3 = "test3@company.com";
    public static final String NAME_4 = "Brian Hoyies";
    public static final String PHONE_4 = "564-234-4444, ";
    public static final String EMAIL_4 = "test4@company.com";
    public static final String NAME_5 = "Glenn Pho shizzle";
    public static final String PHONE_5 = "555-454-5555, ";
    public static final String EMAIL_5 = "test5@company.com";
    public static final String NAME_6 = "Arman Cheyia";
    public static final String PHONE_6 = "234-555-6666, ";
    public static final String EMAIL_6 = "test6@company.com";

    @BeforeClass
    public static void startWebDriver() {
        initWebDriver.initializeAndStartWebDriver("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

    }

    @Before
    public void openPage() {
        webController.findElementByLinkText("All Examples").click();
        webController.findElementByLinkText("List Box").click();
        webController.findElementByLinkText("Data List Filter").click();
    }

    @Test
    public void checkAndValidateBox1() {
        System.out.println("=================Run checkAndValidateBox1 test====================");
        validateDisplayedPerson(COMPANY_NAME, NAME_1, TITLE_MANAGER, PHONE_1, EMAIL_1);
        System.out.println("=================Finished checkAndValidateBox1 test====================");
    }

    @Test
    public void checkAndValidateTextBox2() {
        System.out.println("=================Run checkAndValidateTextBox2 test====================");
        validateDisplayedPerson(COMPANY_NAME, NAME_2, TITLE_MANAGER, PHONE_2, EMAIL_2);
        System.out.println("=================Finished checkAndValidateTextBox2 test====================");
    }

    @Test
    public void checkAndValidateBox3() {
        System.out.println("=================Run checkAndValidateBox3 test====================");
        validateDisplayedPerson(COMPANY_NAME, NAME_3, TITLE_MANAGER, PHONE_3, EMAIL_3);
        System.out.println("=================Finished checkAndValidateBox3 test====================");
    }

    @Test
    public void checkAndValidateBox4() {
        System.out.println("=================Run checkAndValidateBox4 test====================");
        validateDisplayedPerson(COMPANY_NAME, NAME_4, TITLE_MANAGER, PHONE_4, EMAIL_4);
        System.out.println("=================Finished checkAndValidateBox4 test====================");
    }

    @Test
    public void checkAndValidateBox5() {
        System.out.println("=================Run checkAndValidateBox5 test====================");
        validateDisplayedPerson(COMPANY_NAME, NAME_5, TITLE_MANAGER, PHONE_5, EMAIL_5);
        System.out.println("=================Finished checkAndValidateBox5 test====================");
    }

    @Test
    public void checkAndValidateTextOnBox6() {
        System.out.println("=================Run checkAndValidateTextOnBox6 test====================");
        validateDisplayedPerson(COMPANY_NAME, NAME_6, TITLE_MANAGER, PHONE_6, EMAIL_6);
        System.out.println("=================Finished checkAndValidateTextOnBox6 test====================");
    }

    public void validateDisplayedPerson(String companyName, String nameAndSurname, String titleManager, String phoneNumber, String email) {
        Assert.assertTrue(webController.isElementDisplayedByXpath("//*[text() = '" + companyName + "']"));
        String text1 = webController.findElementByXpath("//*[text() = '" + companyName + "']").getText();
        Assert.assertTrue(text1.equals(companyName));
        String text2 = webController.findElementByXpath("//*[text() = 'Name: " + nameAndSurname + "']").getText();
        Assert.assertTrue(text2.equals("Name: " + nameAndSurname));
        String text3 = webController.findElementByXpath("//*[text() = 'Title: " + titleManager + "']").getText();
        Assert.assertTrue(text3.equals("Title: " + titleManager));
        String text4 = webController.findElementByXpath("//*[text() = 'Phone: " + phoneNumber + "']").getText();
        Assert.assertTrue(text4.equals("Phone: " + phoneNumber.trim()));
        String text5 = webController.findElementByXpath("//*[text() = 'Email: " + email + "']").getText();
        Assert.assertTrue(text5.equals("Email: " + email));

    }

    @AfterClass
    public static void quitWebDriver() {
        initWebDriver.quitWebDriver();
    }

}
