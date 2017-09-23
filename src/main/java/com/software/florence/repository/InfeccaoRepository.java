package com.software.florence.repository;

import com.software.florence.entity.DoencaAtual;
import com.software.florence.entity.Infeccao;
import com.software.florence.entity.ProcessoDoacao;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InfeccaoRepository extends CrudRepository<Infeccao, Long>{

    List<Infeccao> findByDoencaAtual(DoencaAtual doencaAtual);

}
