/**
 * Description : verify the amazone web pages test cases
 * Author      : Mayur Mansukh
 * Date        : 21/2/21
 */

package com.bridgelabz.testcase;

import com.bridgelabz.listener.CustomListener;
import com.bridgelabz.pages.LoginPage;
import com.bridgelabz.pages.SearchPage;
import com.bridgelabz.pages.SignOutPage;
import com.bridgelabz.utils.ExcelUtils;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class Amazon_WebPage extends ExcelUtils  {
    @Test(priority = 0)
    public void verify_login_Page() {
        try {
            LoginPage loginObj = new LoginPage(driver);
            loginObj.click_signin_btn();
            loginObj.enter_username(excelData());
            loginObj.enter_username(excelData2());
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.in/ap/signin");
        }catch (Exception e){
            e.getStackTrace();
        }
    }

    @Test(priority = 1)
    public void verify_search_page(){
        SearchPage searchObj = new SearchPage(driver);
        searchObj.select_categories_dropdown();
        searchObj.type_search_text("Mouse");
        searchObj.click_search_button();
        if(driver.getCurrentUrl().matches("https://www.amazon.in/s?k=Mouse&i=computers&ref=nb_sb_noss")) {
            //test.log(LogStatus.PASS, "Navigated to the specified URL");
         }
        else if (driver.getCurrentUrl().matches("https://www.amazon.in/s?k=Mouse&i=computers&ref=nb_sb_noss_2")) {
            }
    }

    @Test(priority = 2)
    public void verify_logout_page(){
        SignOutPage signOutPage = new SignOutPage(driver);
        signOutPage.click_signOut_btn();
        Assert.assertEquals(driver.getTitle(),"Amazon Sign In");
    }

}
