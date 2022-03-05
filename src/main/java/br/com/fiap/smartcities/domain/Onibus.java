package br.com.fiap.smartcities.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ONIBUS")
public class Onibus {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_onibus")
	private int id;

	@Column(name="nm_onibus")
	private String nome;
	
	@Column(name="ds_linha")
	private String linha;
}
