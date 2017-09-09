package com.software.florence.resource;

import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.Infeccao;
import com.software.florence.entity.InformacaoCirurgia;
import com.software.florence.service.InfeccaoService;
import com.software.florence.service.InformacaoCirurgiaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/informacaoCirurgia")
public class InformacaoCirurgiaResource extends AbstractResource<InformacaoCirurgia, Long> {

    private InformacaoCirurgiaService informacaoCirurgiaService;

    public InformacaoCirurgiaResource(InformacaoCirurgiaService informacaoCirurgiaService) {
        super(informacaoCirurgiaService);
        this.informacaoCirurgiaService = informacaoCirurgiaService;
    }
}
