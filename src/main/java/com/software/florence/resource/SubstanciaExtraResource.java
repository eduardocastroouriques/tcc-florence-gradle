package com.software.florence.resource;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.DoencaPrevia;
import com.software.florence.entity.SubstanciaExtra;
import com.software.florence.service.DoencaPreviaService;
import com.software.florence.service.SubstanciaExtraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/substancia-extra")
public class SubstanciaExtraResource extends AbstractResource<SubstanciaExtra, Long> {

    @Autowired
    SubstanciaExtraService substanciaExtraService;

    @Autowired
    DoencaPreviaService doencaPreviaService;

    public SubstanciaExtraResource(SubstanciaExtraService substanciaExtraService) {
        super(substanciaExtraService);
        this.substanciaExtraService = substanciaExtraService;
    }

    @GetMapping("/doenca-previa/{id}")
    public ResponseEntity<SubstanciaExtra> findByDoencaPrevia(@PathVariable Long id) {
        Iterable<SubstanciaExtra> retorno = null;
        try {

            DoencaPrevia doencaPrevia = doencaPreviaService.findById(id);
            retorno = this.substanciaExtraService.findByDoencaPrevia(doencaPrevia);
        } catch (NegocioException e) {
            return this.criarRespostaErro(e);
        } // try-catch
        return this.criarResposta(HttpStatus.OK, retorno);
    }// findById()
}
