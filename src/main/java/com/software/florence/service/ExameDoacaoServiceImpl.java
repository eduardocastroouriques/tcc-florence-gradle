package com.software.florence.service;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.common.util.exception.MensagemUtil;
import com.software.florence.entity.ExameDoacao;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.repository.ExameDoacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ExameDoacaoServiceImpl extends GenericService<ExameDoacao, Long> implements ExameDoacaoService {

    @Autowired
    ExameDoacaoRepository exameDoacaoRepository;

    public ExameDoacaoServiceImpl(CrudRepository<ExameDoacao, Long> repository) {
        super(repository);
    }

    public Iterable<ExameDoacao> findByProcessoDoacao(ProcessoDoacao processoDoacao) throws NegocioException {
        Iterable<ExameDoacao> retorno = null;
        try {
            retorno = this.exameDoacaoRepository.findByProcessoDoacao(processoDoacao);
        } catch (Exception e) {
            MensagemUtil.lancarErro(getClass(), e);
        }
        return retorno;
    }
}
