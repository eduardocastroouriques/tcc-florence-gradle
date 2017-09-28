package com.software.florence.service;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.common.util.exception.MensagemUtil;
import com.software.florence.entity.DoencaAtual;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.repository.DoencaAtualRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoencaAtualServiceImpl extends GenericService<DoencaAtual, Long> implements DoencaAtualService {

    @Autowired
    DoencaAtualRepository doencaAtualRepository;

    public DoencaAtualServiceImpl(CrudRepository<DoencaAtual, Long> repository) {
        super(repository);
    }

    public List<DoencaAtual> findByProcessoDoacao(ProcessoDoacao processoDoacao) throws NegocioException {
        List<DoencaAtual> retorno = null;
        try {
            retorno = this.doencaAtualRepository.findByProcessoDoacao(processoDoacao);
        } catch (Exception e) {
            MensagemUtil.lancarErro(getClass(), e);
        }
        return retorno;
    }
}
