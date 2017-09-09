package com.software.florence.service;

import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.entity.Cirurgia;
import com.software.florence.entity.DoencaAtual;
import com.software.florence.repository.CirurgiaRepository;
import com.software.florence.repository.DoencaAtualRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class CirurgiaServiceImpl extends GenericService<Cirurgia, Long> implements CirurgiaService {

    @Autowired
    CirurgiaRepository cirurgiaRepository;

    public CirurgiaServiceImpl(CrudRepository<Cirurgia, Long> repository) {
        super(repository);
    }
}
