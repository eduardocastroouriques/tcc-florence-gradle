package com.software.florence.service;

import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.entity.ProcessoDoacaoSituacaoClinica;
import com.software.florence.repository.ProcessoDoacaoRepository;
import com.software.florence.repository.ProcessoDoacaoSituacaoClinicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ProcessoDoacaoSituacaoClinicaServiceImpl extends GenericService<ProcessoDoacaoSituacaoClinica, Long> implements ProcessoDoacaoSituacaoClinicaService {

    @Autowired
    ProcessoDoacaoSituacaoClinicaRepository processoDoacaoSituacaoClinicaRepository;

    public ProcessoDoacaoSituacaoClinicaServiceImpl(CrudRepository<ProcessoDoacaoSituacaoClinica, Long> repository) {
        super(repository);
    }
}
