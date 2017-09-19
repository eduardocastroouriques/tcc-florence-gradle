package com.software.florence.service;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.service.Service;
import com.software.florence.entity.DoencaAtual;
import com.software.florence.entity.ProcessoDoacao;

public interface DoencaAtualService extends Service<DoencaAtual, Long>{

    Iterable<DoencaAtual> findByProcessoDoacao(ProcessoDoacao processoDoacao) throws NegocioException;

}
