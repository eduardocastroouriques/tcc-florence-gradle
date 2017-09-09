package com.software.florence.resource;

import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.SituacaoClinica;
import com.software.florence.entity.Sorologia;
import com.software.florence.service.SituacaoClinicaService;
import com.software.florence.service.SorologiaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/sorologia")
public class SorologiaResource extends AbstractResource<Sorologia, Long> {

    private SorologiaService sorologiaService;

    public SorologiaResource(SorologiaService sorologiaService) {
        super(sorologiaService);
        this.sorologiaService = sorologiaService;
    }
}
