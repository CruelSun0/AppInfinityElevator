package com.education.infintyelevator.model;

import android.annotation.SuppressLint;
import android.widget.RadioButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Quizes {


    private int alternativaCorreta;
    private String enunciado;
    List<String> listaQuestoes = new ArrayList<String>();

    public  Quizes(String enunciado, int alternativaCorreta, String... alternativas) {

        this.enunciado = enunciado;
        this.alternativaCorreta = alternativaCorreta;
        listaQuestoes.add(alternativas[0]);
        listaQuestoes.add(alternativas[1]);
        listaQuestoes.add(alternativas[2]);
        listaQuestoes.add(alternativas[3]);

    }
    public List<String> getListaQuestoes(){return listaQuestoes;}
    public int getAlternativaCorreta(){return alternativaCorreta;}
    public String getEnunciado (){return enunciado;}


}
