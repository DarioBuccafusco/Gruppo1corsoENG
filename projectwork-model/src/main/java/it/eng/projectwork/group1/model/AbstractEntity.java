package it.eng.projectwork.group1.model;
import java.io.Serializable;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractEntity <PK extends Serializable> implements Serializable { //Il tipo PK diventa serializable 
	public abstract PK getOid();

	@Override
	public String toString() {
		return "[getOid()=" + getOid() + "]";
	}
}
