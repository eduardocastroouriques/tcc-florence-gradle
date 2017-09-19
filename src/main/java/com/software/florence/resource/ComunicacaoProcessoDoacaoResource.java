package com.software.florence.resource;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.ComunicacaoProcessoDoacao;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.service.ComunicacaoProcessoDoacaoService;
import com.software.florence.service.ComunicacaoProcessoDoacaoServiceImpl;
import com.software.florence.service.ProcessoDoacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/comunicacao-processo-doacao")
public class ComunicacaoProcessoDoacaoResource extends AbstractResource<ComunicacaoProcessoDoacao, Long> {

    @Autowired
    private ComunicacaoProcessoDoacaoService comunicacaoProcessoDoacaoService;

    @Autowired
    private ProcessoDoacaoService processoDoacaoService;

    public ComunicacaoProcessoDoacaoResource(ComunicacaoProcessoDoacaoServiceImpl comunicacaoProcessoDoacaoService) {
        super(comunicacaoProcessoDoacaoService);
        this.comunicacaoProcessoDoacaoService = comunicacaoProcessoDoacaoService;
    }

    @GetMapping("/processo-doacao/{id}")
    public ResponseEntity<ComunicacaoProcessoDoacao> findByProcessoDoacaoId(@PathVariable Long id) {
        Iterable<ComunicacaoProcessoDoacao> retorno = null;
        try {

            ProcessoDoacao processoDoacao = processoDoacaoService.findById(id);
            retorno = this.comunicacaoProcessoDoacaoService.findByProcessoDoacao(processoDoacao);
        } catch (NegocioException e) {
            return this.criarRespostaErro(e);
        } // try-catch
        return this.criarResposta(HttpStatus.OK, retorno);
    }// findById()
}
