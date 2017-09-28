package com.software.florence.service;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.common.util.exception.MensagemUtil;
import com.software.florence.entity.DoencaPrevia;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.repository.DoencaPreviaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoencaPreviaServiceImpl extends GenericService<DoencaPrevia, Long> implements DoencaPreviaService {

    @Autowired
    DoencaPreviaRepository doencaPreviaRepository;

    public DoencaPreviaServiceImpl(CrudRepository<DoencaPrevia, Long> repository) {
        super(repository);
    }

    public List<DoencaPrevia> findByProcessoDoacao(ProcessoDoacao processoDoacao) throws NegocioException {
        List<DoencaPrevia> retorno = null;
        try {
            retorno = this.doencaPreviaRepository.findByProcessoDoacao(processoDoacao);
        } catch (Exception e) {
            MensagemUtil.lancarErro(getClass(), e);
        }
        return retorno;
    }
}
