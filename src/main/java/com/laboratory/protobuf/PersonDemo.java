package com.laboratory.protobuf;


import com.google.protobuf.Int32Value;
import com.laboratory.protobuf.models.Direccion;
import com.laboratory.protobuf.models.Persona;
import com.laboratory.protobuf.models.auto.Auto;
import com.laboratory.protobuf.models.auto.Carroseria;

import java.util.List;

public class PersonDemo {
    public static void main(String[] args) {
        List<Auto> autos = List.of(
                Auto.newBuilder()
                .setMarca("Fiat")
                .setModelo("Cronos")
                .setAnio("2022")
                .build(),
                Auto.newBuilder()
                .setMarca("Fiat")
                .setModelo("Pulse")
                .setAnio("2024")
                .setCarroseria(Carroseria.COUPE)
                .build());

        Direccion direccion = Direccion.newBuilder()
                .setAltura(123)
                .setLocalidad("Florencio Varela")
                .setCalle("Av Eva Peron 9773")
                .build();

        Persona maximiliano = Persona.newBuilder()
                .setNombre("Maximiliano")
                .setEdad(35)
                .addAllAuto(autos)
                .setDireccion(direccion)
                .setNumber(Int32Value.of(35))
                .build();




        System.out.println(maximiliano.toString());


    }
}
