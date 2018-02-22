package it.eng.projectwork.group1.model.test;

import java.util.List;

import javax.persistence.Query;

import org.junit.Test;

import it.eng.projectwork.group1.model.User;

public class JpacrudTest extends JPAHibernateTest {

	
	@Test
	public void test1() {
		em.getTransaction().begin();	//Entity Manager, avvia la transazione ed inizializza il contenitore, inserendo un elemento
		
		
		User u = new User();
		u.setNome("giancarlo");
		u.setCognome("compagno");
		u.setUsername("giacompa");
		u.setEmail("giancarlo.compagno@eng.it");
		
		
		em.persist(u);
		
		
		em.getTransaction().commit();
		
	}
	
	@Test
	public void test2() {
		
		Query query = em.createQuery("SELECT u FROM User u WHERE u.email=:email");
		query.setParameter("email", "giancarlo.compagno@eng.it");
		List<User> users = query.getResultList();
		for(User user : users) {
			System.out.println(user); //All'interno del println è implicita la chiamata al metodo ToString
		}	 
	}
	
}
