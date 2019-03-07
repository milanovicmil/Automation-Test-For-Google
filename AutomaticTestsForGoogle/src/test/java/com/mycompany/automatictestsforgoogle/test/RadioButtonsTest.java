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
public class RadioButtonsTest {

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
        webController.findElementByLinkText("Radio Buttons Demo").click();
    }

    @Test
    public void clickOnMale() {
        System.out.println("=================Run clickOnMale test====================");
        System.out.println("U 'Radio Button Demo' nadji 'Male' dugme i klikni");
        List<WebElement> lista = webController.findRadioButton();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getAttribute("value").equals("Male")) {
                lista.get(i).click();
            }
            break;
        }
        System.out.println("U 'Radio Button Demo' nadji 'Get Checked value' dugme i klikni");
        webController.findElementById("buttoncheck").click();
        System.out.println("Nadji poruku ispod 'Get Checked value' dugmeta i dohvati tekst");
        String txt = webController.findElementByClassName("radiobutton").getText();
        System.out.println("Izvalidiraj da li je tekst isti ");
        Assert.assertTrue(txt.equals("Radio button 'Male' is checked"));
        System.out.println("=================Finished clickOnMale test====================");
    }
    
    @Test 
    public void clickOnFemale(){
        System.out.println("=================Run clickOnFemale test====================");
        System.out.println("U Radio Button Demo nadji 'Female' dugme i klikni");
        List<WebElement> lista = webController.findRadioButton();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(1).getAttribute("value").equals("Female")) {
                lista.get(1).click();
            }
            break;
        }
        System.out.println("Nadji 'Get Checked value' dugme i klikni");
        webController.findElementById("buttoncheck").click();
        System.out.println("Nadji poruku ispod 'Get Checked value' dugmeta i dohvati tekst");
        String txt = webController.findElementByClassName("radiobutton").getText();
        System.out.println("Izvalidiraj da li je tekst isti ");
        Assert.assertTrue(txt.equals("Radio button 'Female' is checked"));
        System.out.println("=================Finished clickOnFemale test====================");
    }
    @Test
     public void groupRadioButtonsMale(){
         System.out.println("=================Run groupRadioButtonsMale test====================");
         System.out.println("U 'Group Radio Buttons' nadji 'Male' dugme i klikni");
        List<WebElement> lista = webController.findRadioButton();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(2).getAttribute("value").equals("Male")) {
                lista.get(2).click();
            }
            break;
        }
        System.out.println("Nadji 'Get values' dugme i klikni");
        webController.findElementByXpath("//button[text()='Get values']").click();
        System.out.println("Nadji poruku ispod 'Get values' dugmeta i dohvati tekst");
        String txt1 = webController.findElementByClassName("groupradiobutton").getText();
        System.out.println("Izvalidiraj da li je tekst isti ");
       Assert.assertTrue("Expected #Sex : Male\nAge group: #, got #"+txt1+"#", txt1.equals("Sex : Male\nAge group:"));
       System.out.println("=================Finished groupRadioButtonsMale test====================");
}
     @Test
     public void groupRadioButtonsFemale(){
         System.out.println("=================Run groupRadioButtonsFemale test====================");
         System.out.println("U 'Group Radio Buttons' nadji 'Female' dugme i klikni");
        List<WebElement> lista = webController.findRadioButton();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(3).getAttribute("value").equals("Female")) {
                lista.get(3).click();
            }
            break;
        }
        System.out.println("Nadji 'Get values' dugme i klikni");
        webController.findElementByXpath("//button[text()='Get values']").click();
        System.out.println("Nadji poruku ispod 'Get values' dugmeta i dohvati tekst");
        String txt2 = webController.findElementByClassName("groupradiobutton").getText();
        System.out.println("Izvalidiraj da li je tekst isti ");
        Assert.assertTrue(txt2.equals("Sex : Female\nAge group:"));
        System.out.println("=================Finished groupRadioButtonsFemale test====================");
     }
     @Test
     public void groupRadioButtonsAgeGroup1(){
         System.out.println("=================Run groupRadioButtonsAgeGroup1 test====================");
         System.out.println("U 'Group Radio Buttons' nadji '0 to 5' dugme i klikni");
        List<WebElement> lista = webController.findRadioButton();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(4).getAttribute("value").equals("0 - 5")) {
                lista.get(4).click();
            }
            break;
        }
        System.out.println("Nadji 'Get values' dugme i klikni");
        webController.findElementByXpath("//button[text()='Get values']").click();
        System.out.println("Nadji poruku ispod 'Get values' dugmeta i dohvati tekst");
        String txt3 = webController.findElementByClassName("groupradiobutton").getText();
        System.out.println("Izvalidiraj da li je tekst isti ");
        Assert.assertTrue(txt3.equals("Sex :\nAge group: 0 - 5"));
        System.out.println("=================Finished groupRadioButtonsAgeGroup1 test====================");
     }
     @Test
     public void groupRadioButtonsAgeGroup2() {
        System.out.println("=================Run groupRadioButtonsAgeGroup2 test====================");
        System.out.println("U 'Group Radio Buttons' nadji '5 to 15' dugme i klikni");
        List<WebElement> lista = webController.findRadioButton();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(5).getAttribute("value").equals("5 - 15")) {
                lista.get(5).click();
            }
            break;
        }
        System.out.println("Nadji 'Get values' dugme i klikni");
        webController.findElementByXpath("//button[text()='Get values']").click();
        System.out.println("Nadji poruku ispod 'Get values' dugmeta i dohvati tekst");
        String txt4 = webController.findElementByClassName("groupradiobutton").getText();
        System.out.println("Izvalidiraj da li je tekst isti ");
        Assert.assertTrue(txt4.equals("Sex :\nAge group: 5 - 15"));
        System.out.println("=================Finished groupRadioButtonsAgeGroup2 test====================");
     }
     @Test
      public void groupRadioButtonsAgeGroup3() {
       System.out.println("=================Run groupRadioButtonsAgeGroup3 test====================");
       System.out.println("U 'Group Radio Buttons' nadji '15 to 50' dugme i klikni");List<WebElement> lista = webController.findRadioButton();
        for (int i = 0; i < lista.size(); i++) {
        
            if (lista.get(6).getAttribute("value").equals("15 - 50")) {
                lista.get(6).click();
            }
            break;
        }
        System.out.println("Nadji 'Get values' dugme i klikni");
        webController.findElementByXpath("//button[text()='Get values']").click();
        System.out.println("Nadji poruku ispod 'Get values' dugmeta i dohvati tekst");
        String txt5 = webController.findElementByClassName("groupradiobutton").getText();
        System.out.println("Izvalidiraj da li je tekst isti ");
        Assert.assertTrue("Expected #Sex :\nAge group:15-50#, got #"+txt5+"#",txt5.equals("Sex :\nAge group: 15 - 50"));
        System.out.println("=================Finished groupRadioButtonsAgeGroup3 test====================");
     }
     @AfterClass
    public static void quitWebDriver() {
        initWebDriver.quitWebDriver();
    }
}
