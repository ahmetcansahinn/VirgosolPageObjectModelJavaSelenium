package tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import pages.CuraPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class CuraTest extends BaseTest{

    CuraPage curaPage=new CuraPage();

    @Test
    public void loginSuccessTest(){
        //Tarayıcı açılır (https://katalon-demo-cura.herokuapp.com/)
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

        //Make Appointment butonuna tıklanır
        curaPage.makeAppointmentButton.click();

        //Kullanıcı adı ve şifre girilir (adı: John Doe, şifre: ThisIsNotAPassword)
        curaPage.userNameInput.sendKeys(ConfigurationReader.getProperty("username"));
        curaPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));

        //Login butonuna tıklanır
        curaPage.loginButton.click();

        //BrowserUtils.containsUrl("appointment");
    }

    @Test
    public void loginFailedWithoutPassword (){
        //Tarayıcı açılır (https://katalon-demo-cura.herokuapp.com/)
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

        //Make Appointment butonuna tıklanır
        curaPage.makeAppointmentButton.click();

        //Kullanıcı adı girilir şifre girilmez (adı: John Doe, şifre: ThisIsNotAPassword)
        curaPage.userNameInput.sendKeys(ConfigurationReader.getProperty("username"));

        //Login butonuna tıklanır
        curaPage.loginButton.click();

        assertTrue(curaPage.loginButton.isDisplayed());
    }

    @Test
    public void loginFailedWithoutUserName (){
        //Tarayıcı açılır (https://katalon-demo-cura.herokuapp.com/)
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

        //Make Appointment butonuna tıklanır
        curaPage.makeAppointmentButton.click();

        //Kullanıcı adı girilmez şifre girilir (adı: John Doe, şifre: ThisIsNotAPassword)
        curaPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));

        //Login butonuna tıklanır
        BrowserUtils.hover(curaPage.loginButton);
        curaPage.loginButton.click();

        assertTrue(curaPage.loginButton.isDisplayed());
    }
}
