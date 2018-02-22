package it.eng.projectwork.group1.email;

import javax.ejb.Stateless;

import it.eng.projectwork.group1.email.exception.MailNotSendException;

@Stateless
public class SendMailImpl implements SendEmail {

	@Override
	public void sendMailAllUser(Message message) throws MailNotSendException {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendMail(Message message, String destination) throws MailNotSendException {
		// TODO Auto-generated method stub

	}

}
