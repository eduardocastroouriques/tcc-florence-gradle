package com.software.florence.service;

import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.entity.SubstanciaExtra;
import com.software.florence.entity.TesteClinico;
import com.software.florence.repository.SubstanciaExtraRepository;
import com.software.florence.repository.TesteClinicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class TesteClinicoServiceImpl extends GenericService<TesteClinico, Long> implements TesteClinicoService {

    @Autowired
    TesteClinicoRepository testeClinicoRepository;

    public TesteClinicoServiceImpl(CrudRepository<TesteClinico, Long> repository) {
        super(repository);
    }
}
