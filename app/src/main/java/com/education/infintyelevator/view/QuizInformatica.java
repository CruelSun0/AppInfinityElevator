package com.education.infintyelevator.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.education.infintyelevator.R;
import com.education.infintyelevator.controller.QuizInformaticaController;
import com.education.infintyelevator.databinding.FragmentQuizInformaticaBinding;

public class QuizInformatica extends Fragment {

    FragmentQuizInformaticaBinding binding;
    QuizInformaticaController quizInformaticaController;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentQuizInformaticaBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(View v, Bundle saveInstanceState) {

        super.onViewCreated(v, saveInstanceState);
        quizInformaticaController = new QuizInformaticaController(binding);
        quizInformaticaController.criarQuiz();

    }

}