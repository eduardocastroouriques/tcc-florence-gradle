package com.software.florence.service;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.service.Service;
import com.software.florence.entity.ExameDoacao;
import com.software.florence.entity.ProcessoDoacao;

public interface ExameDoacaoService extends Service<ExameDoacao, Long>{
    Iterable<ExameDoacao> findByProcessoDoacao(ProcessoDoacao processoDoacao) throws NegocioException;
}
