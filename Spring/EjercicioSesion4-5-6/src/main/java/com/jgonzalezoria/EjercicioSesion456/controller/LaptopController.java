package com.jgonzalezoria.EjercicioSesion456.controller;

import com.jgonzalezoria.EjercicioSesion456.entities.Laptop;
import com.jgonzalezoria.EjercicioSesion456.repository.LaptopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {

    // atributos
    private LaptopRepository laptopRepository;

    // constructores
    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    // CRUD sobre la entidad laptop

    // Buscar todos los portatiles (lista portatiles)

    /**
     * http://localhost:8080/api/laptops
     * @return
     */
    @GetMapping("api/laptops")
    public List<Laptop> findAll(){
        // recuperar y devolver los portatiles de la base de datos
        return laptopRepository.findAll();
    }

    // crear un nuevo portatil en base de datos
    @PostMapping("/api/laptops")
    public Laptop create(@RequestBody Laptop laptop){
        // guardar el libro recibido opr parámetro en la base de datos
        return laptopRepository.save(laptop);
    }


}
