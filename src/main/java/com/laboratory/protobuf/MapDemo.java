package com.laboratory.protobuf;


import com.laboratory.protobuf.models.auto.Auto;
import com.laboratory.protobuf.models.auto.Carroseria;
import com.laboratory.protobuf.models.concecionaria.Concecionaria;

public class MapDemo {

    public static void main(String[] args) {

        Auto cronos = Auto.newBuilder()
                .setMarca("Fiat")
                .setModelo("Cronos")
                .setCarroseria(Carroseria.SEDAN)
                .setAnio("2023")
                .build();
        Auto pulse = Auto.newBuilder()
                .setMarca("Fiat")
                .setModelo("Pulse")
                .setAnio("2024")
                .build();
        Concecionaria concecionaria = Concecionaria
                .newBuilder()
                .putModelo(2023, cronos)
                .putModelo(2024, pulse)
                .build();


        System.out.println(concecionaria.getModeloMap());
        System.out.println(concecionaria.getModeloOrDefault(2019, cronos));
        System.out.println(concecionaria.getModeloOrDefault(2019, cronos).getCarroseria());
    }

}
