package com.ucreativa;
import com.ucreativa.vacunacion.entities.BitacoraVacunacion;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Amigo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

     Familiar  mama = new Familiar ("Marjorie","1234", 55, true, "Madre");
     Familiar  papa = new Familiar ("Jorge","1234", 59, false, "Padre");

     List<BitacoraVacunacion> bitacora= new ArrayList<>();
    bitacora.add(new BitacoraVacunacion(mama,"Pfizer", new Date()));
    bitacora.add(new BitacoraVacunacion(papa,"Jhonson", new Date()));

    }
}
