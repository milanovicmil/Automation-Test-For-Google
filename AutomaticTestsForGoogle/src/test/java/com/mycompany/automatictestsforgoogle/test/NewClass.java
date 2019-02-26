
package com.mycompany.automatictestsforgoogle.test;

import com.mycompany.automatictestsforgoogle.util.InitWebDriver;
import com.mycompany.automatictestsforgoogle.util.WebController;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author milica.milanovic
 */
public class NewClass {
     public WebController webController = new WebController();
  private   static InitWebDriver initWebDriver = new InitWebDriver();
     
  @BeforeClass
    public static void startWebDriver() {
        initWebDriver.initializeAndStartWebDriver("http://www.globalsqa.com/samplepagetest/");
    }
    
    @Test
    public void getByClassName(){
        System.out.println("======Run getByClassName Test========");
        String Text1 = webController.findElementByClassName("page_heading").getText();
        System.out.println(Text1);
        Assert.assertTrue(Text1.equals("Sample Page Test"));
        System.out.println("======Finished getByClassName Test========");     
}
     @AfterClass
    public static void quitWebDriver() {
        initWebDriver.quitWebDriver();
    }
}    

