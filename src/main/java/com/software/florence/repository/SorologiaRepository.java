package com.software.florence.repository;

import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.entity.Sorologia;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SorologiaRepository extends CrudRepository<Sorologia, Long>{

    List<Sorologia> findByProcessoDoacao(ProcessoDoacao processoDoacao);

}
