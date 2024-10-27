package com.education.infintyelevator.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.education.infintyelevator.controller.ConteudoBiologiaController;
import com.education.infintyelevator.databinding.FragmentBiologiaBinding;

public class BiologiaFragment extends Fragment {

    FragmentBiologiaBinding binding;
    ConteudoBiologiaController conteudoBiologiaController;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBiologiaBinding.inflate(getLayoutInflater(), container, false);
        conteudoBiologiaController = new ConteudoBiologiaController(binding);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View v, Bundle saveInstenceState) {

        super.onViewCreated(v, saveInstenceState);
        conteudoBiologiaController.criarConteudos();;

    }
}