package com.software.florence.repository;

import com.software.florence.entity.ExameDoacao;
import com.software.florence.entity.ProcessoDoacao;
import org.springframework.data.repository.CrudRepository;

public interface ExameDoacaoRepository extends CrudRepository<ExameDoacao, Long>{

    ExameDoacao findByProcessoDoacao(ProcessoDoacao processoDoacao);

}
