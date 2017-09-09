package com.software.florence.resource;

import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.EntrevistaFamiliar;
import com.software.florence.entity.ExameComplementar;
import com.software.florence.service.EntrevistaFamiliarServiceImpl;
import com.software.florence.service.ExameComplementarService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/exameComplementar")
public class ExameComplementarResource extends AbstractResource<ExameComplementar, Long> {

    private ExameComplementarService exameComplementarService;

    public ExameComplementarResource(ExameComplementarService exameComplementarService) {
        super(exameComplementarService);
        this.exameComplementarService = exameComplementarService;
    }
}
