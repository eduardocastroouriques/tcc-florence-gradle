package com.software.florence.service;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.service.Service;
import com.software.florence.entity.DoencaAtual;
import com.software.florence.entity.Infeccao;
import com.software.florence.entity.ProcessoDoacao;

public interface InfeccaoService extends Service<Infeccao, Long>{
    Iterable<Infeccao> findByDoencaAtual(DoencaAtual doencaAtual) throws NegocioException;
}
