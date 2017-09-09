package com.software.florence.resource;

import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.InformacaoCirurgia;
import com.software.florence.entity.Obito;
import com.software.florence.service.InformacaoCirurgiaService;
import com.software.florence.service.ObitoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/obito")
public class ObitoResource extends AbstractResource<Obito, Long> {

    private ObitoService obitoService;

    public ObitoResource(ObitoService obitoService) {
        super(obitoService);
        this.obitoService = obitoService;
    }
}
