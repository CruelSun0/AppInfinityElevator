package com.education.infintyelevator.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.education.infintyelevator.R;
import com.education.infintyelevator.controller.ExerciciosPortuguesController;
import com.education.infintyelevator.databinding.FragmentPortuguesExerciciosBinding;

public class PortuguesExerciciosFragment extends Fragment {

    FragmentPortuguesExerciciosBinding binding;
    ExerciciosPortuguesController exerciciosPortuguesController;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPortuguesExerciciosBinding.inflate(getLayoutInflater(), container, false);
        exerciciosPortuguesController = new ExerciciosPortuguesController(binding);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        exerciciosPortuguesController.criarExercicios();
    }
}