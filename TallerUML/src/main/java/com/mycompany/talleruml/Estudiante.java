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
public class Estudiante extends  PersonalAcademico{
    
    public ArrayList<Curso> curso;
    public ArrayList<ActividadesSumativas> actividades;

    public Estudiante(String usuario, String contrasena, String nombre, String apellido) {
        super(usuario, contrasena, nombre, apellido);
        curso=new ArrayList<>();
        actividades=new ArrayList<>();

    }
    public void solicitatInscripcionCurso(Curso curso){};
    public void realizarActividadSumativa(Curso curso, ActividadesSumativas actividadesuma){};

}
