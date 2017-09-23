package com.software.florence.service;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.common.util.exception.MensagemUtil;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.entity.SituacaoClinica;
import com.software.florence.repository.SituacaoClinicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class SituacaoClinicaServiceImpl extends GenericService<SituacaoClinica, Long> implements SituacaoClinicaService {

    @Autowired
    SituacaoClinicaRepository situacaoClinicaRepository;

    public SituacaoClinicaServiceImpl(CrudRepository<SituacaoClinica, Long> repository) {
        super(repository);
    }

    public Iterable<SituacaoClinica> findByProcessoDoacao(ProcessoDoacao processoDoacao) throws NegocioException {
        Iterable<SituacaoClinica> retorno = null;
        try {
            retorno = this.situacaoClinicaRepository.findByProcessoDoacao(processoDoacao);
        } catch (Exception e) {
            MensagemUtil.lancarErro(getClass(), e);
        }
        return retorno;
    }

}
