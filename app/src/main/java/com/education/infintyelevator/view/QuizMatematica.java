package com.education.infintyelevator.view;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

import com.education.infintyelevator.controller.QuizesMatematicasController;
import com.education.infintyelevator.databinding.FragmentQuizMatematicaBinding;


public class QuizMatematica extends Fragment {

    FragmentQuizMatematicaBinding binding;
    QuizesMatematicasController quizMatematicaController;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentQuizMatematicaBinding.inflate(inflater, container, false);
        quizMatematicaController = new QuizesMatematicasController(binding);
        return binding.getRoot();
    }


    public void onViewCreated(View v, Bundle saveInstanceState) {

        super.onViewCreated(v, saveInstanceState);
        quizMatematicaController.criarQuiz();

     }


}