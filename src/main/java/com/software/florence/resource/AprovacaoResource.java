package com.software.florence.resource;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.Aprovacao;
import com.software.florence.entity.DoencaAtual;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.service.AprovacaoService;
import com.software.florence.service.AprovacaoServiceImpl;
import com.software.florence.service.DoencaAtualServiceImpl;
import com.software.florence.service.ProcessoDoacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/aprovacao")
public class AprovacaoResource extends AbstractResource<Aprovacao, Long> {

    @Autowired
    private AprovacaoService aprovacaoService;

    @Autowired
    private ProcessoDoacaoService processoDoacaoService;

    public AprovacaoResource(AprovacaoServiceImpl aprovacaoService) {
        super(aprovacaoService);
        this.aprovacaoService = aprovacaoService;
    }

    @GetMapping("/processo-doacao/{id}")
    public ResponseEntity<Aprovacao> findByProcessoDoacaoId(@PathVariable Long id) {
        Iterable<Aprovacao> retorno = null;
        try {

            ProcessoDoacao processoDoacao = processoDoacaoService.findById(id);
            retorno = this.aprovacaoService.findByProcessoDoacao(processoDoacao);
        } catch (NegocioException e) {
            return this.criarRespostaErro(e);
        } // try-catch
        return this.criarResposta(HttpStatus.OK, retorno);
    }// findById()
}
