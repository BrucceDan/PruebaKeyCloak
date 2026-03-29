package com.proyecto.msventa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/ventas")
public class VentasController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/procesar")
    public String procesarVenta() {

        String productos = restTemplate.getForObject(
                "http://productos-service:8082/productos/listar",
                String.class
        );

        String stock = restTemplate.getForObject(
                "http://almacen-service:8083/almacen/stock",
                String.class
        );

        return "Venta procesada | " + productos + " | " + stock;
    }
}