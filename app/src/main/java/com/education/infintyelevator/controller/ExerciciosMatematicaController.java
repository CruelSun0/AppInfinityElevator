package com.education.infintyelevator.controller;

import android.view.animation.AlphaAnimation;
import android.view.animation.BounceInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.Toast;

import com.education.infintyelevator.databinding.FragmentInglesExerciciosBinding;
import com.education.infintyelevator.databinding.FragmentMatematicaExerciciosBinding;
import com.education.infintyelevator.model.Exercicios;

import java.util.ArrayList;
import java.util.List;

public class ExerciciosMatematicaController extends ExerciciosController {

    private FragmentMatematicaExerciciosBinding binding;
    private List<Exercicios> listaExercicios;
    private int indice;
    AlphaAnimation fade_in;
    ScaleAnimation diminuir;
    BounceInterpolator bounceInterpolator;

    public ExerciciosMatematicaController(FragmentMatematicaExerciciosBinding binding) {
        super();
        this.binding = binding;
        indice = 0;
        fade_in = new AlphaAnimation(0.0f, 1.0f);
        diminuir = new ScaleAnimation(2.0f, 1.0f, 2.0f, 1.0f);
        bounceInterpolator = new BounceInterpolator();
        diminuir.setDuration(800);
        diminuir.setInterpolator(bounceInterpolator);
        fade_in.setDuration(2000);
        listaExercicios = new ArrayList<>();
        listaExercicios.add(new Exercicios("1. Resolva 7 + 5 e explique o processo de adição.", "1.R=7 + 5 = 12. Na adição, somamos os valores dos números. Aqui, somamos 7 e 5 para obter 12."));
        listaExercicios.add(new Exercicios("2. Uma loja vende 3 camisetas por R$ 90,00. Quanto custam 7 camisetas? Use regra de três.", "2.R=Se 3 camisetas custam R$ 90,00, cada camiseta custa R$ 30,00 (90/3). Portanto, 7 camisetas custam R$ 210,00 (7 x 30)."));
        listaExercicios.add(new Exercicios("3. Resolva a equação de 1º grau: 3x - 7 = 11.", "3.R=3x - 7 = 11. Adicionamos 7 em ambos os lados: 3x = 18. Dividimos ambos os lados por 3: x = 6."));
        listaExercicios.add(new Exercicios("4. Simplifique a fração 16/24.", "4.R=Para simplificar 16/24, dividimos o numerador e o denominador pelo maior divisor comum, que é 8. Assim, 16/8 = 2 e 24/8 = 3, resultando em 2/3."));
        listaExercicios.add(new Exercicios("5. Qual é a probabilidade de tirar uma bola vermelha de um saco com 3 bolas vermelhas e 7 bolas azuis?", "5.R=Há 3 bolas vermelhas e 7 azuis, totalizando 10 bolas. A probabilidade de tirar uma bola vermelha é 3/10 ou 30%."));
        listaExercicios.add(new Exercicios("6. Calcule a área de um triângulo com base de 5 cm e altura de 8 cm.", "6.R=Área do triângulo = (base x altura) / 2. Portanto, (5 x 8) / 2 = 40 / 2 = 20 cm²."));
        listaExercicios.add(new Exercicios("7. Use a trigonometria no triângulo retângulo para encontrar o valor do seno de um ângulo de 30°.", "7.R=O seno de 30° é a razão entre o comprimento do cateto oposto e a hipotenusa. Para 30°, seno = 1/2."));
        listaExercicios.add(new Exercicios("8. Qual é a probabilidade de obter um número par ao lançar um dado?", "8.R=Um dado tem 6 faces numeradas de 1 a 6. Números pares: 2, 4, 6. A probabilidade de obter um número par é 3/6 ou 1/2."));
        listaExercicios.add(new Exercicios("9. Resolva a equação de 2º grau: x² - 5x + 6 = 0.", "9.R=Para resolver x² - 5x + 6 = 0, fatoramos a equação: (x - 2)(x - 3) = 0. Assim, as soluções são x = 2 e x = 3."));
        listaExercicios.add(new Exercicios("10. Um produto custa R$ 200,00 e está com desconto de 15%. Qual o novo preço?", "10.R=O desconto é de 15% de R$ 200,00, que é R$ 30,00. Portanto, o novo preço é R$ 200,00 - R$ 30,00 = R$ 170,00."));
        listaExercicios.add(new Exercicios("11. Subtraia 256 de 1024.", "11.R=1024 - 256 = 768. A subtração é feita removendo o valor de um número do outro."));
        listaExercicios.add(new Exercicios("12. Resolva a regra de três: Se 5 maçãs custam R$ 10,00, quanto custam 8 maçãs?", "12.R=Se 5 maçãs custam R$ 10,00, cada maçã custa R$ 2,00 (10/5). Portanto, 8 maçãs custam R$ 16,00 (8 x 2)."));
        listaExercicios.add(new Exercicios("13. Encontre o valor de x na equação 2x + 5 = 17.", "13.R=2x + 5 = 17. Subtraímos 5 de ambos os lados: 2x = 12. Dividimos ambos os lados por 2: x = 6."));
        listaExercicios.add(new Exercicios("14. Qual é a fração equivalente a 3/4 que tenha denominador 12?", "14.R=Multiplicamos o numerador e o denominador de 3/4 por 3 para obter 9/12."));
        listaExercicios.add(new Exercicios("15. Qual é a probabilidade de escolher uma carta de copas em um baralho de 52 cartas?", "15.R=Um baralho tem 52 cartas e 13 são de copas. A probabilidade de escolher uma carta de copas é 13/52 ou 1/4."));
        listaExercicios.add(new Exercicios("16. Qual é a área de um círculo com raio de 7 cm?", "16.R=Área do círculo = πr². Portanto, π x 7² = 49π cm²."));
        listaExercicios.add(new Exercicios("17. Use a trigonometria para encontrar o valor do cosseno de um ângulo de 45°.", "17.R=O cosseno de 45° é a razão entre o comprimento do cateto adjacente e a hipotenusa. Para 45°, cosseno = √2/2."));
        listaExercicios.add(new Exercicios("18. Um restaurante oferece 3 opções de entrada, 4 de prato principal e 2 de sobremesa. Quantas combinações de refeições podem ser feitas?", "18.R=Multiplicamos o número de opções: 3 x 4 x 2 = 24 combinações."));
        listaExercicios.add(new Exercicios("19. Resolva a equação de 2º grau: x² + 4x - 12 = 0.", "19.R=Para resolver x² + 4x - 12 = 0, fatoramos a equação: (x + 6)(x - 2) = 0. Assim, as soluções são x = -6 e x = 2."));
        listaExercicios.add(new Exercicios("20. Se um produto de R$ 150,00 recebe um aumento de 20%, qual será seu novo preço?", "20.R=O aumento é de 20% de R$ 150,00, que é R$ 30,00. Portanto, o novo preço é R$ 150,00 + R$ 30,00 = R$ 180,00."));
    }

    private void verificarValores() {

        if (indice > listaExercicios.size() - 1) {

            indice = listaExercicios.size() - 1;
            Toast.makeText(binding.getRoot().getContext(), "Você está na última pergunta!", Toast.LENGTH_LONG).show();

        }

        if (indice < 0) {

            indice = 0;
            Toast.makeText(binding.getRoot().getContext(), "Não Há pergunta anterior!", Toast.LENGTH_LONG);

        }

    }

    public void criarExercicios() {

        binding.textPerguntaExPort.setText(listaExercicios.get(indice).getPergunta());
        binding.btnVerRespostasP.setOnClickListener(c -> {

            binding.textRespostaExPort.startAnimation(diminuir);
            binding.textRespostaExPort.setText(listaExercicios.get(indice).getResposta());


        });

        binding.btnRespostaAnteriorP.setOnClickListener(c -> {

            indice -= 1;
            verificarValores();
            binding.textPerguntaExPort.startAnimation(fade_in);
            binding.textPerguntaExPort.setText(listaExercicios.get(indice).getPergunta());

            binding.textRespostaExPort.setText("");


        });

        binding.btnRespostaSeguinteP.setOnClickListener(c -> {

            indice += 1;
            verificarValores();
            binding.textPerguntaExPort.startAnimation(fade_in);
            binding.textPerguntaExPort.setText(listaExercicios.get(indice).getPergunta());
            binding.textRespostaExPort.setText("");

        });
    }

}
