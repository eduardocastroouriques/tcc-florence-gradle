package com.software.florence.service;

import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.entity.EntrevistaFamiliar;
import com.software.florence.repository.EntrevistaFamiliarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class EntrevistaFamiliarServiceImpl extends GenericService<EntrevistaFamiliar, Long> implements EntrevistaFamiliarService {

    @Autowired
    EntrevistaFamiliarRepository entrevistaFamiliarRepository;

    public EntrevistaFamiliarServiceImpl(CrudRepository<EntrevistaFamiliar, Long> repository) {
        super(repository);
    }
}
