package com.software.florence.resource;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.Hla;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.service.HlaService;
import com.software.florence.service.ProcessoDoacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hla")
public class HlaResource extends AbstractResource<Hla, Long> {

    @Autowired
    HlaService hlaService;

    @Autowired
    ProcessoDoacaoService processoDoacaoService;

    public HlaResource(HlaService hlaService) {
        super(hlaService);
        this.hlaService = hlaService;
    }

    @GetMapping("/processo-doacao/{id}")
    public ResponseEntity<Hla> findByProcessoDoacaoId(@PathVariable Long id) {
        Iterable<Hla> retorno = null;
        try {

            ProcessoDoacao processoDoacao = processoDoacaoService.findById(id);
            retorno = this.hlaService.findByProcessoDoacao(processoDoacao);
        } catch (NegocioException e) {
            return this.criarRespostaErro(e);
        } // try-catch
        return this.criarResposta(HttpStatus.OK, retorno);
    }// findById()
}
