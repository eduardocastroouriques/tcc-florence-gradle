package com.software.florence.resource;

import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.common.pattern.application.service.Service;
import com.software.florence.common.util.ftp.FTPSender;
import com.software.florence.entity.ExameDoacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

@RestController
@RequestMapping(path = "/file")
public class FileResource extends AbstractResource<ExameDoacao, Long> {

    @Autowired
    Environment environment;

    @Autowired
    FTPSender ftpSender;

    public FileResource(Service<ExameDoacao, Long> service) {
        super(service);
    }

    @PostMapping("/upload/{tipo}")
    public ResponseEntity<?> uploadFile(@RequestParam("upload") MultipartFile multipartFile, @PathVariable String tipo) {

        if (!multipartFile.isEmpty()) {

            switch (tipo){

                case "exame_doacao":

                    saveFileLocally(multipartFile, environment.getProperty("florence.image.exame.doacao"));
                    ftpSender.send(environment.getProperty("florence.image.exame.doacao"), multipartFile.getOriginalFilename());

                    break;

                case "exame_complementar":

                    saveFileLocally(multipartFile, environment.getProperty("florence.image.exame.complementar"));
                    ftpSender.send(environment.getProperty("florence.image.exame.complementar"), multipartFile.getOriginalFilename());

                    break;
            }


        }

        return new ResponseEntity<>(HttpStatus.OK);
    }

    private void saveFileLocally(MultipartFile multipartFile, String path){

        try {

            byte[] bytes = multipartFile.getBytes();

            File file = new File(path);
            File serverFile = new File(file.getAbsolutePath() + File.separator + multipartFile.getOriginalFilename());
            BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
            stream.write(bytes);

            stream.close();

        } catch (Exception e) {
            String sds = "";
        }

    }
}
