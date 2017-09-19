package com.software.florence.resource;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.Aprovacao;
import com.software.florence.entity.DoencaAtual;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.service.DoencaAtualService;
import com.software.florence.service.DoencaAtualServiceImpl;
import com.software.florence.service.ProcessoDoacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/doencaAtual")
public class DoencaAtualResource extends AbstractResource<DoencaAtual, Long> {

    @Autowired
    private DoencaAtualService doencaAtualService;

    @Autowired
    private ProcessoDoacaoService processoDoacaoService;

    public DoencaAtualResource(DoencaAtualServiceImpl doencaAtualService) {
        super(doencaAtualService);
        this.doencaAtualService = doencaAtualService;
    }

    @GetMapping("/processo-doacao/{id}")
    public ResponseEntity<DoencaAtual> findByProcessoDoacaoId(@PathVariable Long id) {
        Iterable<DoencaAtual> retorno = null;
        try {

            ProcessoDoacao processoDoacao = processoDoacaoService.findById(id);
            retorno = this.doencaAtualService.findByProcessoDoacao(processoDoacao);
        } catch (NegocioException e) {
            return this.criarRespostaErro(e);
        } // try-catch
        return this.criarResposta(HttpStatus.OK, retorno);
    }// findById()
}
