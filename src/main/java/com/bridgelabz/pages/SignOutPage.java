package com.bridgelabz.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOutPage {

    public WebDriver driver;

    @FindBy(id="nav-hamburger-menu")
    WebElement menu;

    @FindBy(linkText="Sign Out")
    WebElement signout;

    public SignOutPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public boolean click_signOut_btn() {
        menu.click();
        signout.click();
        return true;
    }
}
