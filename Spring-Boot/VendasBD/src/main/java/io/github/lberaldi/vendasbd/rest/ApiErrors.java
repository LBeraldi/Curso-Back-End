package io.github.lberaldi.vendasbd.rest;

import lombok.Data;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Data
public class ApiErrors {
    private List<String> errors;

    public ApiErrors(String mensagemErro){
        this.errors = Arrays.asList(mensagemErro);
    }
}
