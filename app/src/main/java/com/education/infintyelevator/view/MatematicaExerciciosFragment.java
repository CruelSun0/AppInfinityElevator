package com.education.infintyelevator.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.education.infintyelevator.R;
import com.education.infintyelevator.controller.ExerciciosMatematicaController;
import com.education.infintyelevator.databinding.FragmentMatematicaExerciciosBinding;

import java.util.function.ObjIntConsumer;

public class MatematicaExerciciosFragment extends Fragment {

    FragmentMatematicaExerciciosBinding binding;
    ExerciciosMatematicaController exerciciosMatematicaController;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMatematicaExerciciosBinding.inflate(getLayoutInflater(), container, false);
        exerciciosMatematicaController = new ExerciciosMatematicaController(binding);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View v, Bundle savedInstanceState) {

        super.onViewCreated(v, savedInstanceState);
        exerciciosMatematicaController.criarExercicios();

    }

}