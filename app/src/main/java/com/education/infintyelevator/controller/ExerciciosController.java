package com.education.infintyelevator.controller;

import com.education.infintyelevator.model.Exercicios;

import java.util.ArrayList;
import java.util.List;

public abstract class ExerciciosController {

    List<Exercicios> listaExercicios;
    public ExerciciosController() {

        listaExercicios = new ArrayList<>();

    }
    public void criarExercicios(){}

}
