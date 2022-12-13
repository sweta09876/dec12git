/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 *
 * @author Sweta
 */
public class NewtjmaxxTest {
   private WebDriver driver;
   private String baseUrl; 
    public NewtjmaxxTest() {
    
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
       }
    @Test
    public void executeSearchboxModule() throws Exception {
    Searchbox searchbox = PageFactory.initElements(driver, Searchbox.class);
    searchbox.loginToFlighApplication("gloves");
    }
    

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    //public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://www.tjmaxx.tjx.com/store/index.jsp/";
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    driver.close();
    }
    
   @Test
   public void testUntitledTestCase() throws Exception {
    driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TewNE8yLlZgNGB0YPBiK8nKTayoAABBwAYF&q=tjmaxx&oq=&aqs=chrome.0.46i39i199i362i465j35i39i362l7.82268841j0j15&sourceid=chrome&ie=UTF-8");
   // driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/a/h3")).click();
    driver.get("https://tjmaxx.tjx.com/store/index.jsp");
    driver.findElement(By.id("search-text-input")).click();
    driver.findElement(By.id("search-text-input")).clear();
    driver.findElement(By.id("search-text-input")).sendKeys("gloves");
    driver.findElement(By.id("site-search-form")).submit();
    driver.get("https://tjmaxx.tjx.com/store/shop/?_dyncharset=utf-8&initSubmit=true&Ntt=gloves&qfh_sch=Search");
    driver.findElement(By.xpath("//img[@alt='Shearling Classic Perforated Gloves']")).click();
    driver.get("https://tjmaxx.tjx.com/store/jump/product/Shearling-Classic-Perforated-Gloves/1000746992?colorId=NS1003569&pos=1:31&Ntt=gloves");
    driver.findElement(By.xpath("//div[@id='product-1000746992']/section/div[2]/form/div[3]/div/div[2]/ul/li/a/span")).click();
    driver.findElement(By.id("addItemToOrder")).click();
    driver.findElement(By.linkText("VIEW BAG")).click();
    driver.get("https://tjmaxx.tjx.com/store/checkout/cart.jsp");
       
    }
}
