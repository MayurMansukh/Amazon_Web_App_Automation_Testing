package com.bridgelabz.testcase;

import com.bridgelabz.BASE.Base;
import com.bridgelabz.pages.LoginPage;
import com.bridgelabz.pages.SignOutPage;
import com.bridgelabz.utils.ExcelUtilsBase;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.annotations.Test;

import java.io.IOException;

public class Amazone_Login_KeywordDrivenFramework extends Base {

    @Test
    public void AmazoneLogin() throws IOException {
        LoginPage loginObj = new LoginPage(driver);
        SignOutPage signOutPage = new SignOutPage(driver);
        ExcelUtilsBase excelBase = new ExcelUtilsBase();
        XSSFSheet sheet = excelBase.excel_utils_base().getSheetAt(0);
        boolean check;

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            String username = String.valueOf(sheet.getRow(i).getCell(0));
            String password = String.valueOf(sheet.getRow(i).getCell(1));
            String actions = String.valueOf(sheet.getRow(i).getCell(2));


            switch (actions) {
                case " test with data1":
                    loginObj.click_signin_btn();
                    check = loginObj.enter_username(username);
                    if (check) {
                        check = loginObj.enter_password(password);
                        if (check) {
                            check = signOutPage.click_signOut_btn();
                            if (check) {
                                System.out.println("Action " + i + " is successfull");
                                driver.get("https://www.amazon.in/");
                            }
                        } else {
                            System.out.println("test failed with data " + i);
                        }
                    }
                    break;
                case " test with data2":
                    loginObj.click_signin_btn();
                    check = loginObj.enter_username(username);
                    if (check) {
                        check = loginObj.enter_password(password);
                        if (check) {
                            check = signOutPage.click_signOut_btn();
                            if (check) {
                                System.out.println("Action " + i + " is successfull");
                                driver.get("https://www.amazon.in/");
                            }
                        } else {
                            System.out.println("test failed with data 2 ");
                        }
                    }
                    break;
                case " test with data3":
                    loginObj.click_signin_btn();
                    check = loginObj.enter_username(username);
                    if (check) {
                        check = loginObj.enter_password(password);
                        if (check) {
                            check = signOutPage.click_signOut_btn();
                            if (check) {
                                System.out.println("Action " + i + " is successfull");
                                driver.get("https://www.amazon.in/");
                            }
                        } else {
                            System.out.println("test failed with data3 ");
                        }
                    }
                    break;
                default:
                    System.out.println("Action Not available");
            }
        }
    }
}

