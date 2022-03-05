package br.com.fiap.smartcities.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
	
	@ManyToMany(mappedBy = "pontos")
	private List<Onibus> onibus;
	
	public Ponto() {
		
	}

	public Ponto(int ponto) {
		this.ponto = ponto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public List<Onibus> getOnibus() {
		return onibus;
	}

	public void setOnibus(List<Onibus> onibus) {
		this.onibus = onibus;
	}
	
}
