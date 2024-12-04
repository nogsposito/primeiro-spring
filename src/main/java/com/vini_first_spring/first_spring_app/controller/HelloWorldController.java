package com.vini_first_spring.first_spring_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vini_first_spring.first_spring_app.domain.User;
import com.vini_first_spring.first_spring_app.service.HelloWorldService;

@RestController //@Controller e @ResponseBody (está criando api liadando com back-end apenas)
//API stateful: mantém estado de cada cliente, cookies. stateless: cada nova requisicao precisa de informacoes novas (rest é uma delas)
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired // ja faz injecao de dependencia de forma automatica
    private HelloWorldService helloWorldService;
    
    @GetMapping // responde requisicoes geet do /hello-world
    public String helloWorld(){
        return helloWorldService.helloWorld("vini");
    }

    @PostMapping("/{id}") // requisicao de post (manda)
    public String helloWorldPost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body){ // parametros tambem podem receber decoracoes! injeta no body o que vem da requisicao
        return "Hello World " + filter;
    }
}
