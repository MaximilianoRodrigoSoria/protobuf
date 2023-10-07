package com.laboratory.protobuf;


import com.laboratory.protobuf.models.Persona;
import com.laboratory.protobuf.models.auto.Auto;
import com.laboratory.protobuf.models.auto.Carroseria;

import java.util.List;

public class DefaultValue {
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


        Persona maximiliano = Persona.newBuilder()
                .setNombre("Maximiliano")
                .setEdad(35)
                .addAllAuto(autos)
                .build();
        System.out.println("Direccion, calle:".concat(maximiliano.getDireccion().getCalle()));
        System.out.println("Carroceria: "+maximiliano.getAuto(0).getCarroseria());

    }
}
