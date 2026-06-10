package com.mycompany.talleruml;

import java.util.ArrayList;

public class Curso {
    private ArrayList<ActividadesSumativas> actividad_sumativa;
    private String id;
    private String nombre;
    private Boolean estadoOperativo;
    private Profesor profesor;
    private ArrayList<Estudiante> estudiantesEnEspera;
    private ArrayList<Estudiante> estudiantesInscritos;
    private ArrayList<Foro> foro;
    

    public Curso(ArrayList<ActividadesSumativas> actividad_sumativa, String id, String nombre, Boolean estadoOperativo, Profesor profesor) {
        this.actividad_sumativa = actividad_sumativa;
        this.id = id;
        this.nombre = nombre;
        this.estadoOperativo = estadoOperativo;
        this.profesor = profesor;
        
        foro = new ArrayList<>();
        estudiantesEnEspera = new ArrayList<>();
        estudiantesInscritos = new ArrayList<>();
    }
    
    

    public ActividadesSumativas getActividad_sumativa() {
        return actividad_sumativa;
    }

    public void setActividad_sumativa(ActividadesSumativas actividad_sumativa) {
        this.actividad_sumativa = actividad_sumativa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getEstadoOperativo() {
        return estadoOperativo;
    }

    public void setEstadoOperativo(Boolean estadoOperativo) {
        this.estadoOperativo = estadoOperativo;
    }
    
}
