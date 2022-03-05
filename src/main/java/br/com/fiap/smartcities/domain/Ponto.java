package br.com.fiap.smartcities.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PONTO")
public class Ponto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_ponto")
	private int ponto;
	
	@Column(name="nm_ponto")
	private String nome;
	
	@Column(name="nr_ponto")
	private int numero;
	
	@Column(name="fl_coleta")
	private boolean flag;
	
	

}
