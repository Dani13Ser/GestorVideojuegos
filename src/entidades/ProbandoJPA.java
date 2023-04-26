package entidades;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ProbandoJPA {

	public static void main(String[] args) {
		EntityManagerFactory emFactory=Persistence.createEntityManagerFactory("gestorVideojuegos");
		EntityManager em=emFactory.createEntityManager();
	}

}
