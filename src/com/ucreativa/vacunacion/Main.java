package com.ucreativa.vacunacion;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.BitacoraVacunacion;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.repositories.InMemoryRepository;
import com.ucreativa.vacunacion.repositories.Repository;
import com.ucreativa.vacunacion.repositories.FileRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        Repository repo= new InMemoryRepository();
        String nombre, cedula, edad, riesgo, isAmigo, relacion, facebook, parentesco, marca, print;
        Persona persona;
        while (true) {
            System.out.println("Nombre: ");
            nombre= in.nextLine();
            System.out.println("Cedula: ");
            cedula= in.nextLine();
            System.out.println("edad ");
            edad= in.nextLine();
            System.out.println("riesgo: ");
            riesgo= in.nextLine();
            System.out.println("Es amigo? : ");
            isAmigo= in.nextLine();
            if(isAmigo.equals("Si")){
                System.out.println("Relacion: ");
                relacion= in.nextLine();
                System.out.println("Facebook: ");
                facebook= in.nextLine();
                persona = new Amigo(nombre,cedula,Integer.parseInt(edad),riesgo.equals("S"),relacion,facebook);
            }else{

                System.out.println("Parentesco");
                parentesco= in.nextLine();
                persona =new Familiar(nombre,cedula,Integer.parseInt(edad),riesgo.equals("S"),parentesco);

            }

            System.out.println("Marca Vacuna: ");
            marca= in.nextLine();
            repo.save(persona, marca,new Date());
            System.out.println("Quiere Limpiar La lista");
            print= in.nextLine();
            if(print.equals("Si")){
                    for (String item : repo.get()){
                        System.out.println(item);
                    }
                }
            }
        }

    }


