
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
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author milica.milanovic
 */
public class DropDownTests {
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
        webController.findElementByLinkText("Select Dropdown List").click();
}
    //@Test
    public void chooseSunday(){
      System.out.println("=================Run chooseSunday test====================");
      System.out.println("Nadji dugme 'Select',klikni i odaberi opciju 'Sunday'");
      Select selectByVisibleText= new Select(webController.findElementById("select-demo"));
      selectByVisibleText.selectByVisibleText("Sunday");
      System.out.println("Izvalidiraj poruku ispod Drop Down-a");
      String mess= webController.findElementByClassName("selected-value").getText();
      Assert.assertTrue(mess.equals("Day selected :- Sunday"));
      System.out.println("=================Finished chooseSunday test====================");
    }
    
    //@Test
    public void chooseMonday(){
        System.out.println("=================Run chooseMonday test====================");
      System.out.println("Nadji dugme 'Select',klikni i odaberi opciju 'Monday'");
      Select selectByVisibleText= new Select(webController.findElementById("select-demo"));
      selectByVisibleText.selectByVisibleText("Monday");
      System.out.println("Izvalidiraj poruku ispod Drop Down-a");
      String message= webController.findElementByClassName("selected-value").getText();
      Assert.assertTrue(message.equals("Day selected :- Monday"));
      System.out.println("=================Finished chooseMonday test====================");
    }
    //@Test
    public void chooseTuesday(){
     System.out.println("=================Run chooseTuesday test====================");
      System.out.println("Nadji dugme 'Select',klikni i odaberi opciju 'Tuesday'");
      Select selectByVisibleText= new Select(webController.findElementById("select-demo"));
      selectByVisibleText.selectByVisibleText("Tuesday");
      System.out.println("Izvalidiraj poruku ispod Drop Down-a");
      String message1= webController.findElementByClassName("selected-value").getText();
      Assert.assertTrue(message1.equals("Day selected :- Tuesday"));
      System.out.println("=================Finished chooseTuesday test====================");
    }
    
     //@Test
     public void chooseWednesday (){
      System.out.println("=================Run chooseWednesday test====================");
      System.out.println("Nadji dugme 'Select',klikni i odaberi opciju 'Wednesday'");
      Select selectByVisibleText= new Select(webController.findElementById("select-demo"));
      selectByVisibleText.selectByVisibleText("Wednesday");
      System.out.println("Izvalidiraj poruku ispod Drop Down-a");
      String message1= webController.findElementByClassName("selected-value").getText();
      Assert.assertTrue(message1.equals("Day selected :- Wednesday"));
      System.out.println("=================Finished chooseWednesday test====================");
     }
     
     //@Test 
     public void chooseThursday(){
      System.out.println("=================Run chooseThursday test====================");
      System.out.println("Nadji dugme 'Select',klikni i odaberi opciju 'Thursday'");
      Select selectByVisibleText= new Select(webController.findElementById("select-demo"));
      selectByVisibleText.selectByVisibleText("Thursday");
      System.out.println("Izvalidiraj poruku ispod Drop Down-a");
      String message1= webController.findElementByClassName("selected-value").getText();
      Assert.assertTrue(message1.equals("Day selected :- Thursday"));
      System.out.println("=================Finished chooseThursday test====================");
     }
     
     //@Test
     public void chooseFriday(){
     System.out.println("=================Run chooseFriday test====================");
      System.out.println("Nadji dugme 'Select',klikni i odaberi opciju 'Friday'");
      Select selectByVisibleText= new Select(webController.findElementById("select-demo"));
      selectByVisibleText.selectByVisibleText("Friday");
      System.out.println("Izvalidiraj poruku ispod Drop Down-a");
      String message1= webController.findElementByClassName("selected-value").getText();
      Assert.assertTrue(message1.equals("Day selected :- Friday"));
      System.out.println("=================Finished chooseFriday test====================");
     }
    
     //@Test 
     public void chooseSaturday(){
      System.out.println("=================Run chooseSaturday test====================");
      System.out.println("Nadji dugme 'Select',klikni i odaberi opciju 'Saturday'");
      Select selectByVisibleText= new Select(webController.findElementById("select-demo"));
      selectByVisibleText.selectByVisibleText("Saturday");
      System.out.println("Izvalidiraj poruku ispod Drop Down-a");
      String message1= webController.findElementByClassName("selected-value").getText();
      Assert.assertTrue(message1.equals("Day selected :- Saturday"));
      System.out.println("=================Finished chooseSaturday test====================");
     }
     
     //@Test 
     public void multiSelectList1(){
     webController.findElementById("multi-select");
     List<WebElement> x= webController.findElementsBytagName("option");
      for (int i = 0; i < x.size(); i++) {
            if (x.get(i).getAttribute("value").equals("California")) {
                x.get(i).click();
            }
     webController.findElementById("printMe").click();
     String messBTN1=webController.findElementByClassName("getall-selected").getText();
     Assert.assertTrue(messBTN1.equals("First selected option is : California"));
     String messBTN2=webController.findElementById("printAll").getText();
     Assert.assertTrue(messBTN2.equals("Options selected are : California"));
     }
     }
      
      @Test
      public void multiSelectList2(){
     List<WebElement> x= webController.findElementsBytagName("option");
      for (int i = 0; i < x.size(); i++) {
            if (x.get(i).getAttribute("value").equals("California")) {
                x.get(i).click();
            }
      }
     webController.findElementById("printMe").click();
     String messBTN1=webController.findElementByClassName("getall-selected").getText();
     Assert.assertTrue(messBTN1.equals("First selected option is : California"));
     String messBTN2=webController.findElementById("printAll").getText();
     Assert.assertTrue(messBTN2.equals("Options selected are : California"));
     }
     
     @AfterClass
    public static void quitWebDriver() {
        initWebDriver.quitWebDriver();
    }
}


