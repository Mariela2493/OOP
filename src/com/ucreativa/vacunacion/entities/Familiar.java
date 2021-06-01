package com.ucreativa.vacunacion.entities;

public class Familiar  extends Persona {


    public Familiar(String nombre, String cedula, int edad, boolean riesgo, String parentezco) {
        super(nombre, cedula, edad, riesgo);
        this.parentezco = parentezco;
    }

    private String parentezco;


    public String getParentezco() {
        return parentezco;
    }

    public void setParentezco(String parentezco) {
        this.parentezco = parentezco;
    }
}


