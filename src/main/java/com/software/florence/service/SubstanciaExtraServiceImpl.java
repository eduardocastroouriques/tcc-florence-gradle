package com.software.florence.service;

import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.entity.Sorologia;
import com.software.florence.entity.SubstanciaExtra;
import com.software.florence.repository.SorologiaRepository;
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
}
