/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.veterinaria.demo.repository;

import com.veterinaria.demo.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author fercr
 */
public interface MascotaRepository extends JpaRepository<Mascota, Long>{

}
