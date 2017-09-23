package com.software.florence.resource;

import com.software.florence.common.exception.NegocioException;
import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.common.pattern.application.service.Service;
import com.software.florence.entity.ExameDoacao;
import com.software.florence.entity.ProcessoDoacao;
import com.software.florence.service.ExameDoacaoService;
import com.software.florence.service.ProcessoDoacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
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

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> uploadFile(@RequestParam("uploadfile") MultipartFile uploadfile) {

        try {

            String filename = uploadfile.getOriginalFilename();
            String directory = environment.getProperty("florence.image.exame.doacao");
            String filepath = Paths.get(directory, filename).toString();

            BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(filepath)));
            stream.write(uploadfile.getBytes());
            stream.close();

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
