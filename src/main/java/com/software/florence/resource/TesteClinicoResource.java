package com.software.florence.resource;

import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.SubstanciaExtra;
import com.software.florence.entity.TesteClinico;
import com.software.florence.service.SubstanciaExtraService;
import com.software.florence.service.TesteClinicoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/testeClinico")
public class TesteClinicoResource extends AbstractResource<TesteClinico, Long> {

    private TesteClinicoService testeClinicoService;

    public TesteClinicoResource(TesteClinicoService testeClinicoService) {
        super(testeClinicoService);
        this.testeClinicoService = testeClinicoService;
    }
}
