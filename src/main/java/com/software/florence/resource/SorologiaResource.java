package com.software.florence.resource;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.entity.Sorologia;
import com.software.florence.service.ProcessoDoacaoService;
import com.software.florence.service.SorologiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/sorologia")
public class SorologiaResource extends AbstractResource<Sorologia, Long> {

    @Autowired
    SorologiaService sorologiaService;

    @Autowired
    ProcessoDoacaoService processoDoacaoService;

    public SorologiaResource(SorologiaService sorologiaService) {
        super(sorologiaService);
        this.sorologiaService = sorologiaService;
    }

    @GetMapping("/processo-doacao/{id}")
    public ResponseEntity<Sorologia> findByProcessoDoacaoId(@PathVariable Long id) {
        Iterable<Sorologia> retorno = null;
        try {

            ProcessoDoacao processoDoacao = processoDoacaoService.findById(id);
            retorno = this.sorologiaService.findByProcessoDoacao(processoDoacao);
        } catch (NegocioException e) {
            return this.criarRespostaErro(e);
        } // try-catch
        return this.criarResposta(HttpStatus.OK, retorno);
    }// findById()
}
