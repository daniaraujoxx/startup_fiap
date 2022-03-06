package br.com.fiap.smartcities.testes;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.smartcities.domain.CentroColeta;


public class CentroColetaTest {

	public static void main(String[] args) {
		EntityManager em = null;

		try { 
			
			em = Persistence.createEntityManagerFactory("jorge").createEntityManager();
			
			em.getTransaction().begin();
			
			//Cria��o
			
			CentroColeta centro = new CentroColeta();
			centro.setCnpj("12345678912345");
			centro.setNomeColeta("ReciclaTesc");
			centro.setEndereco("R. Prof. Helv�deo Gouv�ia, 181 - Vila Boa Vista, S�o Carlos - SP");
			centro.setTelefone("11563202412");
			
			em.persist(centro);
			
			em.getTransaction().commit();
			
			//Consulta
			
			CentroColeta centroCons = em.find(CentroColeta.class, 1);

			System.out.println("Centro de coleta encontrado: " + centroCons);
			
			//Altera��o
			
			em.getTransaction().begin();
			
			centroCons.setNomeColeta("Reciclall");
			
			em.getTransaction().commit();
			
			//Exclus�o
			
			em.getTransaction().begin();
			
			em.remove(centroCons);
			
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
