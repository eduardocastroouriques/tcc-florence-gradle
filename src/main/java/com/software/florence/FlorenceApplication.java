package com.software.florence;

import com.software.florence.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class FlorenceApplication implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(FlorenceApplication.class, args);
    }

    @Autowired
    AccountService accountService;

    @Override
    public void run(String... args) throws Exception {

        accountService.createAccount("eduardo", "eduardo.ouriques2@gmail.com", "Edu@rdo123");

    }
}
