package com.software.florence.resource;

import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.Hla;
import com.software.florence.entity.Infeccao;
import com.software.florence.service.HlaService;
import com.software.florence.service.InfeccaoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/infeccao")
public class InfeccaoResource extends AbstractResource<Infeccao, Long> {

    private InfeccaoService infeccaoService;

    public InfeccaoResource(InfeccaoService infeccaoService) {
        super(infeccaoService);
        this.infeccaoService = infeccaoService;
    }
}
