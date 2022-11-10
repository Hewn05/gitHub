package smtp;

import java.util.Map;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class NaverSmtp {
	private final Properties serverInfo;
	private final Authenticator auth;

	public NaverSmtp() {
		serverInfo = new Properties();
		serverInfo.put("mail.smtp.host", "smtp.naver.com");
		serverInfo.put("mail.smtp.port", "465");
		serverInfo.put("mail.smtp.auth", "true");
		serverInfo.put("mail.smtp.starttls.enable", "true");
		serverInfo.put("mail.smtp.starttls.required", "true");
		serverInfo.put("mail.smtp.ssl.enable", "true");
		serverInfo.put("mail.smtp.ssl.trust", "smtp.naver.com");
		serverInfo.put("mail.smtp.ssl.protocols", "TLSv1.2");
		serverInfo.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

		auth = new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("goddlsdurgkf", "hewn051628*");
			}
		};
	}

	public void emailSending(Map<String, String> mailInfo) throws MessagingException {
		// 1. 세션 생성
		Session session = Session.getInstance(serverInfo, auth);
		session.setDebug(true);

		// 2. 메세지 작성
		MimeMessage msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress(mailInfo.get("from")));
		msg.addRecipient(Message.RecipientType.TO, new InternetAddress(mailInfo.get("to")));
		msg.setSubject(mailInfo.get("subject"));
		msg.setContent(mailInfo.get("content"), mailInfo.get("format"));

		// 3. 전송
		Transport.send(msg);
		System.out.println("message sent");
	}
}
