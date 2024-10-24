package com.education.infintyelevator.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.education.infintyelevator.R;
import com.education.infintyelevator.controller.QuizQuimicaController;
import com.education.infintyelevator.databinding.FragmentQuizQuimicaBinding;

public class QuizQuimica extends Fragment {

    FragmentQuizQuimicaBinding binding;
    QuizQuimicaController quizQuimicaController;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentQuizQuimicaBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View v, Bundle saveIntanceState) {

        super.onViewCreated(v, saveIntanceState);
        quizQuimicaController = new QuizQuimicaController(binding);
        quizQuimicaController.criarQuiz();

    }
}