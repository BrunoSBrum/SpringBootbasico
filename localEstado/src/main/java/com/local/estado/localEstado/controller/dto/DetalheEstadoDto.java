package com.local.estado.localEstado.controller.dto;

import com.local.estado.localEstado.model.Estado;

public class DetalheEstadoDto {

	private Long id;
	private String nome;
	private String capital;
	private String regiao;
	private Long populacao;
	private Long area;
	
	
	public DetalheEstadoDto(Estado estado) {
		this.id = estado.getId();
		this.nome = estado.getNome();
		this.capital = estado.getCapital();
		this.regiao = estado.getRegiao();
		this.populacao = estado.getPopulacao();
		this.area = (long) estado.getArea();
		
		
	}


	public Long getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}


	public String getCapital() {
		return capital;
	}


	public String getRegiao() {
		return regiao;
	}


	public Long getPopulacao() {
		return populacao;
	}


	public Long getArea() {
		return area;
	}
	
	
}
