package com.software.florence.service;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.common.util.exception.MensagemUtil;
import com.software.florence.entity.EntrevistaFamiliar;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.repository.EntrevistaFamiliarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class EntrevistaFamiliarServiceImpl extends GenericService<EntrevistaFamiliar, Long> implements EntrevistaFamiliarService {

    @Autowired
    EntrevistaFamiliarRepository entrevistaFamiliarRepository;

    public EntrevistaFamiliarServiceImpl(CrudRepository<EntrevistaFamiliar, Long> repository) {
        super(repository);
    }

    public Iterable<EntrevistaFamiliar> findByProcessoDoacao(ProcessoDoacao processoDoacao) throws NegocioException {
        Iterable<EntrevistaFamiliar> retorno = null;
        try {
            retorno = this.entrevistaFamiliarRepository.findByProcessoDoacao(processoDoacao);
        } catch (Exception e) {
            MensagemUtil.lancarErro(getClass(), e);
        }
        return retorno;
    }
}
