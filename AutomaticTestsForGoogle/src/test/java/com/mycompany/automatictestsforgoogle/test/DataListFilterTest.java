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
public class DataListFilterTest {

    public WebController webController = new WebController();
    private static final InitWebDriver initWebDriver = new InitWebDriver();
    private static final String INPUT_FIELD = "input-search";
    public static final String NAME_1 = "Tyreese Burn";
    public static final String NAME_2 = "Brenda Tree";
    public static final String NAME_3 = "Glenn Pho shizzle";
    public static final String NAME_4 = "Brian Hoyies";
    public static final String NAME_5 = "Glenn Pho shizzle";
    public static final String NAME_6 = "Arman Cheyia";

    @BeforeClass
    public static void startWebDriver() {
        initWebDriver.initializeAndStartWebDriver("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

    }

    @Before
    public void openPage() {
        webController.findElementByLinkText("All Examples").click();
        webController.findElementByLinkText("List Box").click();
        webController.findElementByLinkText("Data List Filter").click();
        webController.findElementById("input-search").clear();

    }

    @Test
    public void searchInputType() {
        webController.findElementById(INPUT_FIELD).click();
        webController.findElementById(INPUT_FIELD).sendKeys(NAME_1);
        DataListFilterTextTests dataList = new DataListFilterTextTests();
        dataList.validateDisplayedPerson(dataList.COMPANY_NAME, dataList.NAME_1, dataList.TITLE_MANAGER, dataList.PHONE_1, dataList.EMAIL_1);
        Assert.assertFalse(webController.isElementDisplayedByXpath("//*[text() = 'Name: " + dataList.NAME_2 + "']"));
        Assert.assertFalse(webController.isElementDisplayedByXpath("//*[text() = 'Name: " + dataList.NAME_3 + "']"));
        Assert.assertFalse(webController.isElementDisplayedByXpath("//*[text() = 'Name: " + dataList.NAME_4 + "']"));
        Assert.assertFalse(webController.isElementDisplayedByXpath("//*[text() = 'Name: " + dataList.NAME_5 + "']"));
        Assert.assertFalse(webController.isElementDisplayedByXpath("//*[text() = 'Name: " + dataList.NAME_6 + "']"));

    }

    @AfterClass
    public static void quitWebDriver() {
        initWebDriver.quitWebDriver();
    }

}
