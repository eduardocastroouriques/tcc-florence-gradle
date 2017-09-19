package com.software.florence.repository;

import com.software.florence.entity.EntrevistaFamiliar;
import com.software.florence.entity.ProcessoDoacao;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EntrevistaFamiliarRepository extends CrudRepository<EntrevistaFamiliar, Long>{

    List<EntrevistaFamiliar> findByProcessoDoacao(ProcessoDoacao processoDoacao);

}
