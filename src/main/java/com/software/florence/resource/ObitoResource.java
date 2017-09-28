package com.software.florence.resource;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.Obito;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.service.ObitoService;
import com.software.florence.service.ProcessoDoacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/obito")
public class ObitoResource extends AbstractResource<Obito, Long> {

    @Autowired
    ObitoService obitoService;

    @Autowired
    ProcessoDoacaoService processoDoacaoService;

    public ObitoResource(ObitoService obitoService) {
        super(obitoService);
        this.obitoService = obitoService;
    }

    @GetMapping("/processo-doacao/{id}")
    public ResponseEntity<Obito> findByProcessoDoacaoId(@PathVariable Long id) {
        List<Obito> retorno = null;
        try {

            ProcessoDoacao processoDoacao = processoDoacaoService.findById(id);
            retorno = this.obitoService.findByProcessoDoacao(processoDoacao);
        } catch (NegocioException e) {
            return this.criarRespostaErro(e);
        } // try-catch
        return this.criarResposta(HttpStatus.OK, retorno.get(0));
    }// findById()
}
