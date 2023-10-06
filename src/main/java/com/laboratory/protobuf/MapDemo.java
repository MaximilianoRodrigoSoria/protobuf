package com.laboratory.protobuf;

import com.laboratory.protobuf.models.Auto;
import com.laboratory.protobuf.models.Concecionaria;

public class MapDemo {

    public static void main(String[] args) {

        Auto cronos = Auto.newBuilder()
                .setMarca("Fiat")
                .setModelo("Cronos")
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
    }

}
