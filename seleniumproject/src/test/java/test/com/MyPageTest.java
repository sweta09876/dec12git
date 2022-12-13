/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/**
 *
 * @author Sweta
 */
public class MyPageTest {
  private static WebDriver driver;
    private String baseUrl;   
    public MyPageTest() {
    }

    @BeforeClass
    public void setUpClass() throws Exception {
    System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    baseUrl = "http://tjmaxx.com/";
    //driver.manage().timeouts().implicitlyWait(30);
    }
    
    @Test
    public void executeLoginPageModule() throws Exception {
    LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
    loginpage.loginToFlighApplication("mercury", "mercury");
    Thread.sleep(10*1000);
    }
    
    @Test
    public void executeLogoutPage() throws Exception {
        LogoutPage logout = PageFactory.initElements(driver, LogoutPage.class);
        Thread.sleep(2000);
//Advisable to use explicit wait to pause the driver.
        logout.logoutPage();
         Thread.sleep(2000);
        driver.close();
    }
    @AfterClass
    public static void tearDownClass() throws Exception {
    
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
       // driver.close();
    }   
}
