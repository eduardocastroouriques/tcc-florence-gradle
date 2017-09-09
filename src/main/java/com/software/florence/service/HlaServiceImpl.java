package com.software.florence.service;

import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.entity.ExameDoacao;
import com.software.florence.entity.Hla;
import com.software.florence.repository.ExameDoacaoRepository;
import com.software.florence.repository.HlaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class HlaServiceImpl extends GenericService<Hla, Long> implements HlaService {

    @Autowired
    HlaRepository hlaRepository;

    public HlaServiceImpl(CrudRepository<Hla, Long> repository) {
        super(repository);
    }
}
