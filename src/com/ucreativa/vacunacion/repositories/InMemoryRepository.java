package com.ucreativa.vacunacion.repositories;
import com.ucreativa.vacunacion.entities.BitacoraVacunacion;
import com.ucreativa.vacunacion.entities.Persona;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InMemoryRepository implements Repository {

    private final List<BitacoraVacunacion> db;

    public InMemoryRepository(){
        this.db = new ArrayList<>();
    }

    public void save(Persona persona, String marca, Date fecha){
        this.db.add(new BitacoraVacunacion(persona, marca, fecha));
    }

    public List<String> get() {
        List<String> lines = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        for (BitacoraVacunacion item : db){
            lines.add(item.getPersona().getNombre()
                    + " - " + item.getMarca()
                    + " - " + format.format(item.getFecha()));
        }
        return lines;
    }


}