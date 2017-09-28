package com.software.florence.service;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.service.Service;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.entity.SituacaoClinica;

import java.util.List;

public interface SituacaoClinicaService extends Service<SituacaoClinica, Long>{
    List<SituacaoClinica> findByProcessoDoacao(ProcessoDoacao processoDoacao) throws NegocioException;
}
