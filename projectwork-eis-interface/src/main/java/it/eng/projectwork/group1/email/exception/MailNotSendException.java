package it.eng.projectwork.group1.email.exception;
public class MailNotSendException extends Exception {
	private static final long serialVersionUID = 1L;

	public MailNotSendException(Exception e) {
		super(e);
	}
}
