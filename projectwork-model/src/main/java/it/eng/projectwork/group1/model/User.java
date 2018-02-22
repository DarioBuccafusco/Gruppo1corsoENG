package it.eng.projectwork.group1.model;
import javax.persistence.*;
import java.beans.Transient;
import java.util.Date;

@Table(name = "USERN")
@Entity
@Inheritance(strategy=InheritanceType.JOINED) // strategia di mapping della gerarchia delle classi
public class User extends AbstractEntity<String>{
	@Id
	private String username;
	
	private String email;
	private String nome;
	private String cognome;
	
	@Temporal(TemporalType.DATE)
	private Date timeBirth;
	
	@Embedded
	private Address address;
	
	@Transient //utilizziamo Trancient per non duplicare il campo Username nella tabella
	@Override
	public String getOid() {
		return getUsername();
	}
		
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String name) {
		this.nome = name;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public Date getTimeBirth() {
		return timeBirth;
	}
	
	public void setTimeBirth(Date timeBirth) {
		this.timeBirth = timeBirth;
	}
	
}
