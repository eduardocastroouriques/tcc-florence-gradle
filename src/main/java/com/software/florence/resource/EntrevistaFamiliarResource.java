package com.software.florence.resource;

import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.Dva;
import com.software.florence.entity.EntrevistaFamiliar;
import com.software.florence.service.DvaServiceImpl;
import com.software.florence.service.EntrevistaFamiliarServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/entrevistaFamiliar")
public class EntrevistaFamiliarResource extends AbstractResource<EntrevistaFamiliar, Long> {

    private EntrevistaFamiliarServiceImpl entrevistaFamiliarService;

    public EntrevistaFamiliarResource(EntrevistaFamiliarServiceImpl entrevistaFamiliarService) {
        super(entrevistaFamiliarService);
        this.entrevistaFamiliarService = entrevistaFamiliarService;
    }
}
