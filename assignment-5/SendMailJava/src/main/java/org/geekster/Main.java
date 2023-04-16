package org.geekster;

public class Main {
    public static void main(String[] args){

        // prepare to send email
        System.out.println("This application is supposed to send emails");

        HandleMail mailer = new HandleMail();
        mailer.sendMail();
    }
}