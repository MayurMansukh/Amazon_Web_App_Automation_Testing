package com.bridgelabz.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    Properties pro;
    public ConfigReader(){

        File src = new File("./config.properties");
        try {
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   public String get_Amzone_SignIn_Path(){

        String signIn_Path = pro.getProperty("amazone_signin_link");
        return signIn_Path;
   }

    public String get_Amzone_Login_Username(){

        String login_username = pro.getProperty("login_username");
        return login_username;
    }

    public String get_Amzone_Login_Password(){

        String login_password = pro.getProperty("login_password");
        return login_password ;
    }


}
