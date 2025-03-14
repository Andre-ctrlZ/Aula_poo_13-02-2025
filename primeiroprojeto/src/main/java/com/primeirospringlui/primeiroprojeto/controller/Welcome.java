package com.primeirospringlui.primeiroprojeto.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primeirospringlui.primeiroprojeto.Services.HelloWorld;

@RestController
@RequestMapping("/welcome")
public class Welcome {

    private HelloWorld helloWorld;

    public Welcome(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    @RequestMapping
    public String welcome() {
        return helloWorld.helloWorld("Lui");
    }
}
