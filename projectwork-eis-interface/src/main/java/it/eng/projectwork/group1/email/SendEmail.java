package it.eng.projectwork.group1.email;
import javax.ejb.Local;
import it.eng.projectwork.group1.email.exception.MailNotSendException;

@Local
public interface SendEmail {
	public void sendMailAllUser(Message message) throws MailNotSendException;
	public void sendMail(Message message,String destination) throws MailNotSendException;
}
