package com.software.florence.repository;

import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.entity.SituacaoClinica;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SituacaoClinicaRepository extends CrudRepository<SituacaoClinica, Long>{

    List<SituacaoClinica> findByProcessoDoacao(ProcessoDoacao processoDoacao);

}
