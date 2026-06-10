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
public class Profesor extends  PersonalAcademico{
    private ArrayList<Curso> cursos;
    

    public Profesor(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
        cursos = new ArrayList<>();
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
    
    

    public void cargarActividadSumativa( Curso curso, Estudiante estudiante, ActividadesSumativas actividadSumativa) {
        
    } 
            
    public void  calificarActividadSumativa( Curso curso, Estudiante estudiante, ActividadesSumativas actividadSumativa) {
        
    } 
            
    public void aceptarInscripcion( Curso curso, String usuarioEstudainte) {
        
    }
            
    public void crearForo( Foro foro) {
        
    } 
    
}
