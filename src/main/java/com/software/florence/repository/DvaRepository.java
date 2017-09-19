package com.software.florence.repository;

import com.software.florence.entity.Dva;
import com.software.florence.entity.ProcessoDoacao;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DvaRepository extends CrudRepository<Dva, Long>{

    List<Dva> findByProcessoDoacao(ProcessoDoacao processoDoacao);

}
