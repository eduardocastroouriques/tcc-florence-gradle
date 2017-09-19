package com.software.florence.service;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.common.util.exception.MensagemUtil;
import com.software.florence.entity.Aprovacao;
import com.software.florence.entity.Cirurgia;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.repository.AprovacaoRepository;
import com.software.florence.repository.CirurgiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class AprovacaoServiceImpl extends GenericService<Aprovacao, Long> implements AprovacaoService{

    @Autowired
    AprovacaoRepository aprovacaoRepository;

    public AprovacaoServiceImpl(CrudRepository<Aprovacao, Long> repository) {
        super(repository);
    }

    public Iterable<Aprovacao> findByProcessoDoacao(ProcessoDoacao processoDoacao) throws NegocioException {
        Iterable<Aprovacao> retorno = null;
        try {
            retorno = this.aprovacaoRepository.findByProcessoDoacao(processoDoacao);
        } catch (Exception e) {
            MensagemUtil.lancarErro(getClass(), e);
        }
        return retorno;
    }
}
