package com.bridgelabz.utils;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;

public class ExcelUtils {

    public static void excelData() throws IOException {
        File file = new File("C:/Users/admin/IdeaProjects/Amz_Web_App_Automation/Excel/Data.xlsx");
        FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);
        XSSFCell username = sheet.getRow(1).getCell(0);
        System.out.println(username);
    }

    public static void excelData2() throws IOException {
        File file = new File("C:/Users/admin/IdeaProjects/Amz_Web_App_Automation/Excel/Data.xlsx");
        FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);
        XSSFCell password = sheet.getRow(1).getCell(1);
        System.out.println( password);
    }

    public static void main(String[] args) throws IOException {
        excelData();
        excelData2();
    }
}