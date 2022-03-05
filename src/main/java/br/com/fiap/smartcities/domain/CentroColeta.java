package br.com.fiap.smartcities.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_CTR_COLETA")
public class CentroColeta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_ctr_coleta")
	private int id;

	@Column(name = "nr_cnpj")
	private String cnpj;

	@Column(name = "nr_ctr_coleta")
	private int numero;

	@Column(name = "ds_endereco")
	private String endereco;

	@Column(name = "nr_telefone")
	private int telefone;


}
