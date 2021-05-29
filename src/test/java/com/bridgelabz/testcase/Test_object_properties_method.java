package com.bridgelabz.testcase;
import com.bridgelabz.BASE.Base;
import com.bridgelabz.pages.LoginPage;
import com.bridgelabz.utils.ConfigReader;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_object_properties_method extends Base {
    static ExtentTest test;
    static ExtentReports report;

    @BeforeTest
    public void startTest()
    {
        System.setProperty("org.freemarker.loggerLibrary", "none");
        report = new ExtentReports(System.getProperty("C:\\Users\\admin\\IdeaProjects\\Amz_Web_App_Automation")+"ExtentReportResults.html");
        test = report.startTest("Test_object_properties_method");
        System.out.println(System.getProperty("user.dir"));
    }

    @Test(priority = 0)
    public void verify_login_Page() {
        ConfigReader config =new ConfigReader();
        LoginPage loginObj = new LoginPage(driver);
        loginObj.click_signin_btn();
        loginObj.enter_username(config.get_Amzone_Login_Username());
        loginObj.enter_password(config.get_Amzone_Login_Password());
        Assert.assertEquals(driver.getTitle(),"Amazon Sign In");
        test.log(LogStatus.PASS, "Navigated to the specified URL");
    }

    @AfterClass
    public static void endTest()
    {
        report.endTest(test);
        report.flush();
    }
}
