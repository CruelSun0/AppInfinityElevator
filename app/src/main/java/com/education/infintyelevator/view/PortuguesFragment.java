package com.education.infintyelevator.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.education.infintyelevator.R;
import com.education.infintyelevator.controller.ConteudoPortuguesController;
import com.education.infintyelevator.databinding.FragmentPortuguesBinding;

public class PortuguesFragment extends Fragment {
    FragmentPortuguesBinding binding;
    ConteudoPortuguesController conteudoPortuguesController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPortuguesBinding.inflate(getLayoutInflater(), container, false);
        conteudoPortuguesController = new ConteudoPortuguesController(binding);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated (View v, Bundle saveIntanceState){

        super.onViewCreated(v, saveIntanceState);
        conteudoPortuguesController.criarConteudos();

    }
}