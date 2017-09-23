package com.software.florence.service;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.common.util.exception.MensagemUtil;
import com.software.florence.entity.Obito;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.repository.ObitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ObitoServiceImpl extends GenericService<Obito, Long> implements ObitoService {

    @Autowired
    ObitoRepository obitoRepository;

    public ObitoServiceImpl(CrudRepository<Obito, Long> repository) {
        super(repository);
    }

    public Iterable<Obito> findByProcessoDoacao(ProcessoDoacao processoDoacao) throws NegocioException {
        Iterable<Obito> retorno = null;
        try {
            retorno = this.obitoRepository.findByProcessoDoacao(processoDoacao);
        } catch (Exception e) {
            MensagemUtil.lancarErro(getClass(), e);
        }
        return retorno;
    }
}
