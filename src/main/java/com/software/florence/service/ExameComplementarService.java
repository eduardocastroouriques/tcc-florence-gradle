package com.software.florence.service;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.service.Service;
import com.software.florence.entity.ExameComplementar;
import com.software.florence.entity.ProcessoDoacao;

public interface ExameComplementarService extends Service<ExameComplementar, Long>{
    Iterable<ExameComplementar> findByProcessoDoacao(ProcessoDoacao processoDoacao) throws NegocioException;
}
