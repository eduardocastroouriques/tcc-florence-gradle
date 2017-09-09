package com.software.florence.service;

import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.repository.ProcessoDoacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ProcessoDoacaoServiceImpl extends GenericService<ProcessoDoacao, Long> implements ProcessoDoacaoService {

    @Autowired
    ProcessoDoacaoRepository processoDoacaoRepository;

    public ProcessoDoacaoServiceImpl(CrudRepository<ProcessoDoacao, Long> repository) {
        super(repository);
    }
}
