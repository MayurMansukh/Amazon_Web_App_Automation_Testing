package com.bridgelabz.utils;

import javax.mail.*;
import javax.mail.internet.*;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class Send_TestReport_By_Email {
    public static void main(String[] args) {

        Properties props = new Properties();

        props.put("mail.smtp.host", "smtp.gmail.com");

        props.put("mail.smtp.socketFactory.port", "465");

        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        props.put("mail.smtp.auth", "true");

        props.put("mail.smtp.port", "465");

        props.put("mail.smtp.starttls.enable","true");

        Session session = Session.getDefaultInstance(props,

                new javax.mail.Authenticator() {

                    protected javax.mail.PasswordAuthentication getPasswordAuthentication() {

                        return new PasswordAuthentication("Mansukhmayur99@gmail.com", "P@ssw0rd1@2");

                    }

                });

        try {

            javax.mail.Message message = new MimeMessage(session);


            message.setFrom(new InternetAddress("Mansukhmayur99@gmail.com"));

            message.setRecipients(javax.mail.Message.RecipientType.TO, InternetAddress.parse("testingtestdatablz@gmail.com"));
            message.setSubject("Testing Subject");

            BodyPart messageBodyPart1 = new MimeBodyPart();

            messageBodyPart1.setText("email sent successfull");

            MimeBodyPart messageBodyPart2 = new MimeBodyPart();

            String filename = "C:\\Users\\admin\\IdeaProjects\\Amz_Web_App_Automation\\test-output\\emailable-report.html";

            File att = new File(String.valueOf(new File(filename)));
            messageBodyPart2.attachFile(att);

            Multipart multipart = new MimeMultipart();

            multipart.addBodyPart(messageBodyPart2);

            multipart.addBodyPart(messageBodyPart1);

            message.setContent(multipart);

            Transport.send(message);

            System.out.println("=====Email Sent=====");

        } catch (MessagingException | IOException e) {

            throw new RuntimeException(e);

        }

    }

}

