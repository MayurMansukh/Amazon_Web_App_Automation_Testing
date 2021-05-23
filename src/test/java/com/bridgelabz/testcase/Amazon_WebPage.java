/**
 * Description : verify the amazone web pages test cases
 * Author      : Mayur Mansukh
 * Date        : 21/2/21
 */

package com.bridgelabz.testcase;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_WebPage extends Base {

    @Test
    public void verify_login_Page(){
        LoginPage loginObj = new LoginPage(driver);
        loginObj.click_signin_btn();
        loginObj.login("mansukh99@gmail.com","Password");
        Assert.assertEquals(driver.getTitle(),"Amazon Sign In","success");
        System.out.println("login successfully");
    }
}
