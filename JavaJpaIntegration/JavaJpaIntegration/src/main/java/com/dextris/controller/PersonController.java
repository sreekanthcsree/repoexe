package com.dextris.controller;

import com.dextris.entity.Employee;
import com.dextris.model.RegisterBean;
import com.dextris.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    public void register(RegisterBean registerBean){
        
        personService.save(registerBean);

    }
    public void login() {
    }
}
