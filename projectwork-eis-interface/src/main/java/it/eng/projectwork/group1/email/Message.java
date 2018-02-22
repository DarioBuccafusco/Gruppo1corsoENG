package it.eng.projectwork.group1.email;

public class Message {
	public static enum TYPE{TEXT,HTML}
	private String oggetto; //final rende non modificabili gli attributi dopo l'inizializzazione
	private String body;
	private TYPE type;
	
	public Message (String oggetto, String body, TYPE type) {
		this.oggetto = oggetto;
		this.body = body;
		this.type = type;
	}
	
	public String getOggetto() {
		return this.oggetto;
	}
	
	public String getBody() {
		return this.body;
	}
	
	public TYPE getType() {
		return this.type;
	}
}
