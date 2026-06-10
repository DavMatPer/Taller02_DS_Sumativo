package com.mycompany.talleruml;

public class Curso {
    private ActividadesSumativas actividad_sumativa;
    private String id;
    private String nombre;
    private Boolean estadoOperativo;

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
