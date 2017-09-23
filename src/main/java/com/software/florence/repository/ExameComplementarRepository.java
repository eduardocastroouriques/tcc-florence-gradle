package com.software.florence.repository;

import com.software.florence.entity.ExameComplementar;
import com.software.florence.entity.ProcessoDoacao;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ExameComplementarRepository extends CrudRepository<ExameComplementar, Long>{

    List<ExameComplementar> findByProcessoDoacao(ProcessoDoacao processoDoacao);
}
