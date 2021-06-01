package com.ucreativa.vacunacion.entities;

public class Amigo extends Persona {


    private String relacion;

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }

    public void setFacebok(String facebok) {
        this.facebok = facebok;
    }

    private String facebok;


    public Amigo(String nombre, String cedula, int edad, boolean riesgo, String relacion, String facebok) {
        super(nombre, cedula, edad, riesgo);
        this.relacion = relacion;
        this.facebok = facebok;
    }

    public String getRelacion() {
        return relacion;
    }

    public String getFacebok() {
        return facebok;
    }


}
