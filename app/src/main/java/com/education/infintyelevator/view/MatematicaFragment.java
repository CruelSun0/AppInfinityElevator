package com.education.infintyelevator.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.education.infintyelevator.R;
import com.education.infintyelevator.controller.ConteudoMatematicaController;
import com.education.infintyelevator.databinding.FragmentMatematicaBinding;

public class MatematicaFragment extends Fragment {

    FragmentMatematicaBinding binding;
    ConteudoMatematicaController conteudoMatematicaController;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMatematicaBinding.inflate(getLayoutInflater(), container, false);
        conteudoMatematicaController = new ConteudoMatematicaController(binding);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View v, Bundle saveInstenceState) {

        super.onViewCreated(v, saveInstenceState);
        conteudoMatematicaController.criarConteudos();
    }
}