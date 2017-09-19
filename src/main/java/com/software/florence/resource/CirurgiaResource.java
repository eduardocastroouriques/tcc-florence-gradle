package com.software.florence.resource;

import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.Cirurgia;
import com.software.florence.service.CirurgiaService;
import com.software.florence.service.CirurgiaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/cirurgia")
public class CirurgiaResource extends AbstractResource<Cirurgia, Long> {

    @Autowired
    private CirurgiaService cirurgiaService;

    public CirurgiaResource(CirurgiaServiceImpl cirurgiaService) {
        super(cirurgiaService);
        this.cirurgiaService = cirurgiaService;
    }
}
