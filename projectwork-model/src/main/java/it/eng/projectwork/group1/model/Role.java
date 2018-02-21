package it.eng.projectwork.group1.model;

import java.beans.Transient; //inserito per poter definire getOid transient

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Role extends AbstractEntity<String>{

	@Id
	private String code;
	private String description;
	
	public String getCode() {
		return code;
	}

	//@Override non necessario perche il metodo Oid nella classe madre è astratto
	@Transient // necessario per non duplicare il valore code in tabella
	public String getOid() {
		return getCode();
	}
	
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}

}
