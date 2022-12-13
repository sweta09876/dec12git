/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
public class kattjmaxTest {
    private WebDriver driver;
  private String baseUrl; 
    public kattjmaxTest() {
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
       System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://tjmaxx.tjx.com/store/index.jsp/";
    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.close();
    }
//   @Test
//  public void testFacebookTestCase() throws Exception {
//    driver.get("https://www.google.com/search?q=facebook&oq=facebook&aqs=chrome.0.69i59l2j0i131i433i512l2j0i131i433j0i131i433i512l2j0i512j0i131i433.3138j0j15&sourceid=chrome&ie=UTF-8");
//    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/a/h3")).click();
//    driver.get("https://www.tjmaxx.com/");
//    driver.findElement(By.id("email")).click();
//    driver.findElement(By.id("email")).clear();
//    driver.findElement(By.id("email")).sendKeys(FileUtil.loadData().getUsername());
//    driver.findElement(By.id("pass")).click();
//    driver.findElement(By.id("pass")).clear();
////    driver.findElement(By.id("text-input-pass")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
//    driver.findElement(By.id("pass")).sendKeys(FileUtil.loadData().getPassword());
//    driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);  
@Test
  public void testTjmaxxTestCase() throws Exception {
    driver.get("https://www.google.com/search?q=tjmaxx&oq=tjmaxx&aqs=chrome.0.0i271j46i131i199i433i465i512j69i59j0i131i433i512j0i512j0i131i433i457i512j46i175i199i402j0i402j0i512j0i131i433i512.3412j0j15&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/a/h3")).click();
    driver.get("https://tjmaxx.tjx.com/store/index.jsp");
    driver.findElement(By.linkText("Account")).click();
    driver.findElement(By.id("login-id")).click();
    driver.findElement(By.id("login-id")).clear();
    driver.findElement(By.id("login-id")).sendKeys("sweta4807@hotmail.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("loginSubmit")).click();
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("Seleniumsweta@1");
    driver.findElement(By.xpath("//div[@id='modal-content']/div/section/section/div/div")).click();
    driver.findElement(By.id("search-text-input")).click();
    driver.findElement(By.id("search-text-input")).clear();
    driver.findElement(By.id("search-text-input")).sendKeys("socks");
    driver.findElement(By.id("site-search-form")).submit();
    driver.get("https://tjmaxx.tjx.com/store/shop/?_dyncharset=utf-8&initSubmit=true&Ntt=socks&qfh_sch=Search");
    driver.findElement(By.xpath("//img[@alt='2pk Plush Diamond Fair Isle Crew Socks']")).click();
    driver.get("https://tjmaxx.tjx.com/store/jump/product/2pk-Plush-Diamond-Fair-Isle-Crew-Socks/1000733581?colorId=NS1003537&pos=1:1&Ntt=socks");
    driver.findElement(By.id("addItemToOrder")).click();
    driver.findElement(By.linkText("VIEW BAG")).click();
    driver.get("https://tjmaxx.tjx.com/store/checkout/cart.jsp");
  }

}

