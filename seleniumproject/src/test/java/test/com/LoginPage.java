/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.com;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Sweta
 */
public class LoginPage {
WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

@FindBy(xpath = ".//*[@name='Email Address']")
    private WebElement userName;

    @FindBy(xpath = ".//*[@name='Password']")
    private WebElement password;

    @FindBy(xpath = ".//*[@name='SIGN IN']")
    private WebElement submitBtn;

    public void loginToFlighApplication(String uName, String pWord)
            throws Exception {
        try {
            driver.get("https://www.tjmaxx.com");
           // https://www.tjmaxx.tjx.com/store/index.jsp/
           // http://demo.guru99.com/test/newtours/index.php
            userName.sendKeys(uName);
            password.sendKeys(pWord);
            submitBtn.click();
            //   LoginPage login = new LoginPage(driver);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }       
}
