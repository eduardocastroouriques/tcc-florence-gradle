package com.software.florence.resource;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.ExameComplementar;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.service.ExameComplementarService;
import com.software.florence.service.ProcessoDoacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/exame-complementar")
public class ExameComplementarResource extends AbstractResource<ExameComplementar, Long> {

    @Autowired
    ExameComplementarService exameComplementarService;

    @Autowired
    ProcessoDoacaoService processoDoacaoService;

    public ExameComplementarResource(ExameComplementarService exameComplementarService) {
        super(exameComplementarService);
        this.exameComplementarService = exameComplementarService;
    }

    @GetMapping("/processo-doacao/{id}")
    public ResponseEntity<ExameComplementar> findByProcessoDoacaoId(@PathVariable Long id) {
        Iterable<ExameComplementar> retorno = null;
        try {

            ProcessoDoacao processoDoacao = processoDoacaoService.findById(id);
            retorno = this.exameComplementarService.findByProcessoDoacao(processoDoacao);
        } catch (NegocioException e) {
            return this.criarRespostaErro(e);
        } // try-catch
        return this.criarResposta(HttpStatus.OK, retorno);
    }// findById()
}
