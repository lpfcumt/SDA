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
//		msg.setSubject("账号申请成功");
//		msg.setRecipients(RecipientType.TO,
//				InternetAddress.parse(students.getEmail()));
//		msg.setContent("<span>"+"亲爱的"+students.getName()+"同学<br />"
//				+ "&emsp;&emsp;您的实验管理系统账号:"+students.getStudents_id()+"已注册成功，快去登录看看有没有要参加的实验去吧！动起来！。"+"<a href=\"http://121.192.191.106\" >"+"立即登录</a>"+"</span>","text/html;charset=gbk");
//		Transport.send(msg);
//	}catch (Exception e) {    
//        e.printStackTrace();    
//    }
	}
}
