package com.bridgelabz.testcase;

import com.automation.remarks.testng.GridInfoExtractor;
import com.automation.remarks.testng.UniversalVideoListener;
import com.automation.remarks.video.annotations.Video;
import com.bridgelabz.BASE.Base;
import com.bridgelabz.pages.FileUpload_By_RobotClass;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.awt.*;
import java.net.URL;

@Listeners(UniversalVideoListener.class)
public class FileUploadTest extends Base {

//    @BeforeClass
//    public void setUp() throws Exception {
//        URL hubUrl = new URL("http://localhost:4444/wd/hub");
//        RemoteWebDriver driver = new RemoteWebDriver(hubUrl, DesiredCapabilities.chrome());
//        String nodeIp = GridInfoExtractor.getNodeIp(hubUrl, driver.getSessionId().toString());
//        System.setProperty("video.remote", "true");
//        System.setProperty("remote.video.hub", nodeIp);
//
//
//    }

    @Test
    public void uploadFile() throws AWTException {
        FileUpload_By_RobotClass cvUpload = new FileUpload_By_RobotClass(driver);
        cvUpload.uploadFile();
        cvUpload.register();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.naukri.com/mnjuser/profile");

    }
}
