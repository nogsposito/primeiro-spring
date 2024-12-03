package com.vini_first_spring.first_spring_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //@Controller e @ResponseBody (está criando api liadando com back-end apenas)
//API stateful: mantém estado de cada cliente, cookies. stateless: cada nova requisicao precisa de informacoes novas (rest é uma delas)
@RequestMapping("/hello-world")
public class HelloWorldController {
    @GetMapping // responde requisicoes geet do /hello-world
    public String helloWorld(){
        return "Hello World!";
    }
}
