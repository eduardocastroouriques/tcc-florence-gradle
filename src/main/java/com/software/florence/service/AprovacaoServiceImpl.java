package com.software.florence.service;

import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.entity.Aprovacao;
import com.software.florence.entity.Cirurgia;
import com.software.florence.repository.AprovacaoRepository;
import com.software.florence.repository.CirurgiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class AprovacaoServiceImpl extends GenericService<Aprovacao, Long> implements AprovacaoService{

    @Autowired
    AprovacaoRepository aprovacaoRepository;

    public AprovacaoServiceImpl(CrudRepository<Aprovacao, Long> repository) {
        super(repository);
    }
}
