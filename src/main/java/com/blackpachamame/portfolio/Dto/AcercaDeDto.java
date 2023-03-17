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
public class AcercaDeDto {
    @NotBlank
    private String descripcion;

    public AcercaDeDto() {
    }

    public AcercaDeDto(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
