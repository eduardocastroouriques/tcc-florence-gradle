package com.software.florence.resource;

import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.DoencaPrevia;
import com.software.florence.entity.Dva;
import com.software.florence.service.DoencaPreviaServiceImpl;
import com.software.florence.service.DvaService;
import com.software.florence.service.DvaServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/dva")
public class DvaResource extends AbstractResource<Dva, Long> {

    private DvaService dvaService;

    public DvaResource(DvaServiceImpl dvaService) {
        super(dvaService);
        this.dvaService = dvaService;
    }
}
