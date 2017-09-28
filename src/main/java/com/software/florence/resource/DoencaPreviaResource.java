package com.software.florence.resource;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.DoencaPrevia;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.service.DoencaPreviaService;
import com.software.florence.service.DoencaPreviaServiceImpl;
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
@RequestMapping(path = "/doenca-previa")
public class DoencaPreviaResource extends AbstractResource<DoencaPrevia, Long> {

    @Autowired
    DoencaPreviaService doencaPreviaService;

    @Autowired
    ProcessoDoacaoService processoDoacaoService;

    public DoencaPreviaResource(DoencaPreviaServiceImpl doencaPreviaService) {
        super(doencaPreviaService);
        this.doencaPreviaService = doencaPreviaService;
    }

    @GetMapping("/processo-doacao/{id}")
    public ResponseEntity<DoencaPrevia> findByProcessoDoacaoId(@PathVariable Long id) {
        List<DoencaPrevia> retorno = null;
        try {

            ProcessoDoacao processoDoacao = processoDoacaoService.findById(id);
            retorno = this.doencaPreviaService.findByProcessoDoacao(processoDoacao);
        } catch (NegocioException e) {
            return this.criarRespostaErro(e);
        } // try-catch
        return this.criarResposta(HttpStatus.OK, retorno.get(0));
    }// findById()
}
