package com.software.florence.resource;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.Cirurgia;
import com.software.florence.entity.InformacaoCirurgia;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.service.CirurgiaService;
import com.software.florence.service.InformacaoCirurgiaService;
import com.software.florence.service.ProcessoDoacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/informacao-cirurgia")
public class InformacaoCirurgiaResource extends AbstractResource<InformacaoCirurgia, Long> {

    @Autowired
    InformacaoCirurgiaService informacaoCirurgiaService;

    @Autowired
    CirurgiaService cirurgiaService;

    public InformacaoCirurgiaResource(InformacaoCirurgiaService informacaoCirurgiaService) {
        super(informacaoCirurgiaService);
        this.informacaoCirurgiaService = informacaoCirurgiaService;
    }

    @GetMapping("/cirurgia/{id}")
    public ResponseEntity<InformacaoCirurgia> findByCirurgia(@PathVariable Long id) {
        Iterable<InformacaoCirurgia> retorno = null;
        try {

            Cirurgia cirurgia = cirurgiaService.findById(id);
            retorno = this.informacaoCirurgiaService.findByCirurgia(cirurgia);
        } catch (NegocioException e) {
            return this.criarRespostaErro(e);
        } // try-catch
        return this.criarResposta(HttpStatus.OK, retorno);
    }// findById()
}
