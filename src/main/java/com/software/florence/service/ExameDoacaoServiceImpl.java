package com.software.florence.service;

import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.entity.ExameComplementar;
import com.software.florence.entity.ExameDoacao;
import com.software.florence.repository.ExameComplementarRepository;
import com.software.florence.repository.ExameDoacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ExameDoacaoServiceImpl extends GenericService<ExameDoacao, Long> implements ExameDoacaoService {

    @Autowired
    ExameDoacaoRepository exameDoacaoRepository;

    public ExameDoacaoServiceImpl(CrudRepository<ExameDoacao, Long> repository) {
        super(repository);
    }
}
