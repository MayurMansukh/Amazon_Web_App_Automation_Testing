package com.bridgelabz.utils;

import org.automationtesting.excelreport.Xl;

public class ExcelGenerateReport {
    public static void main(String[] args) throws Exception
    {
        Xl.generateReport("excel-report.xlsx");
    }
}
