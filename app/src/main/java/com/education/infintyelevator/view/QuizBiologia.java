package com.education.infintyelevator.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.education.infintyelevator.R;
import com.education.infintyelevator.controller.QuizBiologiaController;
import com.education.infintyelevator.databinding.FragmentQuizBiologiaBinding;

public class QuizBiologia extends Fragment {

    FragmentQuizBiologiaBinding binding;
    QuizBiologiaController quizBiologiaController;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentQuizBiologiaBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View v, Bundle saveInstanceState) {

        super.onViewCreated(v, saveInstanceState);
        quizBiologiaController = new QuizBiologiaController(binding);
        quizBiologiaController.criarQuiz();

    }
}