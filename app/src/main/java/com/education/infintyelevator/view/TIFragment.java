package com.education.infintyelevator.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.education.infintyelevator.R;
import com.education.infintyelevator.controller.ConteudoInformaticaController;
import com.education.infintyelevator.databinding.FragmentTiBinding;

public class TIFragment extends Fragment {

    FragmentTiBinding binding;
    ConteudoInformaticaController conteudoInformaticaController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentTiBinding.inflate(getLayoutInflater(), container, false);
        conteudoInformaticaController = new ConteudoInformaticaController(binding);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View v, Bundle saveInstenceState) {

        super.onViewCreated(v, saveInstenceState);
        conteudoInformaticaController.criarConteudos();


    }
}