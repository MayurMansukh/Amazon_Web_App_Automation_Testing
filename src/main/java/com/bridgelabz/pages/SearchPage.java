package com.bridgelabz.pages;

import com.bridgelabz.BASE.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchPage extends Base {
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
        logger.getLogger(LoginPage.class.getName()).warn("Test is started");

    }

    public void select_categories_dropdown(){
        logger.info("select department");
        Select dropdown = new Select(department);
        dropdown.selectByVisibleText("Computers & Accessories");
    }

    public void type_search_text(String text){
        logger.info("entering search text");
        search_txt.sendKeys(text);
    }

    public void click_search_button(){
        logger.info("clicking search btn");
        search_btn.click();
    }

}

