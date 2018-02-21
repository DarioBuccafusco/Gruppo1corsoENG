package it.eng.projectwork.group1.model;
import java.io.Serializable;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractEntity <PK extends Serializable> {
	public abstract PK getOid();

	@Override
	public String toString() {
		return "[getOid()=" + getOid() + "]";
	}
}
