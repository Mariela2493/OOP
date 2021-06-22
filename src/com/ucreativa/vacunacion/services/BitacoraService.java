package com.ucreativa.vacunacion.services;
import com.ucreativa.vacunacion.UI.ErrorEdadExeception;
import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.repositories.Repository;


import java.util.Date;
import java.util.List;

public class BitacoraService {

    private Repository repository;
    private ContadorRiesgo contador;

    public BitacoraService(Repository repository) {

        this.repository = repository;
        this.contador = ContadorRiesgo.getInstance();
    }

    public void save(String nombre, String cedula, String txtEdad,
                     boolean riesgo, boolean isAmigo, String relacion,
                     String facebook, String parentesco, String marca) throws ErrorEdadExeception {
        int edad;
        try {
            edad = Integer.parseInt(txtEdad);
        } catch (NumberFormatException x) {
            throw new ErrorEdadExeception (txtEdad);
        }
        if (riesgo){
            this.contador.SumarRiesgo();
        }
        Persona persona;
        if (isAmigo) {
            persona = new Amigo(nombre, cedula, edad, riesgo, relacion, facebook);
        } else {
            if (relacion.equals("Hermano")) {
                persona = new Familiar(nombre, cedula, edad, riesgo, parentesco);
            } else {
                persona = new Familiar(nombre, cedula, edad, riesgo, parentesco);
            }

        }
        this.repository.save(persona, marca, new Date());
    }

    public List<String> get() {
        System.out.println("La Cantidad de Personas con Riesgo es: "
                + this.contador.getCantidadRiesgo());
        return this.repository.get();
    }

}