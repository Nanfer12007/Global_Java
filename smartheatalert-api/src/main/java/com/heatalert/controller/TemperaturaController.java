package com.heatalert.controller;

import com.heatalert.entity.Temperatura;
import com.heatalert.repository.TemperaturaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/temperaturas")
public class TemperaturaController {

    @Autowired
    private TemperaturaRepository repository;

    @PostMapping
    public ResponseEntity<Temperatura> registrar(@RequestBody @Valid Temperatura temp) {
        temp.setAlertaEmitido(temp.getTemperaturaMaxima() >= 40.0);
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(temp));
    }

    @GetMapping
    public List<Temperatura> listar(@RequestParam(required = false) String cidade) {
        return (cidade != null) ? repository.findByCidade(cidade) : repository.findAll();
    }
}
