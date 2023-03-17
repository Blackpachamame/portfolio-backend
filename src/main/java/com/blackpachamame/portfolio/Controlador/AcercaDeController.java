/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blackpachamame.portfolio.Controlador;

import com.blackpachamame.portfolio.Dto.AcercaDeDto;
import com.blackpachamame.portfolio.Entidad.AcercaDe;
import com.blackpachamame.portfolio.Security.Controller.Mensaje;
import com.blackpachamame.portfolio.Servicio.AcercaDeService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Marcos
 */
@RestController
@RequestMapping("/acercade")
@CrossOrigin(origins = "http://localhost:4200")
public class AcercaDeController {
    @Autowired
    AcercaDeService acercaDeS;
    
    @GetMapping("/lista")
    public ResponseEntity<List<AcercaDe>> list() {
        List<AcercaDe> list = acercaDeS.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<AcercaDe> getById(@PathVariable("id") int id) {
        if (!acercaDeS.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.BAD_REQUEST);
        }

        AcercaDe acercaDe = acercaDeS.getOne(id).get();
        return new ResponseEntity(acercaDe, HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody AcercaDeDto acercaDeDto){
        if(!acercaDeS.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        
        AcercaDe acercaDe = acercaDeS.getOne(id).get();
        
        acercaDe.setDescripcion(acercaDeDto.getDescripcion());
        
        acercaDeS.save(acercaDe);
        
        return new ResponseEntity(new Mensaje("Descripción actualizada"), HttpStatus.OK);
    }
}
