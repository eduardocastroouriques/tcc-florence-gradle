package com.software.florence.resource;

import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.ExameDoacao;
import com.software.florence.service.ExameDoacaoService;
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
@RequestMapping(path = "/exameDoacao")
public class ExameDoacaoResource extends AbstractResource<ExameDoacao, Long> {

    @Autowired
    ExameDoacaoService exameComplementarService;

    @Autowired
    Environment environment;

    public ExameDoacaoResource(ExameDoacaoService exameComplementarService) {
        super(exameComplementarService);
        this.exameComplementarService = exameComplementarService;
    }

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
