package com.software.florence.repository;

import com.software.florence.entity.DoencaPrevia;
import com.software.florence.entity.ProcessoDoacao;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DoencaPreviaRepository extends CrudRepository<DoencaPrevia, Long>{

    List<DoencaPrevia> findByProcessoDoacao(ProcessoDoacao processoDoacao);

}
