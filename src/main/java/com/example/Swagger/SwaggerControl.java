package com.example.Swagger;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping
@Tag(name = "Swagger", description = "Gestione nome")
public class SwaggerControl {

    @Operation(summary = "Ottieni il nome", description = "Restituisce il nome")
    @GetMapping("/v1/name")
    public String getName(@RequestParam String name) {
        return name;
    }

    @Operation(summary = "Ottieni il nome al contrario", description = "Restituisce il nome al contrario")
    @PostMapping("/v1/reverse-name")
    public String reverseName(@RequestBody String name) {
        return new StringBuilder(name).reverse().toString();
    }

}