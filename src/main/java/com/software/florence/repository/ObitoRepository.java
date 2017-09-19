package com.software.florence.repository;

import com.software.florence.entity.Obito;
import com.software.florence.entity.ProcessoDoacao;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ObitoRepository extends CrudRepository<Obito, Long>{

    List<Obito> findByProcessoDoacao(ProcessoDoacao processoDoacao);

}
