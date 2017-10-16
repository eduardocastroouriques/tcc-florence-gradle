package com.software.florence.common.util.file;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

@Component
public class FileUtil {

    public void saveFileLocally(MultipartFile multipartFile, String path){

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
