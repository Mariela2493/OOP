package com.ucreativa.vacunacion;

public class Amigo {

  private String nombre;
  private String cedula;
  private String relacion;
  private String facebok;
  private int edad;
  private boolean riesgo;
    public Amigo(String nombre, String cedula, String relacion, String facebok, int edad, boolean riesgo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.relacion = relacion;
        this.facebok = facebok;
        this.edad = edad;
        this.riesgo = riesgo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getRelacion() {
        return relacion;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }

    public String getFacebok() {
        return facebok;
    }

    public void setFacebok(String facebbok) {
        this.facebok = facebok;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isRiesgo() {
        return riesgo;
    }

    public void setRiesgo(boolean riesgo) {
        this.riesgo = riesgo;
    }


}
