package com.software.florence.resource;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.Aprovacao;
import com.software.florence.entity.ExameDoacao;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.service.ExameDoacaoService;
import com.software.florence.service.ProcessoDoacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/exame-doacao")
public class ExameDoacaoResource extends AbstractResource<ExameDoacao, Long> {

    @Autowired
    ExameDoacaoService exameComplementarService;

    @Autowired
    ProcessoDoacaoService processoDoacaoService;

    public ExameDoacaoResource(ExameDoacaoService exameComplementarService) {
        super(exameComplementarService);
        this.exameComplementarService = exameComplementarService;
    }

    @GetMapping("/processo-doacao/{id}")
    public ResponseEntity<ExameDoacao> findByProcessoDoacaoId(@PathVariable Long id) {
        Iterable<ExameDoacao> retorno = null;
        try {

            ProcessoDoacao processoDoacao = processoDoacaoService.findById(id);
            retorno = this.exameComplementarService.findByProcessoDoacao(processoDoacao);
        } catch (NegocioException e) {
            return this.criarRespostaErro(e);
        } // try-catch
        return this.criarResposta(HttpStatus.OK, retorno);
    }// findById()
}
