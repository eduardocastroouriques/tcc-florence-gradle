package com.software.florence.service;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.common.util.exception.MensagemUtil;
import com.software.florence.entity.Dva;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.repository.DvaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class DvaServiceImpl extends GenericService<Dva, Long> implements DvaService {

    @Autowired
    DvaRepository dvaRepository;

    public DvaServiceImpl(CrudRepository<Dva, Long> repository) {
        super(repository);
    }

    public Iterable<Dva> findByProcessoDoacao(ProcessoDoacao processoDoacao) throws NegocioException {
        Iterable<Dva> retorno = null;
        try {
            retorno = this.dvaRepository.findByProcessoDoacao(processoDoacao);
        } catch (Exception e) {
            MensagemUtil.lancarErro(getClass(), e);
        }
        return retorno;
    }
}
