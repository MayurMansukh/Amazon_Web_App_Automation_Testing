package com.bridgelabz.pages;

import com.bridgelabz.BASE.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {
    public WebDriver driver;

    @FindBy(id="nav-link-accountList")
    WebElement signIn_Btn;

    @FindBy(id="ap_email")
    WebElement email_txt;

    @FindBy(id="continue")
    WebElement email_submit_btn;

    @FindBy(id="ap_password")
    WebElement password_txt;

    @FindBy(id="signInSubmit")
    WebElement password_submit_btn;

    //constructor
    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
        logger.getLogger(LoginPage.class.getName()).warn("Test is started");
    }

    public void click_signin_btn() {
        logger.info("clicking signIn btn");
        signIn_Btn.click();
    }

    public boolean enter_username(String id){
        logger.info("Entering username");
        email_txt.sendKeys(id);
        email_submit_btn.click();
        return true;
    }

    public boolean enter_password(String pass){
        logger.info("Entering Password");
        password_txt.sendKeys(pass);
        password_submit_btn.click();
        return true;
    }

}
