package com.software.florence.resource;

import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.entity.ProcessoDoacaoSituacaoClinica;
import com.software.florence.service.ProcessoDoacaoServiceImpl;
import com.software.florence.service.ProcessoDoacaoSituacaoClinicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/processoDoacaoSituacaoClinica")
public class ProcessoDoacaoSituacaoClinicaResource extends AbstractResource<ProcessoDoacaoSituacaoClinica, Long> {

    private ProcessoDoacaoSituacaoClinicaServiceImpl processoDoacaoSituacaoClinicaService;

    @Autowired
    public ProcessoDoacaoSituacaoClinicaResource(ProcessoDoacaoSituacaoClinicaServiceImpl processoDoacaoSituacaoClinicaService) {
        super(processoDoacaoSituacaoClinicaService);
        this.processoDoacaoSituacaoClinicaService = processoDoacaoSituacaoClinicaService;
    }


}
