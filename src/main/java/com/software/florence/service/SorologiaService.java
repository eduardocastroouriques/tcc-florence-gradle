package com.software.florence.service;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.service.Service;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.entity.Sorologia;

public interface SorologiaService extends Service<Sorologia, Long>{
    Iterable<Sorologia> findByProcessoDoacao(ProcessoDoacao processoDoacao) throws NegocioException;
}
