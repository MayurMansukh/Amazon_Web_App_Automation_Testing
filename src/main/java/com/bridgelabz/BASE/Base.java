package com.bridgelabz.BASE;

import com.bridgelabz.utils.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        try {
            final URL url = new URL("");
            Thread.sleep(1000);
            final URLConnection conn = url.openConnection();
            conn.connect();
            conn.getInputStream().close();
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        driver.get("https://www.naukri.com/");
        //driver.get(config.get_Amzone_SignIn_Path());

    }

    @AfterTest
    public void teardown() {
        //driver.quit();
       //driver.close();
    }


}
