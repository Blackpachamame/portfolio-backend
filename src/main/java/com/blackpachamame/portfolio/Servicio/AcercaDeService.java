/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blackpachamame.portfolio.Servicio;

import com.blackpachamame.portfolio.Entidad.AcercaDe;
import com.blackpachamame.portfolio.Repositorio.IAcercaDeRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marcos
 */
@Service
@Transactional
public class AcercaDeService {

    @Autowired
    IAcercaDeRepository acercaDeR;

    public List<AcercaDe> list() {
        return acercaDeR.findAll();
    }

    public Optional<AcercaDe> getOne(int id) {
        return acercaDeR.findById(id);
    }

    public void save(AcercaDe educacion) {
        acercaDeR.save(educacion);
    }

    public boolean existsById(int id) {
        return acercaDeR.existsById(id);
    }
}
