package com.education.infintyelevator.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.education.infintyelevator.R;
import com.education.infintyelevator.controller.ExerciciosQuimicaController;
import com.education.infintyelevator.databinding.FragmentQuimicaExerciciosBinding;


public class QuimicaExerciciosFragment extends Fragment {

   FragmentQuimicaExerciciosBinding binding;
   ExerciciosQuimicaController exerciciosQuimicaController;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentQuimicaExerciciosBinding.inflate(getLayoutInflater(), container, false);
        exerciciosQuimicaController = new ExerciciosQuimicaController(binding);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
        exerciciosQuimicaController.criarExercicios();


    }
}