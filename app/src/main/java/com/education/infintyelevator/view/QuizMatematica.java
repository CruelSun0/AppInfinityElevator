package com.education.infintyelevator.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.education.infintyelevator.R;
import com.education.infintyelevator.controller.QuizesMatematicasController;
import com.education.infintyelevator.databinding.FragmentQuizMatematicaBinding;


public class QuizMatematica extends Fragment {

    QuizesMatematicasController quizMatematicaController;
    FragmentQuizMatematicaBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentQuizMatematicaBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(View v, Bundle saveInstanceState) {

        super.onViewCreated(v, saveInstanceState);
        quizMatematicaController = new QuizesMatematicasController(binding);
        quizMatematicaController.criarQuiz();

    }

}