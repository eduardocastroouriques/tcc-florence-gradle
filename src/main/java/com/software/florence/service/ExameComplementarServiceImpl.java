package com.software.florence.service;

import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.entity.EntrevistaFamiliar;
import com.software.florence.entity.ExameComplementar;
import com.software.florence.repository.EntrevistaFamiliarRepository;
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
}
