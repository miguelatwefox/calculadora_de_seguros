package com.example.calculadora_de_seguros;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.RecursiveTask;
@RequestMapping("")
@RestController
public class calculadora {

    @GetMapping
    public double calcular_precio_seguro(int edad, int num_hijos){

        return edad * num_hijos/2;
    }
}
