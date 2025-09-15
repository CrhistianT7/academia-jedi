package com.example.academia_jedi.controller;

import com.example.academia_jedi.entity.Padawan;
import com.example.academia_jedi.service.PadawanService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/padawans")
public class PadawanController {

    private final PadawanService service;

    public PadawanController(PadawanService service) { this.service = service; }

    @Operation(summary = "List all padawans")
    @GetMapping
    public ResponseEntity<List<Padawan>> all(){
        return ResponseEntity.ok(service.getAll());
    }
}
