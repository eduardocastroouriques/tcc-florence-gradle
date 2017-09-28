package com.software.florence.service;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.service.Service;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.entity.Sorologia;

import java.util.List;

public interface SorologiaService extends Service<Sorologia, Long>{
    List<Sorologia> findByProcessoDoacao(ProcessoDoacao processoDoacao) throws NegocioException;
}
