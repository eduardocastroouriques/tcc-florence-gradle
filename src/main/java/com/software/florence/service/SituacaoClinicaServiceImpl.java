package com.software.florence.service;

import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.entity.Orgao;
import com.software.florence.entity.SituacaoClinica;
import com.software.florence.repository.OrgaoRepository;
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
}
