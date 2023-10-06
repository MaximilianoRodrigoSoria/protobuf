package com.laboratory.protobuf;

import com.laboratory.protobuf.models.Auto;
import com.laboratory.protobuf.models.Direccion;
import com.laboratory.protobuf.models.Persona;

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
                .build();

        System.out.println(maximiliano.toString());


    }
}
