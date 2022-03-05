package br.com.fiap.smartcities.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	
	@ManyToMany
	@JoinTable(joinColumns = @JoinColumn(name = "id_onibus"),
				inverseJoinColumns = @JoinColumn(name = "id_ponto"),
				name = "TB_BUS_PNTS")
	private List<Ponto> pontos;
	
	public Onibus() {
		
	}

	public Onibus(String nome, List<Ponto> pontos) {
		this.nome = nome;
		this.pontos = pontos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLinha() {
		return linha;
	}

	public void setLinha(String linha) {
		this.linha = linha;
	}

	public List<Ponto> getPontos() {
		return pontos;
	}

	public void setPontos(List<Ponto> pontos) {
		this.pontos = pontos;
	}
	
}
