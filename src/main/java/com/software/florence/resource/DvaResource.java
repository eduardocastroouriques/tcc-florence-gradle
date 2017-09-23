package com.software.florence.resource;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.Aprovacao;
import com.software.florence.entity.DoencaPrevia;
import com.software.florence.entity.Dva;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.service.DoencaPreviaServiceImpl;
import com.software.florence.service.DvaService;
import com.software.florence.service.DvaServiceImpl;
import com.software.florence.service.ProcessoDoacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/dva")
public class DvaResource extends AbstractResource<Dva, Long> {

    @Autowired
    private DvaService dvaService;

    @Autowired
    ProcessoDoacaoService processoDoacaoService;

    public DvaResource(DvaServiceImpl dvaService) {
        super(dvaService);
        this.dvaService = dvaService;
    }

    @GetMapping("/processo-doacao/{id}")
    public ResponseEntity<Dva> findByProcessoDoacaoId(@PathVariable Long id) {
        Iterable<Dva> retorno = null;
        try {

            ProcessoDoacao processoDoacao = processoDoacaoService.findById(id);
            retorno = this.dvaService.findByProcessoDoacao(processoDoacao);
        } catch (NegocioException e) {
            return this.criarRespostaErro(e);
        } // try-catch
        return this.criarResposta(HttpStatus.OK, retorno);
    }// findById()
}
