package com.software.florence.repository;

import com.software.florence.entity.DoencaAtual;
import com.software.florence.entity.ProcessoDoacao;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DoencaAtualRepository extends CrudRepository<DoencaAtual, Long>{

    List<DoencaAtual> findByProcessoDoacao(ProcessoDoacao processoDoacao);

}
