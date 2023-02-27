/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.blackpachamame.portfolio.Interfaz;

import com.blackpachamame.portfolio.Entidad.Persona;
import java.util.List;

/**
 *
 * @author Travaglini
 */
public interface IPersonaServicio {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
}
