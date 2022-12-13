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
public class Searchbox {
 WebDriver driver;

    public Searchbox(WebDriver driver) {
        this.driver = driver;
    }
        @FindBy(xpath = ".//*[@searchbox='gloves']")
        private WebElement searchbox;
        public void loginToFlighApplication(String gloves)
        throws Exception {
        try {
            driver.get("https://tjmaxx.tjx.com/");
            searchbox.sendKeys(gloves);
            //   submitBtn.click();
            //   LoginPage login = new LoginPage(driver);
       } catch (Exception ex) {
            ex.printStackTrace();
        }

}
}