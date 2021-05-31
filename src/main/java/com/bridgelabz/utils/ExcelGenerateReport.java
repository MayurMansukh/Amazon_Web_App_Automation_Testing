package com.bridgelabz.utils;

import org.automationtesting.excelreport.Xl;
import org.testng.annotations.Test;

public class ExcelGenerateReport {
    @Test
    public void excelReport() throws Exception {
            Xl.generateReport("C:\\Users\\admin\\IdeaProjects\\Amz_Web_App_Automation\\ExcelReport", "excel-report.xlsx");
        }
    }
