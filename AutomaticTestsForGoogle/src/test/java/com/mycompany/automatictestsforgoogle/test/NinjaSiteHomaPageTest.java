package com.mycompany.automatictestsforgoogle.test;

import com.mycompany.automatictestsforgoogle.util.InitWebDriver;
import com.mycompany.automatictestsforgoogle.util.WebController;
import java.util.List;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 *
 * @author milica.milanovic
 */
public class NinjaSiteHomaPageTest {

    public WebController webController = new WebController();
    private static final InitWebDriver initWebDriver = new InitWebDriver();

    @BeforeClass
    public static void startWebDriver() {
        initWebDriver.initializeAndStartWebDriver("http://tutorialsninja.com/demo/index.php?route=common/home");
    }

    //@Test
    public void inputTextInInputFieldAndSearch() {
        System.out.println("=================Run inputTextInInputFieldAndSearch test====================");
        webController.findElementByName("search").sendKeys("MacBook");
        String txt1 = webController.findElementByName("search").getText();
        //Assert.assertTrue(txt1.equals("MacBook"));
//       webController.findElementByClassName("fa fa-search").click();
//        List<WebElement> lista = webController.findElementsByXpath("//button[@type='button']");
//        for (int i = 0; i < lista.size(); i++) {
//            if (lista.get(i).getAttribute("class").equals("btn btn-default btn-lg")) {
//                lista.get(i).click();
//                break;
//            }
//        }

        webController.findElementByXpath("//button[@class='btn btn-default btn-lg']").click();
        Assert.assertTrue(webController.IsElementDisplayedByPartilLinkText("MacBook"));
        Assert.assertTrue(webController.IsElementDisplayedByPartilLinkText("MacBook Air"));
        Assert.assertTrue(webController.IsElementDisplayedByPartilLinkText("MacBook Pro"));
        webController.goBack();
        System.out.println("=================Finished inputTextInInputFieldAndSearch test====================");
    }

    @Test
    public void chooseProductAndCheckItemButton() {
        System.out.println("=================Run chooseProductandCheckItemButton test====================");
//                webController.findElementById("cart-total").click();
//                System.out.println(webController.findElementByXpath("//class[@class='text-center']").getText());
//        Assert.assertTrue(webController.findElementByClassName("dropdown-menu").getText().equals("Your shopping cart is empty!"));
        List<WebElement> lista1 = webController.findElementsByClassName("product-layout");
        for (int d = 0; d < lista1.size(); d++) {
            System.out.println(lista1.get(d).getAttribute("title"));
            if (lista1.get(d).getAttribute("title").equals("MacBook")) {
                lista1.get(d).findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
                String txt2 = webController.findElementById("cart-total").getText();
                Assert.assertTrue(txt2.equals(" 1 item(s) - $602.00"));
            }
            if (lista1.get(d).getText().equals("iPhone")) {
                lista1.get(d).findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
                String txt3 = webController.findElementById("cart-total").getText();
                Assert.assertTrue(txt3.equals(" 2 item(s) - $725.20"));
            }
        }
        webController.findElementById("cart-total").click();
        Assert.assertTrue(webController.isElementDisplayedByXpath("//input[@type='iPhone']|"));
        System.out.println("Proizvoid je prikazan");
        Assert.assertTrue(webController.isElementDisplayedByXpath("//input[@type='MacBook']|"));
        System.out.println("Prozivod je prikazan");
        System.out.println("=================Finished chooseProductAndCheckItemButton test====================");
    }


    @AfterClass
    public static void quitWebDriver() {
        initWebDriver.quitWebDriver();
    }
}