package com.software.florence.service;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.common.util.exception.MensagemUtil;
import com.software.florence.entity.ComunicacaoProcessoDoacao;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.repository.ComunicacaoProcessoDoacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComunicacaoProcessoDoacaoServiceImpl extends GenericService<ComunicacaoProcessoDoacao, Long> implements ComunicacaoProcessoDoacaoService {

    @Autowired
    ComunicacaoProcessoDoacaoRepository comunicacaoProcessoDoacaoRepository;

    public ComunicacaoProcessoDoacaoServiceImpl(CrudRepository<ComunicacaoProcessoDoacao, Long> repository) {
        super(repository);
    }

    public List<ComunicacaoProcessoDoacao> findByProcessoDoacao(ProcessoDoacao processoDoacao) throws NegocioException {
        List<ComunicacaoProcessoDoacao> retorno = null;
        try {
            retorno = this.comunicacaoProcessoDoacaoRepository.findByProcessoDoacao(processoDoacao);
        } catch (Exception e) {
            MensagemUtil.lancarErro(getClass(), e);
        }
        return retorno;
    }
}
