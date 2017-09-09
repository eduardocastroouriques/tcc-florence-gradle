package com.software.florence.resource;

import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.ExameDoacao;
import com.software.florence.entity.Hla;
import com.software.florence.service.ExameDoacaoService;
import com.software.florence.service.HlaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hla")
public class HlaResource extends AbstractResource<Hla, Long> {

    private HlaService hlaService;

    public HlaResource(HlaService hlaService) {
        super(hlaService);
        this.hlaService = hlaService;
    }
}
