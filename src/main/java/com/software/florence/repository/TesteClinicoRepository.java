package com.software.florence.repository;

import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.entity.TesteClinico;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TesteClinicoRepository extends CrudRepository<TesteClinico, Long>{

    List<TesteClinico> findByProcessoDoacao(ProcessoDoacao processoDoacao);

}
