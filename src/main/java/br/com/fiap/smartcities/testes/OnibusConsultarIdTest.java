package br.com.fiap.smartcities.testes;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.smartcities.domain.Onibus;

public class OnibusConsultarIdTest {

	public static void main(String[] args) {

		EntityManager em = null;

		try { 
			
			int idProcurado = 2;
			
			em = Persistence.createEntityManagerFactory("jorge").createEntityManager();
			Onibus onibus = em.find(Onibus.class, idProcurado);

			System.out.println("Ônibus encontrado: " + onibus.getNome());
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}

	}

}
