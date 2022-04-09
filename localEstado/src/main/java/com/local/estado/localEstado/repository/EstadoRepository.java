package com.local.estado.localEstado.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.local.estado.localEstado.model.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long>{

	Page<Estado> findByRegiao(String nomeRegiao, Pageable paginacao);

	Page<Estado> findAll(Pageable paginacao);

}
