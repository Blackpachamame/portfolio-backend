/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blackpachamame.portfolio.Service;

import com.blackpachamame.portfolio.Entity.Skill;
import com.blackpachamame.portfolio.Repository.ISkillRepository;
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
public class SkillService {

    @Autowired
    ISkillRepository skillr;

    public List<Skill> list() {
        return skillr.findAll();
    }

    public Optional<Skill> getOne(int id) {
        return skillr.findById(id);
    }

    public Optional<Skill> getByNombre(String nombre) {
        return skillr.findByNombre(nombre);
    }

    public void save(Skill skill) {
        skillr.save(skill);
    }

    public void delete(int id) {
        skillr.deleteById(id);
    }

    public boolean existsById(int id) {
        return skillr.existsById(id);
    }

    public boolean existsByNombre(String nombre) {
        return skillr.existsByNombre(nombre);
    }
}
