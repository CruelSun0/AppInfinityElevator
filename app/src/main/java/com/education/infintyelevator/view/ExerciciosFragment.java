package com.education.infintyelevator.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.education.infintyelevator.R;
import com.education.infintyelevator.databinding.FragmentExerciciosBinding;

public class ExerciciosFragment extends Fragment {

    FragmentExerciciosBinding binding;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentExerciciosBinding.inflate(getLayoutInflater(), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View v, Bundle saveInstenceState) {

        super.onViewCreated(v, saveInstenceState);

        binding.imgPortuguesExer.setOnClickListener(c ->{

            Navigation.findNavController(requireActivity(), R.id.fragmentContainerView).navigate(R.id.paraPortuguesExercicios);

        });

        binding.imagMatematicaExer.setOnClickListener(c ->{

            Navigation.findNavController(requireActivity(), R.id.fragmentContainerView).navigate(R.id.paraMatematicaExercicios);

        });

        binding.imgBiologiaExer.setOnClickListener(c -> {

            Navigation.findNavController(requireActivity(), R.id.fragmentContainerView).navigate(R.id.paraBiologiaExercicios);

        });

        binding.imgQuimicaExer.setOnClickListener(c -> {

            Navigation.findNavController(requireActivity(), R.id.fragmentContainerView).navigate(R.id.paraQuimicaExercicios);

        });

        binding.imgInglesExer.setOnClickListener(c -> {

            Navigation.findNavController(requireActivity(), R.id.fragmentContainerView).navigate(R.id.paraInglesExercicios);

        });

        binding.imgInformaticaExer.setOnClickListener(c -> {

            Navigation.findNavController(requireActivity(), R.id.fragmentContainerView).navigate(R.id.paraInformaticaExercicios);

        });

    }
}