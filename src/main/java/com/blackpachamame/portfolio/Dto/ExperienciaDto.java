/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blackpachamame.portfolio.Dto;

import jakarta.validation.constraints.NotBlank;

/**
 *
 * @author Marcos
 */
public class ExperienciaDto {

    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;

    //Constructores
    public ExperienciaDto() {
    }

    public ExperienciaDto(String nombreE, String descripcionE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
    }

    //Getters and Setters
    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

}
