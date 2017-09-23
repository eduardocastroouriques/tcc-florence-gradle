package com.software.florence.service;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.service.Service;
import com.software.florence.entity.EntrevistaFamiliar;
import com.software.florence.entity.ProcessoDoacao;

public interface EntrevistaFamiliarService extends Service<EntrevistaFamiliar, Long>{
    Iterable<EntrevistaFamiliar> findByProcessoDoacao(ProcessoDoacao processoDoacao) throws NegocioException;
}
