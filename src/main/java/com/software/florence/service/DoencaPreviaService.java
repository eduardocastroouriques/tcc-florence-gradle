package com.software.florence.service;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.service.Service;
import com.software.florence.entity.DoencaPrevia;
import com.software.florence.entity.ProcessoDoacao;

public interface DoencaPreviaService extends Service<DoencaPrevia, Long>{

    Iterable<DoencaPrevia> findByProcessoDoacao(ProcessoDoacao processoDoacao) throws NegocioException;

}
