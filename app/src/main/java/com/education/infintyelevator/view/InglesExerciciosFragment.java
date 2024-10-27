package com.education.infintyelevator.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.education.infintyelevator.R;
import com.education.infintyelevator.controller.ExerciciosInglesController;
import com.education.infintyelevator.databinding.FragmentInglesExerciciosBinding;

public class InglesExerciciosFragment extends Fragment {

    FragmentInglesExerciciosBinding binding;
    ExerciciosInglesController exerciciosInglesController;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentInglesExerciciosBinding.inflate(getLayoutInflater(), container, false);
        exerciciosInglesController = new ExerciciosInglesController(binding);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(View v, Bundle savedInstanceState) {

        super.onViewCreated(v, savedInstanceState);
        exerciciosInglesController.criarExercicios();

    }

}