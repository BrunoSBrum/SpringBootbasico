package com.local.estado.localEstado.controller.dto;

import com.local.estado.localEstado.model.Estado;
import com.local.estado.localEstado.repository.EstadoRepository;

public class AtualizacaoEstadoForm {
	

	private String nome;
	private String capital;
	private Long populacao;
	private Long area;
	private String regiao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public Long getArea() {
		return area;
	}

	public void setArea(Long area) {
		this.area = area;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	
	@SuppressWarnings("deprecation")
	public Estado atualizar(Long id, EstadoRepository estadoRepository) {
		Estado estado = estadoRepository.getOne(id);
		estado.setNome(this.nome);
		estado.setCapital(this.capital);
		estado.setRegiao(this.regiao);
		estado.setPopulacao(this.populacao);
		estado.setArea(this.area);
		
		return estado;
	}
	
	
	
}
