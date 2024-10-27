package com.education.infintyelevator.model;

import androidx.annotation.NonNull;

public class Conteudos {

    private String titulo;
    private String texto;

    public Conteudos(String titulo, String texto) {

        this.titulo = titulo;
        this.texto = texto;


    }

    public String getTitulo(){return titulo;}
    public String getTexto(){return texto;}

    @NonNull
    @Override
    public String toString() {return this.titulo;}
}