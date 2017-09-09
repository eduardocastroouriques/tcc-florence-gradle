package com.software.florence.service;

import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.entity.DoencaPrevia;
import com.software.florence.entity.Dva;
import com.software.florence.repository.DoencaPreviaRepository;
import com.software.florence.repository.DvaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class DvaServiceImpl extends GenericService<Dva, Long> implements DvaService {

    @Autowired
    DvaRepository dvaRepository;

    public DvaServiceImpl(CrudRepository<Dva, Long> repository) {
        super(repository);
    }
}
