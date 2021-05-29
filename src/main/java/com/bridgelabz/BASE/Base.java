package com.bridgelabz.BASE;

import com.bridgelabz.utils.ConfigReader;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class Base {

    public static WebDriver driver;
    public static Logger logger = Logger.getLogger(Base.class);

    @BeforeTest
    public void load_log4j(){
        PropertyConfigurator.configure("log4j.properties");
    }

    @BeforeTest
    public void setup(){
        ConfigReader config =new ConfigReader();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(config.get_Amzone_SignIn_Path());
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    @AfterTest
    public void teardown() {
        //driver.quit();
        driver.close();
    }


}
