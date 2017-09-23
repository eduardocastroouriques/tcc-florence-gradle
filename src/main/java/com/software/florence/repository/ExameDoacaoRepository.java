package com.software.florence.repository;

import com.software.florence.entity.ExameDoacao;
import com.software.florence.entity.ProcessoDoacao;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ExameDoacaoRepository extends CrudRepository<ExameDoacao, Long>{

    List<ExameDoacao> findByProcessoDoacao(ProcessoDoacao processoDoacao);

}
