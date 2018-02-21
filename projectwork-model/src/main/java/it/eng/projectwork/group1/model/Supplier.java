package it.eng.projectwork.group1.model;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table
@Entity
public class Supplier extends User {	//Il comando extends estende la classe User con nuove funzionalità legate al venditore
	private String tipologiaVenditore; //Pubblico, Privato
 
	public Supplier(){}
 
	public String getInfo() {
		return info;
	}
 
 public void setInfo(String info) {
	 this.info = info;
 	}
 
 @Override
 	public String toString() {
	 return "Supplier [User=" + super.toString() + ", getInfo()=" + getInfo() + super.toString() + "]";
 	}
 
}