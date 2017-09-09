package com.software.florence.service;

import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.entity.Obito;
import com.software.florence.entity.Orgao;
import com.software.florence.repository.ObitoRepository;
import com.software.florence.repository.OrgaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class OrgaoServiceImpl extends GenericService<Orgao, Long> implements OrgaoService {

    @Autowired
    OrgaoRepository orgaoRepository;

    public OrgaoServiceImpl(CrudRepository<Orgao, Long> repository) {
        super(repository);
    }
}
