package com.software.florence.resource;

import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.Orgao;
import com.software.florence.entity.SituacaoClinica;
import com.software.florence.service.OrgaoService;
import com.software.florence.service.SituacaoClinicaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/situacaoClinica")
public class SituacaoClinicaResource extends AbstractResource<SituacaoClinica, Long> {

    private SituacaoClinicaService situacaoClinicaService;

    public SituacaoClinicaResource(SituacaoClinicaService situacaoClinicaService) {
        super(situacaoClinicaService);
        this.situacaoClinicaService = situacaoClinicaService;
    }
}
