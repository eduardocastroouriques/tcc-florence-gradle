package com.software.florence.service;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.common.util.exception.MensagemUtil;
import com.software.florence.entity.Hla;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.repository.HlaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class HlaServiceImpl extends GenericService<Hla, Long> implements HlaService {

    @Autowired
    HlaRepository hlaRepository;

    public HlaServiceImpl(CrudRepository<Hla, Long> repository) {
        super(repository);
    }

    public Hla findByProcessoDoacao(ProcessoDoacao processoDoacao) throws NegocioException {
        Hla retorno = null;
        try {
            retorno = this.hlaRepository.findByProcessoDoacao(processoDoacao);
        } catch (Exception e) {
            MensagemUtil.lancarErro(getClass(), e);
        }
        return retorno;
    }
}
