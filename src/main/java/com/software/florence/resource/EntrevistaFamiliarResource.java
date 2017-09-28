package com.software.florence.resource;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.Aprovacao;
import com.software.florence.entity.Dva;
import com.software.florence.entity.EntrevistaFamiliar;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.service.DvaServiceImpl;
import com.software.florence.service.EntrevistaFamiliarServiceImpl;
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
@RequestMapping(path = "/entrevista-familiar")
public class EntrevistaFamiliarResource extends AbstractResource<EntrevistaFamiliar, Long> {

    @Autowired
    EntrevistaFamiliarServiceImpl entrevistaFamiliarService;

    @Autowired
    ProcessoDoacaoService processoDoacaoService;

    public EntrevistaFamiliarResource(EntrevistaFamiliarServiceImpl entrevistaFamiliarService) {
        super(entrevistaFamiliarService);
        this.entrevistaFamiliarService = entrevistaFamiliarService;
    }

    @GetMapping("/processo-doacao/{id}")
    public ResponseEntity<EntrevistaFamiliar> findByProcessoDoacaoId(@PathVariable Long id) {
        List<EntrevistaFamiliar> retorno = null;
        try {

            ProcessoDoacao processoDoacao = processoDoacaoService.findById(id);
            retorno = this.entrevistaFamiliarService.findByProcessoDoacao(processoDoacao);
        } catch (NegocioException e) {
            return this.criarRespostaErro(e);
        } // try-catch
        return this.criarResposta(HttpStatus.OK, retorno.get(0));
    }// findById()
}
