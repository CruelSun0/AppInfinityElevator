package com.education.infintyelevator.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.education.infintyelevator.R;
import com.education.infintyelevator.databinding.FragmentQuizBinding;


public class QuizFragment extends Fragment {

    FragmentQuizBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentQuizBinding.inflate(inflater, container, false);
        // Inflate the layout for this fragment
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(View v, Bundle saveIntanceState) {

        super.onViewCreated(v, saveIntanceState);

        binding.imgPortugues.setOnClickListener(c -> {

            Navigation.findNavController(requireActivity(), R.id.fragmentContainerViewQuiz).navigate(R.id.ParaQuizPortugues);

        });

        binding.imgMatematica.setOnClickListener(c -> {

            Navigation.findNavController(requireActivity(), R.id.fragmentContainerViewQuiz).navigate(R.id.ParaQuizMatematica);

        });

        binding.imgQuimica.setOnClickListener(c -> {

            Navigation.findNavController(requireActivity(), R.id.fragmentContainerViewQuiz).navigate(R.id.ParaQuizQuimica);

        });

        binding.imgIngles.setOnClickListener(c -> {

            Navigation.findNavController(requireActivity(), R.id.fragmentContainerViewQuiz).navigate(R.id.ParaQuizIngles);

        });

        binding.imgInformatica.setOnClickListener(c -> {

            Navigation.findNavController(requireActivity(), R.id.fragmentContainerViewQuiz).navigate(R.id.ParaQuizInformatica);

        });

        binding.imgBiologia.setOnClickListener(c -> {

            Navigation.findNavController(requireActivity(), R.id.fragmentContainerViewQuiz).navigate(R.id.ParaQuizBiologia);

        });


    }
}