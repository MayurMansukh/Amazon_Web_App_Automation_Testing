package com.bridgelabz.pages;

import com.bridgelabz.BASE.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOutPage extends Base {

    public WebDriver driver;

    @FindBy(id="nav-hamburger-menu")
    WebElement menu;

    @FindBy(linkText="Sign Out")
    WebElement signout;

    public SignOutPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        logger.getLogger(LoginPage.class.getName()).warn("Test is started");
    }

    public boolean click_signOut_btn() {
        logger.info("clicking signout btn");
        menu.click();
        signout.click();
        return true;
    }
}
