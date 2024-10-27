package com.education.infintyelevator.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.education.infintyelevator.R;
import com.education.infintyelevator.controller.ExerciciosInformaticaController;
import com.education.infintyelevator.databinding.FragmentInformaticaExerciciosBinding;

public class InformaticaExerciciosFragment extends Fragment {

    FragmentInformaticaExerciciosBinding binding;
    ExerciciosInformaticaController exerciciosInformaticaController;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentInformaticaExerciciosBinding.inflate(getLayoutInflater(), container, false);
        exerciciosInformaticaController = new ExerciciosInformaticaController(binding);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View v, Bundle savedInstanceState) {

        super.onViewCreated(v, savedInstanceState);
        exerciciosInformaticaController.criarExercicios();

    }

}