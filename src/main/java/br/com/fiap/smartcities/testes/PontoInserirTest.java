package br.com.fiap.smartcities.testes;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.smartcities.domain.Ponto;

public class PontoInserirTest {

	public static void main(String[] args) {
		EntityManager em = null;

		try { 
			
			em = Persistence.createEntityManagerFactory("jorge").createEntityManager();
			em.getTransaction().begin();
			
			Ponto ponto1 = new Ponto();
			ponto1.setNome("Ponto A");
			ponto1.setNumero(123);
			ponto1.setFlag(true);
			em.persist(ponto1);
			
			Ponto ponto2 = new Ponto();
			ponto2.setNome("Ponto B");
			ponto2.setNumero(12334);
			ponto2.setFlag(false);
			em.persist(ponto2);
			
			em.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			if (em != null && em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}

	}

}
