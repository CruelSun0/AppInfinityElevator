package com.education.infintyelevator.controller;

import android.os.Handler;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.core.content.ContextCompat;
import com.education.infintyelevator.R;
import com.education.infintyelevator.databinding.FragmentQuizMatematicaBinding;
import com.education.infintyelevator.model.Quizes;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class QuizesMatematicasController extends QuizesController {

        private List<Quizes> quizesLista;
        private int alternativaCorreta;
        private int alternativaSelecionada;
        private int pontos;
        public  boolean errou;
        private FragmentQuizMatematicaBinding binding;

        public QuizesMatematicasController(FragmentQuizMatematicaBinding binding) {
            super();
            quizesLista = new ArrayList<Quizes>();
            this.binding = binding;
            quizesLista.add(new Quizes("Um carro percorre 120 km com 10 litros de gasolina. Quantos quilômetros ele percorrerá com 15 litros?", R.id.radioButtonBMatematica, "150 km", "180 km", "200 km", "220 km"));
            quizesLista.add(new Quizes("Um produto custa R$ 100,00 e recebeu um desconto de 20%. Qual o valor do produto após o desconto?", R.id.radioButtonAMatematica, "R$ 80,00", "R$ 75,00", "R$ 85,00", "R$ 90,00"));
            quizesLista.add(new Quizes("Qual o valor de f(2) na função f(x) = 3x - 1?", R.id.radioButtonBMatematica, "1", "5", "7", "4"));
            quizesLista.add(new Quizes("Um retângulo tem base medindo 8 cm e altura 5 cm. Qual sua área?", R.id.radioButtonCMatematica, "26 cm²", "40 cm²", "32 cm²", "20 cm²"));
            quizesLista.add(new Quizes("Em um conjunto de dados, a média é 7, a mediana é 6 e a moda é 5. Qual valor mais se repete nesse conjunto?", R.id.radioButtonCMatematica, "7", "6", "5", "Não é possível determinar"));
            quizesLista.add(new Quizes("Qual o valor de x na equação 2x + 5 = 11?", R.id.radioButtonBMatematica, "2", "3", "4", "5"));
            quizesLista.add(new Quizes("Em um triângulo retângulo, os catetos medem 3 cm e 4 cm. Qual o valor da hipotenusa?", R.id.radioButtonAMatematica, "5 cm", "6 cm", "7 cm", "8 cm"));
            quizesLista.add(new Quizes("Em um dado, qual a probabilidade de sair um número par?", R.id.radioButtonAMatematica, "1/2", "1/3", "1/4", "1/6"));
            quizesLista.add(new Quizes("Um trabalho é realizado por 5 pessoas em 8 dias. Se fossem 10 pessoas, em quantos dias o mesmo trabalho seria realizado?", R.id.radioButtonAMatematica, "4 dias", "5 dias", "6 dias", "7 dias"));
            quizesLista.add(new Quizes("Uma receita de bolo leva 3 ovos para 12 pessoas. Quantos ovos serão necessários para fazer o mesmo bolo para 20 pessoas?", R.id.radioButtonBMatematica, "4 ovos", "5 ovos", "6 ovos", "7 ovos"));
            quizesLista.add(new Quizes("Qual é a raiz quadrada de 144?", R.id.radioButtonAMatematica, "12", "14", "16", "10"));
            quizesLista.add(new Quizes("Quanto é 7 x 8?", R.id.radioButtonBMatematica, "52", "56", "48", "54"));
            quizesLista.add(new Quizes("Qual é o valor de pi?", R.id.radioButtonCMatematica, "3", "3.15", "3.14", "3.10"));
            quizesLista.add(new Quizes("Qual é a área de um círculo de raio 3?", R.id.radioButtonDMatematica, "9π", "6π", "12π", "3π"));
            quizesLista.add(new Quizes("Quanto é 2^5?", R.id.radioButtonAMatematica, "32", "64", "16", "25"));
            quizesLista.add(new Quizes("Qual é o resultado de 15 - 7?", R.id.radioButtonBMatematica, "9", "8", "7", "6"));
            quizesLista.add(new Quizes("Quantos graus tem um triângulo?", R.id.radioButtonCMatematica, "90°", "270°", "180°", "360°"));
            quizesLista.add(new Quizes("Qual é a fórmula da área do retângulo?", R.id.radioButtonDMatematica, "l + b", "l²", "2l + 2b", "l x b"));
            quizesLista.add(new Quizes("Quanto é 3 x 3 + 4?", R.id.radioButtonAMatematica, "13", "10", "15", "12"));
            quizesLista.add(new Quizes("Qual é a raiz cúbica de 27?", R.id.radioButtonBMatematica, "2", "3", "4", "5"));
            quizesLista.add(new Quizes("Qual é o valor de 0,5 x 2?", R.id.radioButtonCMatematica, "0,5", "1", "1,0", "1,5"));
            quizesLista.add(new Quizes("Qual é a fórmula do perímetro do círculo?", R.id.radioButtonDMatematica, "2π", "πr²", "r/π", "2πr"));
            quizesLista.add(new Quizes("Quanto é 100 dividido por 4?", R.id.radioButtonAMatematica, "25", "20", "30", "40"));
            quizesLista.add(new Quizes("Qual é o resultado de 6 + 9?", R.id.radioButtonBMatematica, "10", "15", "14", "16"));
            quizesLista.add(new Quizes("Quanto é 10% de 200?", R.id.radioButtonCMatematica, "5", "10", "20", "25"));
            quizesLista.add(new Quizes("Qual é a fórmula da área do triângulo?", R.id.radioButtonDMatematica, "b + h", "bh", "b/h", "b x h / 2"));
            quizesLista.add(new Quizes("Quanto é 2/3 + 1/3?", R.id.radioButtonAMatematica, "1", "1,5", "0,5", "2"));
            quizesLista.add(new Quizes("Qual é o dobro de 7?", R.id.radioButtonBMatematica, "10", "14", "12", "16"));
            quizesLista.add(new Quizes("Quanto é 9²?", R.id.radioButtonCMatematica, "18", "72", "81", "90"));
            quizesLista.add(new Quizes("Qual é a soma dos ângulos internos de um quadrilátero?", R.id.radioButtonDMatematica, "180°", "270°", "360°", "400°"));
            quizesLista.add(new Quizes("Qual é a fórmula do volume do cubo?", R.id.radioButtonAMatematica, "a³", "3a", "a²", "2a³"));
            quizesLista.add(new Quizes("Quanto é 5 x 0?", R.id.radioButtonBMatematica, "5", "0", "1", "10"));
            quizesLista.add(new Quizes("Qual é o oposto de -10?", R.id.radioButtonCMatematica, "0", "-5", "10", "-10"));
            quizesLista.add(new Quizes("Quanto é 25% de 80?", R.id.radioButtonDMatematica, "10", "15", "20", "25"));
            quizesLista.add(new Quizes("Quanto é a metade de 50?", R.id.radioButtonAMatematica, "25", "20", "30", "15"));
            quizesLista.add(new Quizes("Qual é a fórmula da hipotenusa?", R.id.radioButtonBMatematica, "a² + b", "a² + b² = c²", "a + b = c", "a² - b² = c²"));
            quizesLista.add(new Quizes("Quanto é 4 elevado a 2?", R.id.radioButtonCMatematica, "8", "10", "16", "18"));
            quizesLista.add(new Quizes("Qual é o valor de 1 + 1 x 0?", R.id.radioButtonDMatematica, "0", "1", "2", "1"));
            quizesLista.add(new Quizes("Quanto é 3³?", R.id.radioButtonAMatematica, "27", "9", "18", "36"));
            quizesLista.add(new Quizes("Qual é a média de 2, 4 e 6?", R.id.radioButtonBMatematica, "2", "4", "5", "6"));
            quizesLista.add(new Quizes("Qual é o maior número primo menor que 10?", R.id.radioButtonCMatematica, "4", "6", "7", "9"));
            quizesLista.add(new Quizes("Quanto é 1000 - 250?", R.id.radioButtonDMatematica, "650", "800", "850", "750"));
            quizesLista.add(new Quizes("Qual é a fórmula para a área do quadrado?", R.id.radioButtonAMatematica, "l²", "l + l", "2l", "4l"));
            quizesLista.add(new Quizes("Quanto é 1/4 de 100?", R.id.radioButtonBMatematica, "20", "25", "30", "15"));
            quizesLista.add(new Quizes("Qual é o número de lados de um hexágono?", R.id.radioButtonCMatematica, "4", "5", "6", "8"));
            quizesLista.add(new Quizes("Quanto é 2 + 2 x 2?", R.id.radioButtonDMatematica, "4", "6", "8", "6"));
            quizesLista.add(new Quizes("Qual é o valor de x na equação 2x = 8?", R.id.radioButtonAMatematica, "4", "6", "2", "8"));
            quizesLista.add(new Quizes("Quanto é 90 dividido por 3?", R.id.radioButtonBMatematica, "20", "30", "25", "35"));
            quizesLista.add(new Quizes("Qual é a raiz quadrada de 81?", R.id.radioButtonCMatematica, "6", "7", "9", "8"));
            quizesLista.add(new Quizes("Quanto é 0,1 + 0,2?", R.id.radioButtonDMatematica, "0,5", "0,3", "0,15", "0,3"));

        }


        public void criarQuestao() {

            binding.radioGQuizMatematica.clearCheck();
            binding.textEnunciadoMatematica.setText(quizesLista.get(0).getEnunciado());
            binding.radioButtonAMatematica.setText(quizesLista.get(0).getListaQuestoes().get(0));
            binding.radioButtonBMatematica.setText(quizesLista.get(0).getListaQuestoes().get(1));
            binding.radioButtonCMatematica.setText(quizesLista.get(0).getListaQuestoes().get(2));
            binding.radioButtonDMatematica.setText(quizesLista.get(0).getListaQuestoes().get(3));
            alternativaCorreta = quizesLista.get(0).getAlternativaCorreta();

        }

        public void criarQuiz() {

            criarQuestao();

            binding.radioGQuizMatematica.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int i) {
                    alternativaSelecionada = binding.radioGQuizMatematica.getCheckedRadioButtonId();
                    RadioButton botaoSelecionado = binding.getRoot().findViewById(alternativaSelecionada);
                    if (alternativaSelecionada == alternativaCorreta && !quizesLista.isEmpty()) {
                        pontos += 1;
                        botaoSelecionado.setBackgroundColor(ContextCompat.getColor(botaoSelecionado.getContext(), R.color.verde));
                        new Handler().postDelayed(new Runnable() {

                            @Override
                            public void run(){
                                botaoSelecionado.setBackgroundColor(0);
                                binding.textPontosMatematica.setText(MessageFormat.format("Pontos: {0}", pontos));
                                quizesLista.remove(0);
                                criarQuestao();

                            }

                        }, 1000);


                    } else {

                        botaoSelecionado.setBackgroundColor(ContextCompat.getColor(botaoSelecionado.getContext(), R.color.red));

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                botaoSelecionado.setBackgroundColor(0);
                                binding.radioGQuizMatematica.clearCheck();
                            }
                        }, 1000);

                    }

                }
            });
        }
    }
