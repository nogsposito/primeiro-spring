package com.vini_first_spring.first_spring_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vini_first_spring.first_spring_app.service.HelloWorldService;

@RestController //@Controller e @ResponseBody (está criando api liadando com back-end apenas)
//API stateful: mantém estado de cada cliente, cookies. stateless: cada nova requisicao precisa de informacoes novas (rest é uma delas)
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired // ja faz injecao de dependencia de forma automatica
    private HelloWorldService helloWorldService;
    
    //public HelloWorldController(HelloWorldService helloWorldService){
    //    this.helloWorldService = helloWorldService;
    //}
    
    @GetMapping // responde requisicoes geet do /hello-world
    public String helloWorld(){
        return helloWorldService.helloWorld("vini");
    }
}
