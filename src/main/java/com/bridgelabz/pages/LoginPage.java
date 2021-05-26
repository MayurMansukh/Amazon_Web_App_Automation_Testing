package com.bridgelabz.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
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
    }

    public void click_signin_btn() {
         signIn_Btn.click();
    }

    public boolean login(String id, String pass){
        email_txt.sendKeys(id);
        email_submit_btn.click();
        password_txt.sendKeys(pass);
        password_submit_btn.click();
        return true;
    }

}
