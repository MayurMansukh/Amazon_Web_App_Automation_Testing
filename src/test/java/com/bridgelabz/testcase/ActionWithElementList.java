package com.bridgelabz.testcase;

import com.bridgelabz.pages.LoginPage;
import com.bridgelabz.pages.SearchPage;
import com.bridgelabz.utils.ExcelUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class ActionWithElementList extends ExcelUtils {


    @Test(priority = 0)
    public void verify_login_Page() throws IOException {
        LoginPage loginObj = new LoginPage(driver);
        loginObj.click_signin_btn();
        loginObj.login(excelData(), excelData2());
        if (driver.getCurrentUrl().matches("https://www.amazon.in/?ref_=nav_ya_signin&")) {
        } else if (driver.getCurrentUrl().matches("https://www.amazon.in/ap/signin")) {
        }
    }

    @Test(priority = 1)
    public void verify_search_page() {
        SearchPage searchObj = new SearchPage(driver);
        searchObj.select_categories_dropdown();
        searchObj.type_search_text("Mouse");
        searchObj.click_search_button();
        if (driver.getCurrentUrl().matches("https://www.amazon.in/s?k=Mouse&i=computers&ref=nb_sb_noss")) {
        } else if (driver.getCurrentUrl().matches("https://www.amazon.in/s?k=Mouse&i=computers&ref=nb_sb_noss_2")) {
        }
    }

    @Test(priority = 2)
    public void testListOfElements() {
        List<WebElement> searchList = driver.findElements(By.partialLinkText("Mouse"));
            for (WebElement webElement : searchList) {
                String name = webElement.getText();
                System.out.println("\n" + name);
            }
    }

}
