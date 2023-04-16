package org.geekster;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class HandleMail {

    void sendMail() {

        // gmail host : SMTP (simple mail transfer protocol)
        String host = "smtp.gmail.com";

        Properties props = System.getProperties();

        System.out.println(props);

        // set properties

        props.put("mail.smtp.host" , host);
        props.put("mail.smtp.port" , 465);
        props.put("mail.smtp.ssl.enable", "true");
        props.put("mail.smtp.auth" , "true");

        // session
        Session mailSession = Session.getInstance(props, new MailAuthenticator());

        // create a message object

        MimeMessage mimeMessage = new MimeMessage(mailSession);


        try {

            // sender
            mimeMessage.setFrom(MailConstants.SENDER);

            // receiver
            mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(MailConstants.RECEIVERMAILADDRESS));

            // subject
            mimeMessage.setSubject(MailConstants.SUBJECT);

            // message
            mimeMessage.setText(MailConstants.MESSAGE);

            Transport.send(mimeMessage);

        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }
}
