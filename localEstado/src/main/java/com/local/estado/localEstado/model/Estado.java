package com.local.estado.localEstado.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.local.estado.localEstado.anotacaoValidacao.ExclusivoString;

@Entity
public class Estado {
	
	@Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String capital;
	
	@ExclusivoString @NotNull @NotEmpty
	private String regiao;
	
	private Long populacao;
	private Long area;
	
	public String getRegiao() {
		return regiao;
	}


	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}


	public String getCapital() {
		return capital;
	}


	public void setCapital(String capital) {
		this.capital = capital;
	}


	public Long getPopulacao() {
		return populacao;
	}


	public void setPopulacao(Long populacao) {
		this.populacao = populacao;
	}


	public double getArea() {
		return area;
	}


	public void setArea(Long area) {
		this.area = (Long) area;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estado other = (Estado) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
