package com.local.estado.localEstado.controller;

import java.net.URI;
import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.local.estado.localEstado.controller.dto.AtualizacaoEstadoForm;
import com.local.estado.localEstado.controller.dto.DetalheEstadoDto;
import com.local.estado.localEstado.model.Estado;
import com.local.estado.localEstado.repository.EstadoRepository;


@RestController
@RequestMapping("/api/states")
public class EstadoController {
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@GetMapping
	public Page<Estado> listar(@RequestParam(required = false)
	String nomeRegiao, @PageableDefault(sort = "Populacao", direction = Direction.DESC) Pageable paginacao) {
		
		
		
		if(nomeRegiao == null) {
		Page<Estado> nome = estadoRepository.findAll(paginacao);	
		return nome;
		}else {
		Page<Estado> nome = estadoRepository.findByRegiao(nomeRegiao, paginacao);
		return nome;	
		}
	}
	
	@PostMapping
	public ResponseEntity<Estado> cadastrar(@RequestBody @Valid Estado estado, UriComponentsBuilder uriBuilder) {
		estadoRepository.save(estado);
		
		URI uri = uriBuilder.path("/estados/{id}").buildAndExpand(estado.getId()).toUri();
		return ResponseEntity.created(uri).body(estado);
	}
	
	
	
	@GetMapping("/{id}")
	public DetalheEstadoDto detalhar(@PathVariable Long id) {
		@SuppressWarnings("deprecation")
		Estado estado = estadoRepository.getOne(id);
		return new DetalheEstadoDto(estado);
		
	}
	
	
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<Estado> atualizar(@PathVariable Long id, @RequestBody @Valid AtualizacaoEstadoForm form){
		Estado estado = form.atualizar(id, estadoRepository);
		
		return ResponseEntity.ok(estadoRepository.save(estado));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> remover(@PathVariable Long id){
		estadoRepository.deleteById(id);
		return ResponseEntity.ok().build();
		
	}
	
	
	
	

}
