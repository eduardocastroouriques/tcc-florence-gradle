package com.software.florence.service;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.common.util.exception.MensagemUtil;
import com.software.florence.entity.DoencaAtual;
import com.software.florence.entity.Infeccao;
import com.software.florence.repository.InfeccaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class InfeccaoServiceImpl extends GenericService<Infeccao, Long> implements InfeccaoService {

    @Autowired
    InfeccaoRepository infeccaoRepository;

    public InfeccaoServiceImpl(CrudRepository<Infeccao, Long> repository) {
        super(repository);
    }

    public Iterable<Infeccao> findByDoencaAtual(DoencaAtual doencaAtual) throws NegocioException {
        Iterable<Infeccao> retorno = null;
        try {
            retorno = this.infeccaoRepository.findByDoencaAtual(doencaAtual);
        } catch (Exception e) {
            MensagemUtil.lancarErro(getClass(), e);
        }
        return retorno;
    }
}
