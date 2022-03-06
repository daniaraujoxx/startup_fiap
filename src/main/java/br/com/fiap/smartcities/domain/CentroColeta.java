package br.com.fiap.smartcities.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_CTR_COLETA")
public class CentroColeta {

	@Id
	@Column(name = "id_ctr_coleta")
    @SequenceGenerator(name = "coleta", sequenceName = "sq_coleta", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "coleta")
	private int id;

	@Column(name = "nr_cnpj", nullable = false, length = 14, unique = true)
	private String cnpj;
	
	@Column(name = "nm_ctr_coleta", nullable = false, length = 80)
	private  String nomeColeta;

	@Column(name = "ds_endereco", nullable = false, length = 150)
	private String endereco;

	@Column(name = "nr_telefone", nullable = false, length = 11)
	private String telefone;

	@OneToMany(mappedBy = "centroColeta")
	private List<Ponto> pontos;
	
	public CentroColeta() {
		super();
	}

	public CentroColeta(int id, String cnpj, String nomeColeta, String endereco, String telefone) {
		super();
		this.id = id;
		this.cnpj = cnpj;
		this.nomeColeta = nomeColeta;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeColeta() {
		return nomeColeta;
	}

	public void setNomeColeta(String nomeColeta) {
		this.nomeColeta = nomeColeta;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "[id = " + id + ", nome = " + nomeColeta + ", cnpj = " + cnpj + ", endereço = " + endereco + ", telefone = " + telefone + "]";
	}
	
}
