package com.bridgelabz.utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    public static void main(String[] args) {
        get_Cell_Data_String(1,0);

    }

    public static String get_Cell_Data_String(int rowNum, int colNum){
        try {
            workbook = new XSSFWorkbook("C:/Users/admin/IdeaProjects/Amz_Web_App_Automation/Excel/Data.xlsx");
            sheet = workbook.getSheet("Sheet1");
            String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
            return cellData;
        }catch (Exception e){
            e.getStackTrace();
        }
        return null;
    }
//
//    public static void get_cell_data_numeric(int rowNum, int colNum){
//        try {
//            workbook = new XSSFWorkbook("C:/Users/admin/IdeaProjects/Amz_Web_App_Automation/Excel/Data.xlsx");
//            sheet = workbook.getSheet("Sheet1");
//            double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
//            System.out.println(cellData);
//        }catch (Exception e){
//            e.getStackTrace();
//        }
//    }

}
