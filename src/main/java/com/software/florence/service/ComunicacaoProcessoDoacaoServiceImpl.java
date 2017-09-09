package com.software.florence.service;

import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.entity.Cirurgia;
import com.software.florence.entity.ComunicacaoProcessoDoacao;
import com.software.florence.repository.CirurgiaRepository;
import com.software.florence.repository.ComunicacaoProcessoDoacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ComunicacaoProcessoDoacaoServiceImpl extends GenericService<ComunicacaoProcessoDoacao, Long> implements ComunicacaoProcessoDoacaoService {

    @Autowired
    ComunicacaoProcessoDoacaoRepository comunicacaoProcessoDoacaoRepository;

    public ComunicacaoProcessoDoacaoServiceImpl(CrudRepository<ComunicacaoProcessoDoacao, Long> repository) {
        super(repository);
    }
}
