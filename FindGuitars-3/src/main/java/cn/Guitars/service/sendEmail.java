package cn.Guitars.service;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class sendEmail {
	
	public String sendEmail(){
		return null;
//	try{
//		Properties props = new Properties();
//		props.setProperty("mail.smtp.auth", "true");
//		props.setProperty("mail.transport.protocol", "smtp");
//		props.setProperty("mail.smtp.host", "smtp.sina.com");
//		Session session = Session.getInstance(props, new Authenticator() {
//			protected PasswordAuthentication getPasswordAuthentication() {
//				return new PasswordAuthentication("zjhfyy0719", ".zjh123654");
//			}
//		});
//		session.setDebug(true);
//		Message msg = new MimeMessage(session);
//		msg.setFrom(new InternetAddress("zjhfyy0719@sina.com"));
//		msg.setHeader("X-Mailer", "Microsoft Outlook Express 6.00.2900.2869");
//		msg.setSubject("�˺�����ɹ�");
//		msg.setRecipients(RecipientType.TO,
//				InternetAddress.parse(students.getEmail()));
//		msg.setContent("<span>"+"�װ���"+students.getName()+"ͬѧ<br />"
//				+ "&emsp;&emsp;����ʵ�����ϵͳ�˺�:"+students.getStudents_id()+"��ע��ɹ�����ȥ��¼������û��Ҫ�μӵ�ʵ��ȥ�ɣ�����������"+"<a href=\"http://121.192.191.106\" >"+"������¼</a>"+"</span>","text/html;charset=gbk");
//		Transport.send(msg);
//	}catch (Exception e) {    
//        e.printStackTrace();    
//    }
	}
}
