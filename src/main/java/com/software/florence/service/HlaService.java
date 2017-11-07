package com.software.florence.service;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.service.Service;
import com.software.florence.entity.Hla;
import com.software.florence.entity.ProcessoDoacao;

public interface HlaService extends Service<Hla, Long>{
    Hla findByProcessoDoacao(ProcessoDoacao processoDoacao) throws NegocioException;
}
