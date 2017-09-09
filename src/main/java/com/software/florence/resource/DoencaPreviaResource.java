package com.software.florence.resource;

import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.DoencaAtual;
import com.software.florence.entity.DoencaPrevia;
import com.software.florence.service.DoencaAtualServiceImpl;
import com.software.florence.service.DoencaPreviaService;
import com.software.florence.service.DoencaPreviaServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/doencaPrevia")
public class DoencaPreviaResource extends AbstractResource<DoencaPrevia, Long> {

    private DoencaPreviaService doencaPreviaService;

    public DoencaPreviaResource(DoencaPreviaServiceImpl doencaPreviaService) {
        super(doencaPreviaService);
        this.doencaPreviaService = doencaPreviaService;
    }
}
