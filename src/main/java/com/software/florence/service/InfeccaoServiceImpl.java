package com.software.florence.service;

import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.entity.Hla;
import com.software.florence.entity.Infeccao;
import com.software.florence.repository.HlaRepository;
import com.software.florence.repository.InfeccaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class InfeccaoServiceImpl extends GenericService<Infeccao, Long> implements InfeccaoService {

    @Autowired
    InfeccaoRepository infeccaoRepository;

    public InfeccaoServiceImpl(CrudRepository<Infeccao, Long> repository) {
        super(repository);
    }
}
