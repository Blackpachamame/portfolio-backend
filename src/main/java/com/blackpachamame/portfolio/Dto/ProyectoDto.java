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
public class ProyectoDto {
    @NotBlank
    private String nombre;
    @NotBlank
    private String descripcion;

    public ProyectoDto() {
    }

    public ProyectoDto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}