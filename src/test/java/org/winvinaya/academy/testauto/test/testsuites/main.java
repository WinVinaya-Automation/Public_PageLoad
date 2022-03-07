package org.winvinaya.academy.testauto.test.testsuites;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class main {
	public static void main(String arug[]) {

		String host="smtp.gmail.com";
		final String user="winvinayajenkins@gmail.com";
		final String password="winvinaya@123";

		String to="winvinayajenkins@gmail.com";

		//imported code
		Properties props = new Properties();
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.user", user);
		props.put("mail.smtp.password", password);
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.auth", "true");


		Session session = Session.getDefaultInstance(props,
				new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user,password);
			}
		});

		//imported code
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("Dwight from the future");
			message.setText("At 8:00, someone poisons the coffee. Do NOT drinkit.");


			Transport.send(message);

			System.out.println("message sent!");

		}
		catch (MessagingException mex)
		{
			System.out.println("Error: unable to send message....");
			mex.printStackTrace();
		}

	}
}


