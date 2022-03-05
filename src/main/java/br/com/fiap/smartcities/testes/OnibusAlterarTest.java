package br.com.fiap.smartcities.testes;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.smartcities.domain.Onibus;

public class OnibusAlterarTest {
	
	public static void main(String[] args) {
		
		EntityManager em = null;

		try { 
			
			int idProcurado = 2;
			
			em = Persistence.createEntityManagerFactory("jorge").createEntityManager();
			Onibus onibus = em.find(Onibus.class, idProcurado);
			
			
			em.getTransaction().begin();
			onibus.setNome("805L-88");
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
