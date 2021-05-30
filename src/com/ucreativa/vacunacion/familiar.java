package com.ucreativa.vacunacion;

public class familiar {



    private String nombre;
    private String cedula;
    private String parentezco;
    private int edaad;
    private boolean riesgo;

    public familiar(String nombre, String cedula, String parentezco, int edaad, boolean riesgo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.parentezco = parentezco;
        this.edaad = edaad;
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

    public String getParentezco() {
        return parentezco;
    }

    public void setParentezco(String parentezco) {
        this.parentezco = parentezco;
    }

    public int getEdaad() {
        return edaad;
    }

    public void setEdaad(int edaad) {
        this.edaad = edaad;
    }

    public boolean isRiesgo() {
        return riesgo;
    }

    public void setRiesgo(boolean riesgo) {
        this.riesgo = riesgo;
    }
}
