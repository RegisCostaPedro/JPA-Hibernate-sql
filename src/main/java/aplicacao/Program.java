package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(null,"carlos da silva","Carlos@gmail.com");
		Pessoa p2 = new Pessoa(null,"Ana Rocha","Ana@gmail.com");
		Pessoa p3 = new Pessoa(null,"Wendel da Rosa","wendel@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		//INSERT
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		System.out.println("Pronto!");
		
	}

}
