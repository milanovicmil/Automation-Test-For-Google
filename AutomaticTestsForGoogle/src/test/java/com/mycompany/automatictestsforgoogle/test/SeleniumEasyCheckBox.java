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
public class SeleniumEasyCheckBox {

    public WebController webController = new WebController();
    private static final InitWebDriver initWebDriver = new InitWebDriver();

    @BeforeClass
    public static void startWebDriver() {
        initWebDriver.initializeAndStartWebDriver("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
    }

    @Before
    public void openPage() {
        webController.findElementByLinkText("All Examples").click();
        webController.findElementByLinkText("Input Forms").click();
        webController.findElementByLinkText("Checkbox Demo").click();
    }

    //@Test
    public void CheckBoxDemo() {
        List<WebElement> lista = webController.findElements("checkbox");
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getText().equals("Click on this check box")) {
                lista.get(i).click();
                break;
            }
        }

    }

    // @Test
    public void CheckOption1() {
        List<WebElement> lista = webController.findElements("checkbox");
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getText().equals("Option 1")) {
                lista.get(i).click();
                break;
            }
        }

    }

    //@Test
    public void CheckOption2() {
        List<WebElement> lista = webController.findElements("checkbox");
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getText().equals("Option 2")) {
                lista.get(i).click();
                break;
            }
        }
    }

    //@Test
    public void CheckOption3() {
        List<WebElement> lista = webController.findElements("checkbox");
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getText().equals("Option 3")) {
                lista.get(i).click();
                break;
            }
        }
    }

    //@Test
    public void CheckOption4() {
        List<WebElement> lista = webController.findElements("checkbox");
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getText().equals("Option 4")) {
                lista.get(i).click();
                break;
            }
        }
    }

    //@Test 
    public void CheckOption5() {
        List<WebElement> lista = webController.findElements("checkbox");
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getText().equals("Check All")) {
                lista.get(i).click();
            }
            break;
        }
    }

    @Test
    public void IsSelected(){
    webController.findElementById("isAgeSelected").click();
    String message=  webController.findElementById("txtAge").getText();
    Assert.assertTrue(message.equals("Success - Check box is checked"));
    }
            
    @Test
    public void checkOption1() {
        List<WebElement> list = webController.findCheckBoxes("input[type='checkbox']");
        list.get(1).click();
    }
    
    @Test
     public void checkOption2() {
        List<WebElement> list = webController.findCheckBoxes("input[type='checkbox']");
        list.get(2).click();
    }
     @Test
      public void checkOption3() {
        List<WebElement> list = webController.findCheckBoxes("input[type='checkbox']");
        list.get(3).click();
    }
      @Test 
       public void checkOption4() {
        List<WebElement> list = webController.findCheckBoxes("input[type='checkbox']");
        list.get(4).click();
    }

    @Test
    public void BTN() {
        webController.findElementById("check1").click();
    }
    @AfterClass
    public static void quitWebDriver() {
        initWebDriver.quitWebDriver();
    }

}
