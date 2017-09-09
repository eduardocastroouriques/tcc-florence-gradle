package com.software.florence.resource;

import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.Aprovacao;
import com.software.florence.entity.DoencaAtual;
import com.software.florence.service.AprovacaoService;
import com.software.florence.service.AprovacaoServiceImpl;
import com.software.florence.service.DoencaAtualServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/aprovacao")
public class AprovacaoResource extends AbstractResource<Aprovacao, Long> {

    private AprovacaoService aprovacaoService;

    public AprovacaoResource(AprovacaoServiceImpl aprovacaoService) {
        super(aprovacaoService);
        this.aprovacaoService = aprovacaoService;
    }
}
