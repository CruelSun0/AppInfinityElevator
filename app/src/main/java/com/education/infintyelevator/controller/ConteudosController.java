package com.education.infintyelevator.controller;

import com.education.infintyelevator.model.Conteudos;

import java.util.ArrayList;
import java.util.List;

public abstract  class ConteudosController {

    List<Conteudos> listaConteudos;


    ConteudosController(){

        listaConteudos = new ArrayList<>();

    }

    public void criarConteudos() {}


}
