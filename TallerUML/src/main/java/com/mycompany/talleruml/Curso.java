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

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Estudiante> getEstudiantesEnEspera() {
        return estudiantesEnEspera;
    }

    public void setEstudiantesEnEspera(ArrayList<Estudiante> estudiantesEnEspera) {
        this.estudiantesEnEspera = estudiantesEnEspera;
    }

    public ArrayList<Estudiante> getEstudiantesInscritos() {
        return estudiantesInscritos;
    }

    public void setEstudiantesInscritos(ArrayList<Estudiante> estudiantesInscritos) {
        this.estudiantesInscritos = estudiantesInscritos;
    }

    public ArrayList<Foro> getForo() {
        return foro;
    }

    public void setForo(ArrayList<Foro> foro) {
        this.foro = foro;
    }
    
    
    
    
    public ArrayList<ActividadesSumativas> getActividad_sumativa() {
        return actividad_sumativa;
    }

    public void setActividad_sumativa(ArrayList<ActividadesSumativas> actividad_sumativa) {
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
