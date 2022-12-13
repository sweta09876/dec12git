/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
public class TjmaxxPageTest {
private WebDriver driver;
private String baseUrl;  
public TjmaxxPageTest() {

    }
    @BeforeClass
   public void setUpClass() throws Exception {
//    System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    baseUrl = "https://www.tjmaxx.tjx.com/store/index.jsp/";
   // baseUrl = "http://itexps.com/simpleform.html";
    }
    @Test
    public void executeSearchboxModule() throws Exception {
    Searchbox searchbox = PageFactory.initElements(driver, Searchbox.class);
    searchbox.loginToFlighApplication("gloves");
    
    //driver.close();
    }
    
       
  
    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
      //   public void setUpClass() throws Exception {
    System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    baseUrl = "https://www.tjmaxx.tjx.com/store/index.jsp/";
       
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.close();
    }
//@Test
//    public void hover() throws Exception {
//        //   driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//       // implicit wait condition
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        // this opens the url
//        driver.get("https://www.tjmaxx.tjx.com/store/index.jsp/");
//        //Mouse hover// 
//        
//       WebElement elem1 = driver.findElement(By.id("//*[@id=\"site-wrapper\"]/header/div[1]/div/div[2]/nav/ul/li[2]/div[1]/a='Account Menu']"));
//        Actions act = new Actions(driver);
//       // Action a1 = act.moveToElement(elem1).build();
//        Action a1 = act.moveToElement(elem1).pause(Duration.ofSeconds(5)).doubleClick().build();
//        a1.perform();
//        Thread.sleep(10*1000);
////        //To wait for element visible
//        WebDriverWait wait = new WebDriverWait(driver, (10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("SIGN IN")));
//       WebElement elem2 = driver.findElement(By.linkText("SIGN IN"));
//       elem2.click(); 
//         driver.close();}
          @Test
  public void testTjmaxxTestCase() throws Exception {
    driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TewNE8yLlZgNGB0YPBiK8nKTayoAABBwAYF&q=tjmaxx&oq=tjmaxx&aqs=chrome.1.0i271j46i131i199i433i465i512j69i59j0i131i433i512j0i512j0i131i433i457i512j46i175i199i402j0i402j0i512j0i131i433i512.4161j0j15&sourceid=chrome&ie=UTF-8");
       // driver.findElement(By.xpath("//div[@id='tads']/div/div/div/div/div/a/div/div/span")).click();
    driver.get("https://tjmaxx.tjx.com/store/index.jsp?skimoffer=1952503");
    driver.findElement(By.id("search-text-input")).click();
    driver.findElement(By.id("search-text-input")).clear();
    driver.findElement(By.id("search-text-input")).sendKeys("gloves");
    driver.findElement(By.id("site-search-form")).submit();
     driver.get("https://tjmaxx.tjx.com/store/shop/?_dyncharset=utf-8&initSubmit=true&Ntt=gloves&qfh_sch=Search");
    //driver.findElement(By.xpath("//img[@alt='Shearling Classic Perforated Gloves']")).click();
    driver.get("https://tjmaxx.tjx.com/store/jump/product/Shearling-Classic-Perforated-Gloves/1000746992?colorId=NS1003569&pos=1:1&Ntt=gloves");
    driver.findElement(By.xpath("//div[@id='product-1000746992']/section/div[2]/form/div[3]/div/div[2]/ul/li/a/span")).click();
    //wait.until(ExpectedConditions.elementToBeClickable(By.id("myElementId"))).clear();
   // driver.findElement(By.id("addItemToOrder")).click();
    //driver.findElement(By.id("addItemToOrder")).clear();    
    //driver.findElement(By.linkText("VIEW BAG")).click();
   //driver.findElement(By.linkText("VIEW BAG")).clear(); 
    //driver.findElement(By.linkText("VIEW BAG")).sendKeys("checkout");
    //driver.get("https://tjmaxx.tjx.com/store/checkout/cart.jsp");
   driver.manage().deleteAllCookies();
    
    
   
  }

}
