package com.primeirospringlui.primeiroprojeto.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class Welcome {
    @RequestMapping
    public String welcome() {
        return "Tá̱̠̹͚̱̥̰͓̮ ̷̧̮̞̟̼̟̤́t̵͘͏͇͓̞͍̻͙̞̠ͅu̟͍d͡҉o̸ ̕d̮͈͍̟͓̰e̴̩r̝̟̻̠̠̭̲̞̙̰̙͜r̤e̮̬͎͔̩t͟͝e͈̲n̪͚̪͠do͇͉̳̩̞̺̹";
    }
}
