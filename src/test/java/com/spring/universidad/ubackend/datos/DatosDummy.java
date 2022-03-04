package com.spring.universidad.ubackend.datos;

import com.spring.universidad.ubackend.modelo.entidades.*;


import java.math.BigDecimal;

import static com.spring.universidad.ubackend.modelo.enumeradores.TipoEmpleado.*;

public class DatosDummy {

    public static Carrera carrera01(boolean conId){
        Carrera carrera = conId ? new Carrera(1, "Ingenieria en sistemas", 50,5) :
                new Carrera(null, "Ingenieria en sistemas", 50,5);

        return carrera;
    }

    public static Carrera carrera02(){
        return new Carrera(null, "Licenciatura en sistemas", 45,4);
    }

    public static Carrera carrera03(boolean conId){
        Carrera carrera = conId ? new Carrera(3, "Ingenieria Industrial", 60,5) :
                new Carrera(null, "Ingenieria Industrial", 60,5);
        return carrera;
    }

    public static Persona empleado01(){
        return new Empleado(null,"Lautaro", "Lopez", "25174036", new Direccion(), new BigDecimal("46750.70"), ADMINISTRATIVO);
    }

    public static Persona empleado02(){
        return new Empleado(null,"Leandro", "Lopez", "25174630", new Direccion(), new BigDecimal("46750.70"), MANTENIMIENTO);
    }

    public static Persona profesor01(){
        return new Profesor(null,"Martin", "Lugone", "33908461", new Direccion(), new BigDecimal("60000.00"));
    }

    public static Persona alumno01(){
        return new Alumno(null, "Jhon", "Benitez", "45233715", new Direccion());
    }

    public static Persona alumno02(){
        return new Alumno(null, "Andres", "Benitez", "45233891", new Direccion());
    }

    public static Persona alumno03(){
        return new Alumno(null, "Joaquin", "Leon", "45233012", new Direccion());
    }
}
