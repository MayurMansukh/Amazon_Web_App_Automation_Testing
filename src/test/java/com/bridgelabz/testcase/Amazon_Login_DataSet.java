package com.bridgelabz.testcase;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.LoginPage;
import com.bridgelabz.pages.SignOutPage;
import com.bridgelabz.utils.ExcelUtilsBase;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.annotations.Test;
import java.io.IOException;

public class Amazon_Login_DataSet extends Base {

    @Test
    public static void AmazonLogin() throws IOException {
        LoginPage loginObj = new LoginPage(driver);
        SignOutPage signOutPage = new SignOutPage(driver);
        ExcelUtilsBase excelBase = new ExcelUtilsBase();
        XSSFSheet sheet = excelBase.excel_utils_base().getSheetAt(0);
        for ( int i = 1; i <=sheet.getLastRowNum() ; i++) {
            System.out.println("test started with data "+i);
            driver.get("https://www.amazon.in/");
            loginObj.click_signin_btn();
            String username1 = String.valueOf(sheet.getRow(i).getCell(0));
            String password1 = String.valueOf(sheet.getRow(i).getCell(1));
            loginObj.login(username1,password1);
            signOutPage.click_signOut_btn();
            System.out.println("test sucess with data "+i);
        }

    }
}
