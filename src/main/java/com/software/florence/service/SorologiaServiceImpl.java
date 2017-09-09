package com.software.florence.service;

import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.entity.SituacaoClinica;
import com.software.florence.entity.Sorologia;
import com.software.florence.repository.SituacaoClinicaRepository;
import com.software.florence.repository.SorologiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class SorologiaServiceImpl extends GenericService<Sorologia, Long> implements SorologiaService {

    @Autowired
    SorologiaRepository sorologiaRepository;

    public SorologiaServiceImpl(CrudRepository<Sorologia, Long> repository) {
        super(repository);
    }
}
