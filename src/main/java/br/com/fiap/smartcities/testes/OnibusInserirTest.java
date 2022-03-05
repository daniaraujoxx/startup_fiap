package br.com.fiap.smartcities.testes;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.smartcities.domain.Onibus;
import br.com.fiap.smartcities.domain.Ponto;

public class OnibusInserirTest {

	public static void main(String[] args) {
		
		EntityManager em = null;

		try { 
			
			em = Persistence.createEntityManagerFactory("jorge").createEntityManager();
			em.getTransaction().begin();
			
			List<Ponto> listaPontos = new ArrayList<>();
			listaPontos.add(new Ponto(1));
			listaPontos.add(new Ponto(2));
			
			Onibus onibus = new Onibus("805L-10", listaPontos);
			em.persist(onibus);
			
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
