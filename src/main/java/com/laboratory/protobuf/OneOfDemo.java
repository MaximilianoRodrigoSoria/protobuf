package com.laboratory.protobuf;

import com.laboratory.protobuf.models.responses.Error;
import com.laboratory.protobuf.models.responses.Response;
import com.laboratory.protobuf.models.responses.ResponseBasic;

public class OneOfDemo {
    public static void main(String[] args) {

        Error er = Error.newBuilder()
                .setCode(500)
                .setMessage("Este es un error generico")
                .setPath("/some")
                .build();

        ResponseBasic br = ResponseBasic
                .newBuilder()
                .setCode("200")
                .setObject("Hola Mundo!!!")
                .build();

        Response response = Response.newBuilder()
                .setError(er)
                .setResponse(br)
                .build();

        Response responseError = Response.newBuilder()
                .setError(er)
                .build();


        System.out.println(response.getResponse().toString());
        System.out.println(responseError.getError().toString());


    }

}
