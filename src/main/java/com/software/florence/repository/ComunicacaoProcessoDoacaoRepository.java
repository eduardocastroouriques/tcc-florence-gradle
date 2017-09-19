package com.software.florence.repository;

import com.software.florence.entity.ComunicacaoProcessoDoacao;
import com.software.florence.entity.ProcessoDoacao;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ComunicacaoProcessoDoacaoRepository extends CrudRepository<ComunicacaoProcessoDoacao, Long>{

    List<ComunicacaoProcessoDoacao> findByProcessoDoacao(ProcessoDoacao processoDoacao);

}
