package com.bridgelabz.utils;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import java.io.*;

public class ExcelUtils extends ExcelUtilsBase {
    public static ExcelUtilsBase excelUtilsBase = new ExcelUtilsBase();

    public static String excelData() throws IOException {
        XSSFSheet sheet = excelUtilsBase.excel_utils_base().getSheetAt(0);
        XSSFCell username = sheet.getRow(1).getCell(0);
        return String.valueOf(username);
    }

    public static String excelData2() throws IOException {
        XSSFSheet sheet = excelUtilsBase.excel_utils_base().getSheetAt(0);
        XSSFCell password = sheet.getRow(1).getCell(1);
        return String.valueOf(password);
    }

}