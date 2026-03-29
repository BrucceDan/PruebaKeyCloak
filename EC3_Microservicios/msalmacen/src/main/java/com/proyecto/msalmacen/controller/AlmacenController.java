package com.proyecto.msalmacen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/almacen")
public class AlmacenController {

    @GetMapping("/stock")
    public String stock() {
        return "Stock disponible: 100 unidades";
    }
}