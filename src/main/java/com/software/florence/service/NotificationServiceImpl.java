package com.software.florence.service;

import com.notnoop.apns.APNS;
import com.notnoop.apns.ApnsNotification;
import com.notnoop.apns.ApnsService;
import com.software.florence.common.exception.NegocioException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

@Service
public class NotificationServiceImpl {

    @Autowired
    Environment env;

    public void push(String deviceToken) throws NegocioException{

        try {

            InputStream inputStream = new ClassPathResource("florence-certificate.p12").getInputStream();
            ApnsService service;

            if (Arrays.asList(env.getActiveProfiles()).contains("pro")) {
                service = APNS.newService().withCert(inputStream, "eduardo123456")
                        .withProductionDestination().build();
            } else {
                service = APNS.newService().withCert(inputStream, "eduardo123456")
                        .withSandboxDestination().build();
            }

            String payload = APNS.newPayload().customField("customData","customData")
                    .alertBody("Message").build();

            ApnsNotification apns = service.push("678a5d9905ef1b5a0cab7756771acabd613dc065235ee3ce0cf24380a8d98c83", payload);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
