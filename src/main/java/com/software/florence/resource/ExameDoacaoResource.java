package com.software.florence.resource;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.common.pattern.application.service.Service;
import com.software.florence.entity.ExameDoacao;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.service.ExameDoacaoService;
import com.software.florence.service.ProcessoDoacaoService;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPReply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.net.SocketException;
import java.nio.file.Paths;

@RestController
@RequestMapping(path = "/exame-doacao")
public class ExameDoacaoResource extends AbstractResource<ExameDoacao, Long> {

    @Autowired
    ExameDoacaoService exameComplementarService;

    @Autowired
    ProcessoDoacaoService processoDoacaoService;

    @Autowired
    Environment environment;

    public ExameDoacaoResource(Service<ExameDoacao, Long> service) {
        super(service);
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
