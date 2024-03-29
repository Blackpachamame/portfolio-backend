/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.blackpachamame.portfolio.Repository;

import com.blackpachamame.portfolio.Entity.Skill;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Marcos
 */
public interface ISkillRepository extends JpaRepository<Skill, Integer> {

    Optional<Skill> findByNombre(String nombre);

    public boolean existsByNombre(String nombre);
}
