/**
 * Description : verify the amazone web pages test cases
 * Author      : Mayur Mansukh
 * Date        : 21/2/21
 */

package com.bridgelabz.testcase;

import com.bridgelabz.base.Base;
import com.bridgelabz.listener.CustomListener;
import com.bridgelabz.pages.LoginPage;
import com.bridgelabz.pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class Amazon_WebPage extends Base {

    @Test
    public void verify_login_Page(){
        LoginPage loginObj = new LoginPage(driver);
        loginObj.click_signin_btn();
        loginObj.login("mansukhmayur99@gmail.com","P@ssw0rd1@2");
        Assert.assertEquals(driver.getTitle(),"Amazon Sign In","success");
    }

    @Test
    public void verify_search_page(){
        SearchPage searchObj = new SearchPage(driver);
        searchObj.select_categories_dropdown();
        searchObj.type_search_text("Mouse");
        searchObj.click_search_button();
        Assert.assertEquals(driver.getTitle(),"Amazon.in : Mouse");
    }
}
