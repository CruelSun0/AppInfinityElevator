package com.education.infintyelevator.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.education.infintyelevator.R;
import com.education.infintyelevator.controller.ConteudoQuimicaController;
import com.education.infintyelevator.databinding.FragmentQuimicaBinding;

public class QuimicaFragment extends Fragment {

    FragmentQuimicaBinding binding;
    ConteudoQuimicaController conteudoQuimicaController;

 @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentQuimicaBinding.inflate(getLayoutInflater(), container, false);
        conteudoQuimicaController = new ConteudoQuimicaController(binding);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View v, Bundle savedInstanceState) {

     super.onViewCreated(v, savedInstanceState);
     conteudoQuimicaController.criarConteudos();

    }
}