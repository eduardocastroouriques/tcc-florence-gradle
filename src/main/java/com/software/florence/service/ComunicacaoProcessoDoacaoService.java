package com.software.florence.service;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.service.Service;
import com.software.florence.entity.ComunicacaoProcessoDoacao;
import com.software.florence.entity.ProcessoDoacao;

import java.util.List;

public interface ComunicacaoProcessoDoacaoService extends Service<ComunicacaoProcessoDoacao, Long>{

    List<ComunicacaoProcessoDoacao> findByProcessoDoacao(ProcessoDoacao processoDoacao) throws NegocioException;

}
