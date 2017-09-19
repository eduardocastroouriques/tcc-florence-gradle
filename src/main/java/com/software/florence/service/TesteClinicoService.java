package com.software.florence.service;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.service.Service;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.entity.TesteClinico;

public interface TesteClinicoService extends Service<TesteClinico, Long>{
    Iterable<TesteClinico> findByProcessoDoacao(ProcessoDoacao processoDoacao) throws NegocioException;
}
