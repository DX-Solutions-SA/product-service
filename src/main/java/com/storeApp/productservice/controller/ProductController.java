package com.storeApp.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ProductController {
    @GetMapping
    public String holamUndo(){
        return "Hola Mundo 2 estoes un verdaero cambio";
    }
}
