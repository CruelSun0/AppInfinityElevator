package com.education.infintyelevator.controller;

import com.education.infintyelevator.model.Quizes;

import java.util.ArrayList;
import java.util.List;

public abstract class QuizesController {

    protected List<Quizes> quizesLista;
    protected int alternativaCorreta;
    protected int alternativaSelecionada;
    protected int pontos;
    public boolean errou;

    protected QuizesController() {

        quizesLista = new ArrayList<>();

    }

    protected void criarQuestao(){};
    protected void criarQuiz(){}

}
