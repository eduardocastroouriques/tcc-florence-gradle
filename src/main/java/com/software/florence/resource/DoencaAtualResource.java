package com.software.florence.resource;

import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.DoencaAtual;
import com.software.florence.service.DoencaAtualService;
import com.software.florence.service.DoencaAtualServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/doencaAtual")
public class DoencaAtualResource extends AbstractResource<DoencaAtual, Long> {

    private DoencaAtualService doencaAtualService;

    public DoencaAtualResource(DoencaAtualServiceImpl doencaAtualService) {
        super(doencaAtualService);
        this.doencaAtualService = doencaAtualService;
    }
}
