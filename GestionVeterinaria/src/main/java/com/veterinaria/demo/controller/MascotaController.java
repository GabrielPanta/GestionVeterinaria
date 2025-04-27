/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.veterinaria.demo.controller;

import com.veterinaria.demo.model.Mascota;
import com.veterinaria.demo.repository.MascotaRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author GABRIEL PANTA
 */

@RestController
@RequestMapping("/mascotas")
public class MascotaController {
        private final MascotaRepository mascotaRepository;

    public MascotaController(MascotaRepository mascotaRepository) {
        this.mascotaRepository = mascotaRepository;
    }

    @GetMapping("/todos")
    public List<Mascota> getAll() {
        return mascotaRepository.findAll();
    }

    @PostMapping("/registrar")
    public Mascota create(@RequestBody Mascota mascota) {
        return mascotaRepository.save(mascota);
    }
}
