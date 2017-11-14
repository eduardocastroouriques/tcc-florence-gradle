package com.software.florence.resource;

import com.software.florence.common.pattern.application.resource.AbstractResource;
import com.software.florence.entity.Login;
import com.software.florence.service.LoginService;
import com.software.florence.service.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/login")
public class LoginResource extends AbstractResource<Login, Long> {

    @Autowired
    private LoginService loginService;

    public LoginResource(LoginServiceImpl loginService) {
        super(loginService);
    }

}
