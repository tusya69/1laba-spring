package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InfoController {

    @GetMapping("/info")
    String info() {
        return "info.html";
    }

    @GetMapping("/moreinfo")
    String infoMila() {
        return "infoDetailed.html";
    }

}
