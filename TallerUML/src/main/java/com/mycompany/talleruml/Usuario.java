/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.talleruml;

import java.util.LinkedList;

/**
 *
 * @author CltControl
 */
public class Usuario {
    protected String usuario;
    protected String contrasena;
    protected String nombre;
    protected String apellido;
    protected LinkedList<Incidente> incidentes;
    
    public Usuario( String usuario, String contrasena, String nombre, String apellido){
        
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
        this.incidentes = new LinkedList<>();
        
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LinkedList<Incidente> getIncidentes() {
        return incidentes;
    }
    
    public void addIncident (Incidente inc) {
        incidentes.addLast(inc);
    }
    
    protected boolean logIn() { return true;}
    
    protected boolean logOut() { return true;}
    
}
