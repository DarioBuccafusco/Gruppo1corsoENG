package it.eng.projectwork.group1.model;
import javax.persistence.*;

@Entity
public class User {
	@Id
	private String username;

	private String nome;

	private String cognome;

	private String email;

	public User(){}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}	
	
	@Override
	public String toString() {
		return "User [username=" + username + ", nome" + nome + ", cognome= " +  cognome + ", email= " + email + "]";
	}
	
	
}