package com.bridgelabz.pages;

import com.bridgelabz.BASE.Base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class WrongPasswordPage extends Base {
    Robot robot;

    public WrongPasswordPage() throws AWTException {
       robot = new Robot();
    }

    public void wrong_Password_page(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/ap/signin");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        for (int i=1; i <= 15; i++) {
           robot.keyPress(KeyEvent.VK_TAB);
           robot.keyRelease(KeyEvent.VK_TAB);
       }
        StringSelection stringSelection = new StringSelection("https://www.amazon.in/ ");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.setAutoDelay(5000);
    }

    public static void main(String[] args) throws AWTException {
        WrongPasswordPage wrongPasswordPage = new WrongPasswordPage();
        wrongPasswordPage.wrong_Password_page();

    }
}