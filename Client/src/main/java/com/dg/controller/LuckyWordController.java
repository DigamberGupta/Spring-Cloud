package com.dg.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LuckyWordController {

    @Value("${lucky-word}")
    public String luckyWord;

    @RequestMapping("/lucky-word")
    public String showLuckyWord (){

        return "The Lucky Word Is :" +luckyWord;
    }
}
