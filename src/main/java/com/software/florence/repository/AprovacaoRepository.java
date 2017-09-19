package com.software.florence.repository;

import com.software.florence.entity.Aprovacao;
import com.software.florence.entity.ProcessoDoacao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AprovacaoRepository extends CrudRepository<Aprovacao, Long>{

    List<Aprovacao> findByProcessoDoacao(ProcessoDoacao processoDoacao);

}
