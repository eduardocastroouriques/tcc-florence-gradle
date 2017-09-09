package com.software.florence.resource;

import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.ExameComplementar;
import com.software.florence.entity.ExameDoacao;
import com.software.florence.service.ExameComplementarService;
import com.software.florence.service.ExameDoacaoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/exameDoacao")
public class ExameDoacaoResource extends AbstractResource<ExameDoacao, Long> {

    private ExameDoacaoService exameComplementarService;

    public ExameDoacaoResource(ExameDoacaoService exameComplementarService) {
        super(exameComplementarService);
        this.exameComplementarService = exameComplementarService;
    }
}
