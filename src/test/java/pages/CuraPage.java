package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CuraPage {

    public CuraPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="btn-make-appointment")
    public WebElement makeAppointmentButton;

    @FindBy(id="txt-username")
    public WebElement userNameInput;

    @FindBy(id="txt-password")
    public WebElement passwordInput;

    @FindBy(id="btn-login")
    public WebElement loginButton;

    @FindBy(xpath="//p[contains(text(),'login failed')]")
    public WebElement loginFailedText;


}
