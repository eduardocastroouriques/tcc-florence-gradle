package com.software.florence.service;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.common.util.exception.MensagemUtil;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.entity.TesteClinico;
import com.software.florence.repository.TesteClinicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class TesteClinicoServiceImpl extends GenericService<TesteClinico, Long> implements TesteClinicoService {

    @Autowired
    TesteClinicoRepository testeClinicoRepository;

    public TesteClinicoServiceImpl(CrudRepository<TesteClinico, Long> repository) {
        super(repository);
    }

    public Iterable<TesteClinico> findByProcessoDoacao(ProcessoDoacao processoDoacao) throws NegocioException {
        Iterable<TesteClinico> retorno = null;
        try {
            retorno = this.testeClinicoRepository.findByProcessoDoacao(processoDoacao);
        } catch (Exception e) {
            MensagemUtil.lancarErro(getClass(), e);
        }
        return retorno;
    }
}
