package com.education.infintyelevator.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.education.infintyelevator.controller.QuizInglesController;
import com.education.infintyelevator.databinding.FragmentQuizInglesBinding;

public class QuizIngles extends Fragment {

    FragmentQuizInglesBinding binding;
    QuizInglesController quizInglesController;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentQuizInglesBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View v, Bundle saveInstanceState) {

        super.onViewCreated(v, saveInstanceState);
        quizInglesController = new QuizInglesController(binding);
        quizInglesController.criarQuiz();

    }
}