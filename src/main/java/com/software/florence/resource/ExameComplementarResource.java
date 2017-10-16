package com.software.florence.resource;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.common.util.file.FileUtil;
import com.software.florence.common.util.ftp.FTPSender;
import com.software.florence.entity.ExameComplementar;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.service.ExameComplementarService;
import com.software.florence.service.ProcessoDoacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping(path = "/exame-complementar")
public class ExameComplementarResource extends AbstractResource<ExameComplementar, Long> {

    @Autowired
    ExameComplementarService exameComplementarService;

    @Autowired
    ProcessoDoacaoService processoDoacaoService;

    @Autowired
    Environment environment;

    @Autowired
    FTPSender ftpSender;

    @Autowired
    FileUtil fileUtil;

    public ExameComplementarResource(ExameComplementarService exameComplementarService) {
        super(exameComplementarService);
        this.exameComplementarService = exameComplementarService;
    }

    @GetMapping("/processo-doacao/{id}")
    public ResponseEntity<ExameComplementar> findByProcessoDoacaoId(@PathVariable Long id) {
        List<ExameComplementar> retorno = null;
        try {

            ProcessoDoacao processoDoacao = processoDoacaoService.findById(id);
            retorno = this.exameComplementarService.findByProcessoDoacao(processoDoacao);
        } catch (NegocioException e) {
            return this.criarRespostaErro(e);
        } // try-catch
        return this.criarResposta(HttpStatus.OK, retorno);
    }// findById()

    @PostMapping("/upload")
    public ResponseEntity<?> uploadFile(@RequestParam("upload") MultipartFile multipartFile) {

        if (!multipartFile.isEmpty()) {

            fileUtil.saveFileLocally(multipartFile, environment.getProperty("florence.image.exame.complementar"));
            ftpSender.send(environment.getProperty("florence.image.exame.complementar"), multipartFile.getOriginalFilename());

        }

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
