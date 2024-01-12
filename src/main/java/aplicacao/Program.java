package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {

		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
	
		
		// FIND
		
		Pessoa p = em.find(Pessoa.class, 2);
	
		System.out.println(p);
		
		System.out.println("Pronto!");
		em.clear();
		emf.close();
		
		
	}

}
