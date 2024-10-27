package com.education.infintyelevator.model;

public class Exercicios {

    private String pergunta;
    private String resposta;

    public Exercicios (String pergunta, String resposta) {

        this.pergunta = pergunta;
        this.resposta = resposta;

    }

    public String getPergunta(){return this.pergunta;}
    public String getResposta(){return this.resposta;}

}
