package com.primeirospringlui.primeiroprojeto.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class HelloWorld {

    @GetMapping
    public String helloWorld(String name) {
        return "Hello, " + name + "!";
    }
}
