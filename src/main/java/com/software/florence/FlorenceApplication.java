package com.software.florence;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.ClassPathResource;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.io.*;

@SpringBootApplication
@EnableSwagger2
public class FlorenceApplication implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(FlorenceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {




    }

}
