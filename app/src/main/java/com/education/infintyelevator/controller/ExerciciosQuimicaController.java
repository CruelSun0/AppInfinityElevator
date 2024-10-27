package com.education.infintyelevator.controller;

import android.view.animation.AlphaAnimation;
import android.view.animation.BounceInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.Toast;

import com.education.infintyelevator.databinding.FragmentPortuguesExerciciosBinding;
import com.education.infintyelevator.databinding.FragmentQuimicaExerciciosBinding;
import com.education.infintyelevator.model.Exercicios;

import java.util.ArrayList;
import java.util.List;

public class ExerciciosQuimicaController extends ExerciciosController{


    private FragmentQuimicaExerciciosBinding binding;
    private List<Exercicios> listaExercicios;
    private int indice;
    AlphaAnimation fade_in;
    ScaleAnimation diminuir;
    BounceInterpolator bounceInterpolator;

    public ExerciciosQuimicaController(FragmentQuimicaExerciciosBinding binding){
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
        listaExercicios.add(new Exercicios("1. Explique a importância da tabela periódica na organização dos elementos químicos.", "1.R=A tabela periódica organiza os elementos químicos de acordo com suas propriedades e características, facilitando a compreensão de suas relações e comportamentos. É essencial para o estudo da química, pois agrupa elementos com propriedades similares e ajuda a prever reações químicas."));
        listaExercicios.add(new Exercicios("2. Como ocorrem as ligações iônicas entre átomos? Dê um exemplo.", "2.R=As ligações iônicas ocorrem pela transferência de elétrons de um átomo para outro, resultando na formação de íons positivos (cátions) e negativos (ânions), que se atraem por forças eletrostáticas. Exemplo: NaCl (cloreto de sódio), onde o sódio doa um elétron para o cloro."));
        listaExercicios.add(new Exercicios("3. Descreva a estrutura molecular da água e suas propriedades.", "3.R=A molécula de água (H2O) é formada por dois átomos de hidrogênio ligados a um átomo de oxigênio por ligações covalentes. Devido à diferença de eletronegatividade entre oxigênio e hidrogênio, a água possui uma estrutura angular e é uma molécula polar. Suas propriedades incluem alta tensão superficial, ponto de ebulição elevado e capacidade de dissolver substâncias polares."));
        listaExercicios.add(new Exercicios("4. Quais são as principais propriedades dos compostos orgânicos?", "4.R=Os compostos orgânicos possuem propriedades como combustibilidade, solubilidade variada em água, presença de carbono em suas estruturas, e formação de longas cadeias de átomos. Exemplos incluem hidrocarbonetos, alcoóis e ácidos carboxílicos."));
        listaExercicios.add(new Exercicios("5. Cite e explique dois métodos de separação de misturas.", "5.R=Filtração: usada para separar sólidos de líquidos, como na separação de areia e água. Destilação: separa líquidos com diferentes pontos de ebulição, como na separação de etanol e água."));
        listaExercicios.add(new Exercicios("6. Como balancear a seguinte equação química: H2 + O2 -> H2O?", "6.R=Para balancear a equação, ajusta-se o número de átomos de cada elemento em ambos os lados da reação. A equação balanceada é: 2H2 + O2 -> 2H2O."));
        listaExercicios.add(new Exercicios("7. Explique a diferença entre ácidos e bases em termos de suas propriedades químicas.", "7.R=Ácidos liberam íons H+ em solução aquosa e têm sabor azedo, enquanto bases liberam íons OH- e têm sabor amargo. Os ácidos reagem com metais e bases, enquanto as bases reagem com ácidos e podem ser escorregadias ao toque."));
        listaExercicios.add(new Exercicios("8. O que são forças intermoleculares? Cite dois tipos.", "8.R=Forças intermoleculares são interações que ocorrem entre moléculas, afetando suas propriedades físicas. Dois tipos são: Ligações de hidrogênio, que ocorrem entre moléculas com átomos de hidrogênio ligados a átomos eletronegativos como oxigênio, nitrogênio ou flúor; e forças de Van der Waals, que são interações fracas entre moléculas apolares."));
        listaExercicios.add(new Exercicios("9. Descreva a geometria molecular do metano (CH4).", "9.R=O metano (CH4) possui uma geometria tetraédrica, com o átomo de carbono no centro e os quatro átomos de hidrogênio nos vértices do tetraedro, formando ângulos de 109,5°."));
        listaExercicios.add(new Exercicios("10. Como calcular a quantidade de reagentes e produtos em uma reação química usando a estequiometria?", "10.R=Para calcular a quantidade de reagentes e produtos, primeiro balanceia-se a equação química. Depois, usa-se a relação molar entre os reagentes e produtos para determinar as quantidades desejadas. Exemplo: Na reação 2H2 + O2 -> 2H2O, 4 mols de H2 reagem com 2 mols de O2 para formar 4 mols de H2O."));
        listaExercicios.add(new Exercicios("11. Explique a importância da tabela periódica na organização dos elementos químicos.", "11.R=A tabela periódica organiza os elementos químicos de acordo com suas propriedades e características, facilitando a compreensão de suas relações e comportamentos. É essencial para o estudo da química, pois agrupa elementos com propriedades similares e ajuda a prever reações químicas."));
        listaExercicios.add(new Exercicios("12. Como ocorrem as ligações iônicas entre átomos? Dê um exemplo.", "12.R=As ligações iônicas ocorrem pela transferência de elétrons de um átomo para outro, resultando na formação de íons positivos (cátions) e negativos (ânions), que se atraem por forças eletrostáticas. Exemplo: NaCl (cloreto de sódio), onde o sódio doa um elétron para o cloro."));
        listaExercicios.add(new Exercicios("13. Descreva a estrutura molecular da água e suas propriedades.", "13.R=A molécula de água (H2O) é formada por dois átomos de hidrogênio ligados a um átomo de oxigênio por ligações covalentes. Devido à diferença de eletronegatividade entre oxigênio e hidrogênio, a água possui uma estrutura angular e é uma molécula polar. Suas propriedades incluem alta tensão superficial, ponto de ebulição elevado e capacidade de dissolver substâncias polares."));
        listaExercicios.add(new Exercicios("14. Quais são as principais propriedades dos compostos orgânicos?", "14.R=Os compostos orgânicos possuem propriedades como combustibilidade, solubilidade variada em água, presença de carbono em suas estruturas, e formação de longas cadeias de átomos. Exemplos incluem hidrocarbonetos, alcoóis e ácidos carboxílicos."));
        listaExercicios.add(new Exercicios("15. Cite e explique dois métodos de separação de misturas.", "15.R=Filtração: usada para separar sólidos de líquidos, como na separação de areia e água. Destilação: separa líquidos com diferentes pontos de ebulição, como na separação de etanol e água."));
        listaExercicios.add(new Exercicios("16. Como balancear a seguinte equação química: H2 + O2 -> H2O?", "16.R=Para balancear a equação, ajusta-se o número de átomos de cada elemento em ambos os lados da reação. A equação balanceada é: 2H2 + O2 -> 2H2O."));
        listaExercicios.add(new Exercicios("17. Explique a diferença entre ácidos e bases em termos de suas propriedades químicas.", "17.R=Ácidos liberam íons H+ em solução aquosa e têm sabor azedo, enquanto bases liberam íons OH- e têm sabor amargo. Os ácidos reagem com metais e bases, enquanto as bases reagem com ácidos e podem ser escorregadias ao toque."));
        listaExercicios.add(new Exercicios("18. Como a organização da Tabela Periódica facilita o estudo dos elementos químicos?", "18.R=A Tabela Periódica organiza os elementos químicos em ordem crescente de número atômico, agrupando-os em períodos e grupos que compartilham propriedades similares. Isso facilita a previsão do comportamento dos elementos e a compreensão das tendências periódicas, como eletronegatividade, raio atômico e energia de ionização."));
        listaExercicios.add(new Exercicios("19. Quais são as principais características das ligações iônicas?", "19.R=Ligações iônicas são formadas pela transferência completa de elétrons de um átomo para outro, resultando na formação de íons positivos (cátions) e negativos (ânions). Elas são caracterizadas por fortes forças eletrostáticas entre os íons, altos pontos de fusão e ebulição, e boa condutividade elétrica em solução aquosa."));
        listaExercicios.add(new Exercicios("20. Explique a diferença entre uma molécula polar e uma molécula apolar.", "20.R=Uma molécula polar possui uma distribuição desigual de cargas elétricas devido a diferenças de eletronegatividade entre os átomos, resultando em um dipolo elétrico. Exemplo: H2O. Uma molécula apolar tem uma distribuição uniforme de cargas elétricas ou átomos com eletronegatividades similares, não formando dipolos elétricos. Exemplo: CH4."));
    }

    private void verificarValores(){

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
