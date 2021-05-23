package com.bridgelabz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchPage {
    WebDriver driver;

    //constructor
    public SearchPage(WebDriver driver){

        this.driver=driver;
    }

    public void select_categories_dropdown(){
        Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
        dropdown.selectByVisibleText("Computers & Accessories");
    }

    public void type_search_text(String text){

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(text);
    }

    public void click_search_button(){

        driver.findElement(By.id("nav-search-submit-button")).click();
    }

}

