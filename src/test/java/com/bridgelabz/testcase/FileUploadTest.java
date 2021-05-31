package com.bridgelabz.testcase;

import com.bridgelabz.BASE.Base;
import com.bridgelabz.pages.FileUpload_By_RobotClass;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class FileUploadTest extends Base {

    @Test
    public void uploadFile() throws AWTException {
        FileUpload_By_RobotClass cvUpload = new FileUpload_By_RobotClass(driver);
        cvUpload.uploadFile();
        //cvUpload.register();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.naukri.com/mnjuser/profile");

    }
}
