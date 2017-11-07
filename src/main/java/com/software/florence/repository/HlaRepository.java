package com.software.florence.repository;

import com.software.florence.entity.Hla;
import com.software.florence.entity.ProcessoDoacao;
import org.springframework.data.repository.CrudRepository;

public interface HlaRepository extends CrudRepository<Hla, Long>{

    Hla findByProcessoDoacao(ProcessoDoacao processoDoacao);

}
