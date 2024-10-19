package com.education.infintyelevator.view;

import com.education.infintyelevator.databinding.FragmentInicioBinding;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.education.infintyelevator.R;

public class InicioFragment extends Fragment {

    FragmentInicioBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentInicioBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedIntanceState) {

            super.onViewCreated(view, savedIntanceState);
            binding.btnPortugues.setOnClickListener(v -> {
                Navigation.findNavController(requireActivity(), R.id.fragmentContainerView).navigate(R.id.ParaPortuguesFragment);
            });


    }
}