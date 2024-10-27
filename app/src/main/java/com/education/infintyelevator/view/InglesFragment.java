package com.education.infintyelevator.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.education.infintyelevator.R;
import com.education.infintyelevator.controller.ConteudoInglesController;
import com.education.infintyelevator.databinding.FragmentInglesBinding;

public class InglesFragment extends Fragment {

    FragmentInglesBinding binding;
    ConteudoInglesController conteudoInglesController;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentInglesBinding.inflate(getLayoutInflater(), container, false);
        conteudoInglesController = new ConteudoInglesController(binding);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View v, Bundle saveInstenceState) {

        super.onViewCreated(v, saveInstenceState);
        conteudoInglesController.criarConteudos();

    }
}