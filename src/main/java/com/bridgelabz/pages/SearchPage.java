package com.bridgelabz.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchPage {
    public WebDriver driver;

    @FindBy(id="searchDropdownBox")
    WebElement department;

    @FindBy(id="twotabsearchtextbox")
    WebElement search_txt;

    @FindBy(id="nav-search-submit-button")
    WebElement search_btn;


    //constructor
    public SearchPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    public void select_categories_dropdown(){
        Select dropdown = new Select(department);
        dropdown.selectByVisibleText("Computers & Accessories");
    }

    public void type_search_text(String text){
        search_txt.sendKeys(text);
    }

    public void click_search_button(){
        search_btn.click();
    }

}

