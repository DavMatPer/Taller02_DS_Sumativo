/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.talleruml;

import java.util.ArrayList;

/**
 *
 * @author CltControl
 */
public class PersonalAcademico extends Usuario{
    
    protected ArrayList<Incidente> incidentesIngresados;

    public PersonalAcademico(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
        
        incidentesIngresados = new ArrayList<>();
    }

    public ArrayList<Incidente> getIncidentesIngresados() {
        return incidentesIngresados;
    }
    
    
    
    public void reportarError(String email, String contenido) {
        
    }
    
    public void solicitarAsesoramienDelSistema( String email, String contenido ) {
        
    }
    
    public void comentarEnForo(Foro foro, String comentario ) {
        
    }
    
}
