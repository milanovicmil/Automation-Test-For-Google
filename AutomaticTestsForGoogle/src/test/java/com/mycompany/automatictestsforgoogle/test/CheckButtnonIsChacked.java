package com.mycompany.automatictestsforgoogle.test;

import com.mycompany.automatictestsforgoogle.util.InitWebDriver;
import com.mycompany.automatictestsforgoogle.util.WebController;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

/**
 *
 * @author milica.milanovic
 */
public class CheckButtnonIsChacked {

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

    @Test
    public void validateAllCheckboxesSelected() {
        //nadji checkboc i klikni
        webController.findElementById("check1").click();
        //prodji kroz listu i svrstaj sve elemenete u listu
        List<WebElement> lista = webController.findCheckBoxes();
        for (int i = 1; i < lista.size(); i++) {
            //proveri da su svi checkbox cekovani
            Assert.assertTrue(webController.buttonIsSelected(lista.get(i)));
        }
        webController.findElementById("check1").click();
        for (int li = 1; li < lista.size(); li++) {
            //proveri da nisu svi checkbox cekovani
            Assert.assertFalse(webController.buttonIsSelected(lista.get(li)));

        }
    }
}
