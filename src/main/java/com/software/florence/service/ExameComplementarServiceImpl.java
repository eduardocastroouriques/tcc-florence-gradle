package com.software.florence.service;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.common.util.exception.MensagemUtil;
import com.software.florence.entity.ExameComplementar;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.repository.ExameComplementarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ExameComplementarServiceImpl extends GenericService<ExameComplementar, Long> implements ExameComplementarService {

    @Autowired
    ExameComplementarRepository exameComplementarRepository;

    public ExameComplementarServiceImpl(CrudRepository<ExameComplementar, Long> repository) {
        super(repository);
    }

    public Iterable<ExameComplementar> findByProcessoDoacao(ProcessoDoacao processoDoacao) throws NegocioException {
        Iterable<ExameComplementar> retorno = null;
        try {
            retorno = this.exameComplementarRepository.findByProcessoDoacao(processoDoacao);
        } catch (Exception e) {
            MensagemUtil.lancarErro(getClass(), e);
        }
        return retorno;
    }
}
