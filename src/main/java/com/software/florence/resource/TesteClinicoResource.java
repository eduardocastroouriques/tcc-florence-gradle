package com.software.florence.resource;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.entity.TesteClinico;
import com.software.florence.service.ProcessoDoacaoService;
import com.software.florence.service.TesteClinicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/teste-clinico")
public class TesteClinicoResource extends AbstractResource<TesteClinico, Long> {

    @Autowired
    TesteClinicoService testeClinicoService;

    @Autowired
    ProcessoDoacaoService processoDoacaoService;

    public TesteClinicoResource(TesteClinicoService testeClinicoService) {
        super(testeClinicoService);
        this.testeClinicoService = testeClinicoService;
    }

    @GetMapping("/processo-doacao/{id}")
    public ResponseEntity<TesteClinico> findByProcessoDoacaoId(@PathVariable Long id) {
        Iterable<TesteClinico> retorno = null;
        try {

            ProcessoDoacao processoDoacao = processoDoacaoService.findById(id);
            retorno = this.testeClinicoService.findByProcessoDoacao(processoDoacao);
        } catch (NegocioException e) {
            return this.criarRespostaErro(e);
        } // try-catch
        return this.criarResposta(HttpStatus.OK, retorno);
    }// findById()
}
