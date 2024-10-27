package com.education.infintyelevator.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.education.infintyelevator.R;
import com.education.infintyelevator.controller.ExerciciosBiologiaController;
import com.education.infintyelevator.databinding.FragmentBiologiaExerciciosBinding;

public class BiologiaExerciciosFragment extends Fragment {

    FragmentBiologiaExerciciosBinding binding;
    ExerciciosBiologiaController exerciciosBiologiaController;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBiologiaExerciciosBinding.inflate(inflater, container, false);
        exerciciosBiologiaController = new ExerciciosBiologiaController(binding);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View v, Bundle savedInstanceState) {

        super.onViewCreated(v, savedInstanceState);
        exerciciosBiologiaController.criarExercicios();

    }

}
