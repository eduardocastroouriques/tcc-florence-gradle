package com.software.florence.resource;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.DoencaAtual;
import com.software.florence.entity.Infeccao;
import com.software.florence.service.DoencaAtualService;
import com.software.florence.service.InfeccaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/infeccao")
public class InfeccaoResource extends AbstractResource<Infeccao, Long> {

    @Autowired
    InfeccaoService infeccaoService;

    @Autowired
    DoencaAtualService doencaAtualService;

    public InfeccaoResource(InfeccaoService infeccaoService) {
        super(infeccaoService);
        this.infeccaoService = infeccaoService;
    }

    @GetMapping("/doenca-atual/{id}")
    public ResponseEntity<Infeccao> findByDoencaAtualId(@PathVariable Long id) {
        Iterable<Infeccao> retorno = null;
        try {

            DoencaAtual doencaAtual = doencaAtualService.findById(id);
            retorno = this.infeccaoService.findByDoencaAtual(doencaAtual);
        } catch (NegocioException e) {
            return this.criarRespostaErro(e);
        } // try-catch
        return this.criarResposta(HttpStatus.OK, retorno);
    }// findById()
}
