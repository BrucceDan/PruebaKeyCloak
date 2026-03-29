package com.proyecto.msproductos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

        @GetMapping("/listar")
        public List<String> listar() {
            return List.of("Producto A", "Producto B", "Producto C");
        }
}

