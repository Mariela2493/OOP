package com.ucreativa.vacunacion.entities;

import java.util.Date;

public class BitacoraVacunacion {

    private Persona persona;
    private String marca;
    private Date fecha;


    public BitacoraVacunacion(Persona persona, String marca, Date fechaa) {
        this.persona = persona;
        this.marca = marca;
        this.fecha = fecha;

    }
    public Persona getPersona() {
        return persona;
    }

    public String getMarca() {
        return marca;
    }

    public Date getFecha() {
        return fecha;
    }


}
