package com.software.florence.service;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.service.Service;
import com.software.florence.entity.Aprovacao;
import com.software.florence.entity.ProcessoDoacao;

public interface AprovacaoService extends Service<Aprovacao, Long>{

    Iterable<Aprovacao> findByProcessoDoacao(ProcessoDoacao processoDoacao) throws NegocioException;

}
