package com.bridgelabz.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public WebDriver driver;

    //constructor
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public void click_signin_btn() {
        driver.findElement(By.id("nav-link-accountList")).click();
    }

    public void login(String id, String pass){
        driver.findElement(By.id("ap_email")).sendKeys(id);
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys(pass);
        driver.findElement(By.id("signInSubmit")).click();
    }

}
