/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.talleruml;

import java.util.Date;
import java.util.List;

/**
 *
 * @author CltControl
 */
public class Incidente {
    protected int id;
    protected Date fecha_reportado;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected List<String> log_actualizaciones;
    protected Date fecha_cerrado;
    protected String tipo;

    public int getId() {
        return id;
    }

    public Date getFecha_reportado() {
        return fecha_reportado;
    }

    public String getEstado() {
        return estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<String> getLog_actualizaciones() {
        return log_actualizaciones;
    }

    public Date getFecha_cerrado() {
        return fecha_cerrado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setFecha_reportado(Date fecha_reportado) {
        this.fecha_reportado = fecha_reportado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setLog_actualizaciones(List<String> log_actualizaciones) {
        this.log_actualizaciones = log_actualizaciones;
    }

    public void setFecha_cerrado(Date fecha_cerrado) {
        this.fecha_cerrado = fecha_cerrado;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
