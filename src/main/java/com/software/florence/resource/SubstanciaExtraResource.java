package com.software.florence.resource;

import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.Sorologia;
import com.software.florence.entity.SubstanciaExtra;
import com.software.florence.service.SorologiaService;
import com.software.florence.service.SubstanciaExtraService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/substanciaExtra")
public class SubstanciaExtraResource extends AbstractResource<SubstanciaExtra, Long> {

    private SubstanciaExtraService substanciaExtraService;

    public SubstanciaExtraResource(SubstanciaExtraService substanciaExtraService) {
        super(substanciaExtraService);
        this.substanciaExtraService = substanciaExtraService;
    }
}
