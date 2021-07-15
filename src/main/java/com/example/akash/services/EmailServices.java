package com.example.akash.services;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

@Service
public class EmailServices {

	public boolean sendMail(String subject,String message,String to) {
		
		boolean f = true;
		String userName ="akashinkar777@gmail.com";
		String password ="@k@$h777";
		String from = "akashinkar777@gmail.com";
		
				String host="smtp.gmail.com";
		
		//get the system properties
		Properties properties = System.getProperties();
		System.out.println("PROPERTIES "+properties);
		
		
		//setting important information to properties object
		
				//host set
				properties.put("mail.smtp.host", host);
				properties.put("mail.smtp.port","465");
				properties.put("mail.smtp.ssl.enable","true");
				properties.put("mail.smtp.auth","true");
				properties.put("mail.smtp.password", password);
				properties.put(password, password);
				properties.put(userName, userName);
		
		
		
				
				
				
				//Step 1: to get the session object..  PasswordAuthentication(userName="akashinkar777@gmail.com", password="@k@$h777");
				Session session=Session.getInstance(properties, new Authenticator() {
					@Override
					protected PasswordAuthentication getPasswordAuthentication() {				
						return new PasswordAuthentication(userName,password);
					}
					
					
					
				});
				
				session.setDebug(true);
				
				
				//Step 2 : compose the message [text,multi media]
				MimeMessage m = new MimeMessage(session);
				
				try {
				
				//from email
				m.setFrom(from);
				
				//adding recipient to message
				m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
				
				//adding subject to message
				m.setSubject(subject);
			
				
				//adding text to message
				m.setText(message);
				
				//send 
				
				//Step 3 : send the message using Transport class
				Transport.send(m);
				
				System.out.println("Sent success...................");
				
				
				}catch (Exception e) {
					e.printStackTrace();
				}
				
				return f;
		
		
	}

}
