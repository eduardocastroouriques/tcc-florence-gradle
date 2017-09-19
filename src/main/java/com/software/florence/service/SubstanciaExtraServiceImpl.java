package com.software.florence.service;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.common.util.exception.MensagemUtil;
import com.software.florence.entity.DoencaPrevia;
import com.software.florence.entity.SubstanciaExtra;
import com.software.florence.repository.SubstanciaExtraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class SubstanciaExtraServiceImpl extends GenericService<SubstanciaExtra, Long> implements SubstanciaExtraService {

    @Autowired
    SubstanciaExtraRepository substanciaExtraRepository;

    public SubstanciaExtraServiceImpl(CrudRepository<SubstanciaExtra, Long> repository) {
        super(repository);
    }

    public Iterable<SubstanciaExtra> findByDoencaPrevia(DoencaPrevia doencaPrevia) throws NegocioException {
        Iterable<SubstanciaExtra> retorno = null;
        try {
            retorno = this.substanciaExtraRepository.findByDoencaPrevia(doencaPrevia);
        } catch (Exception e) {
            MensagemUtil.lancarErro(getClass(), e);
        }
        return retorno;
    }
}
