package com.bridgelabz.utils;

import com.bridgelabz.base.Base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;

public class TakeScreenshot extends Base {

    public static void takeScreenshot(String testMethodName) {
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("C:/Users/admin/IdeaProjects/Amz_Web_App_Automation/ScreenShot/"+testMethodName+" "+".jpg"));
        }catch (IOException e){
            System.out.println("exception:"+e);
            e.printStackTrace();
        }
    }
}
