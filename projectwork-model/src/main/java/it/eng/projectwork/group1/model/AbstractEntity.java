package it.eng.projectwork.group1.model;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractEntity<PK extends Serializable> {	//passiamo la classe PK: l'estensione della classe 
																// di default Serializable 
public abstract PK getOid();		//prototipo: varia in base alla classe che lo invoca perchè abstract. Se ad AbstraEntity gli passiamo
								//string (come in User), getOid sarà di tipo String.

 @Override
 public String toString() {
  return "[getOid()=" + getOid() + "]";	//0id chiave primaria che distingue le istanze di ogni oggetto. 
 } 
}
