package com.software.florence.resource;

import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.service.ProcessoDoacaoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/processoDoacao")
public class ProcessoDoacaoResource extends AbstractResource<ProcessoDoacao, Long> {

    private ProcessoDoacaoServiceImpl processoDoacaoService;

    @Autowired
    public ProcessoDoacaoResource(ProcessoDoacaoServiceImpl processoDoacaoService) {
        super(processoDoacaoService);
        this.processoDoacaoService = processoDoacaoService;
    }


}
