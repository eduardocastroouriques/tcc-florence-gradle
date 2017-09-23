package com.software.florence.repository;

import com.software.florence.entity.Hla;
import com.software.florence.entity.ProcessoDoacao;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HlaRepository extends CrudRepository<Hla, Long>{

    List<Hla> findByProcessoDoacao(ProcessoDoacao processoDoacao);

}
