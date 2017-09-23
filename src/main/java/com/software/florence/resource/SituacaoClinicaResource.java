package com.software.florence.resource;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.entity.SituacaoClinica;
import com.software.florence.service.ProcessoDoacaoService;
import com.software.florence.service.SituacaoClinicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/situacao-clinica")
public class SituacaoClinicaResource extends AbstractResource<SituacaoClinica, Long> {

    @Autowired
    SituacaoClinicaService situacaoClinicaService;

    @Autowired
    ProcessoDoacaoService processoDoacaoService;

    public SituacaoClinicaResource(SituacaoClinicaService situacaoClinicaService) {
        super(situacaoClinicaService);
        this.situacaoClinicaService = situacaoClinicaService;
    }

    @GetMapping("/processo-doacao/{id}")
    public ResponseEntity<SituacaoClinica> findByProcessoDoacaoId(@PathVariable Long id) {
        Iterable<SituacaoClinica> retorno = null;
        try {

            ProcessoDoacao processoDoacao = processoDoacaoService.findById(id);
            retorno = this.situacaoClinicaService.findByProcessoDoacao(processoDoacao);
        } catch (NegocioException e) {
            return this.criarRespostaErro(e);
        } // try-catch
        return this.criarResposta(HttpStatus.OK, retorno);
    }// findById()
}
