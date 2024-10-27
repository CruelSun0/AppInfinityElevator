package com.education.infintyelevator.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.education.infintyelevator.R;
import com.education.infintyelevator.controller.QuizPortuguesController;
import com.education.infintyelevator.controller.QuizesController;
import com.education.infintyelevator.databinding.FragmentQuizPortuguesBinding;


public class QuizPortugues extends Fragment {

    FragmentQuizPortuguesBinding binding;
    QuizPortuguesController quizesController;
    NavController navController;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentQuizPortuguesBinding.inflate(getLayoutInflater(), container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(View v, Bundle savedInstanceState) {

        super.onViewCreated(v, savedInstanceState);
        navController = Navigation.findNavController(v);
        quizesController = new QuizPortuguesController(binding);
        quizesController.criarQuiz();


    }

}
