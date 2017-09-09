package com.software.florence.resource;

import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.Cirurgia;
import com.software.florence.entity.ComunicacaoProcessoDoacao;
import com.software.florence.service.CirurgiaServiceImpl;
import com.software.florence.service.ComunicacaoProcessoDoacaoService;
import com.software.florence.service.ComunicacaoProcessoDoacaoServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/comunicacaoProcessoDoacao")
public class ComunicacaoProcessoDoacaoResource extends AbstractResource<ComunicacaoProcessoDoacao, Long> {

    private ComunicacaoProcessoDoacaoService comunicacaoProcessoDoacaoService;

    public ComunicacaoProcessoDoacaoResource(ComunicacaoProcessoDoacaoServiceImpl comunicacaoProcessoDoacaoService) {
        super(comunicacaoProcessoDoacaoService);
        this.comunicacaoProcessoDoacaoService = comunicacaoProcessoDoacaoService;
    }
}
