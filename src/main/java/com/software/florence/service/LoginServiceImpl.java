package com.software.florence.service;

import com.software.florence.common.pattern.application.service.GenericService;
import com.software.florence.entity.Login;
import com.software.florence.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl extends GenericService<Login, Long> implements LoginService {

    @Autowired
    LoginRepository loginRepository;

    public LoginServiceImpl(CrudRepository<Login, Long> repository) {
        super(repository);
    }

}
