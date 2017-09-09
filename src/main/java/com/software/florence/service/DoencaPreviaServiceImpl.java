package com.software.florence.service;

import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.entity.DoencaAtual;
import com.software.florence.entity.DoencaPrevia;
import com.software.florence.repository.DoencaAtualRepository;
import com.software.florence.repository.DoencaPreviaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class DoencaPreviaServiceImpl extends GenericService<DoencaPrevia, Long> implements DoencaPreviaService {

    @Autowired
    DoencaPreviaRepository doencaPreviaRepository;

    public DoencaPreviaServiceImpl(CrudRepository<DoencaPrevia, Long> repository) {
        super(repository);
    }
}
