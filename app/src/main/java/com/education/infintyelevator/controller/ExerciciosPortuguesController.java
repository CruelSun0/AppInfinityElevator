package com.education.infintyelevator.controller;

import android.content.Context;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.BounceInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import android.widget.Toast;

import com.education.infintyelevator.databinding.FragmentPortuguesExerciciosBinding;
import com.education.infintyelevator.model.Exercicios;

import java.util.ArrayList;
import java.util.List;


public class ExerciciosPortuguesController extends  ExerciciosController{

    private  FragmentPortuguesExerciciosBinding binding;
    private List<Exercicios> listaExercicios;
    private int indice;
    AlphaAnimation fade_in;
    ScaleAnimation diminuir;
    BounceInterpolator bounceInterpolator;

    public ExerciciosPortuguesController(FragmentPortuguesExerciciosBinding binding){
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
        listaExercicios.add(new Exercicios("1. Explique a importância das classes gramaticais na formação de frases coerentes.", "1.R=As classes gramaticais são fundamentais para a formação de frases coerentes, pois cada classe desempenha uma função específica na estrutura da frase, como substantivos para nomear, verbos para indicar ações, e adjetivos para qualificar, permitindo a construção de enunciados claros e organizados."));
        listaExercicios.add(new Exercicios("2. Quais são os principais tipos de figuras de linguagem e qual o impacto delas na comunicação?", "2.R=Os principais tipos de figuras de linguagem são metáfora, comparação, metonímia, catacrese, sinestesia, perífrase, hipérbole, eufemismo, litote, ironia, personificação, antítese, paradoxo, gradação, apóstrofe, elipse, zeugma, hipérbato, polissíndeto, assíndeto, anacoluto, pleonasmo, silepse, anáfora, aliteração, paronomásia, assonância e onomatopeia. Elas enriquecem a comunicação, trazendo expressividade, emoção e criatividade ao discurso."));
        listaExercicios.add(new Exercicios("3. Como a concordância nominal influencia a coesão textual?", "3.R=A concordância nominal garante que os substantivos e seus determinantes (adjetivos, artigos, pronomes e numerais) estejam de acordo em gênero e número, o que contribui para a coesão e clareza do texto, evitando ambiguidades e mal-entendidos."));
        listaExercicios.add(new Exercicios("4. Diferencie morfologia e sintaxe e explique como elas se complementam na análise gramatical.", "4.R=Morfologia é o estudo da estrutura e formação das palavras, enquanto sintaxe é o estudo da disposição das palavras na frase e das relações entre elas. Elas se complementam na análise gramatical, pois a morfologia fornece a base estrutural das palavras e a sintaxe organiza essas palavras em frases coerentes e gramaticalmente corretas."));
        listaExercicios.add(new Exercicios("5. Quais são as variações linguísticas existentes no Brasil e como elas impactam a comunicação?", "5.R=As variações linguísticas no Brasil incluem variações regionais, sociais, de idade, de gênero, entre outras. Elas impactam a comunicação ao refletirem a diversidade cultural e social do país, influenciando o vocabulário, a pronúncia e as construções gramaticais usadas pelos falantes."));
        listaExercicios.add(new Exercicios("6. Como identificar e evitar a ambiguidade em um texto?", "6.R=Para identificar e evitar a ambiguidade em um texto, é importante revisar cuidadosamente o uso de palavras e construções que possam ter múltiplos significados, preferindo expressões claras e específicas. A estrutura sintática deve ser organizada de modo a não deixar dúvidas sobre o sentido pretendido."));
        listaExercicios.add(new Exercicios("7. O que caracteriza a função poética da linguagem e quais são seus recursos estilísticos?", "7.R=A função poética da linguagem se caracteriza pelo foco na forma e na estética do texto, utilizando recursos estilísticos como figuras de linguagem, ritmo, rimas e aliterações para criar efeitos sonoros e visuais, enriquecendo a expressividade do discurso."));
        listaExercicios.add(new Exercicios("8. Explique a importância da coesão referencial em um texto.", "8.R=A coesão referencial é importante porque garante a continuidade e a ligação das ideias em um texto, utilizando elementos como pronomes, sinônimos e elipses para substituir termos já mencionados, evitando repetições e mantendo a fluidez da leitura."));
        listaExercicios.add(new Exercicios("9. Como a concordância verbal varia em orações com sujeitos compostos?", "9.R=Em orações com sujeitos compostos, a concordância verbal varia conforme a posição e a proximidade dos sujeitos. Se os sujeitos são unidos por 'e', o verbo deve estar no plural. Se os sujeitos são unidos por 'ou' com ideia de exclusão, o verbo concorda com o sujeito mais próximo."));
        listaExercicios.add(new Exercicios("10. Explique a diferença entre metáfora e metonímia e dê exemplos.", "10.R=A metáfora é uma comparação implícita entre elementos diferentes, enquanto a metonímia substitui um termo por outro com o qual tem relação de proximidade. Exemplo de metáfora: 'O tempo é um rio'. Exemplo de metonímia: 'Ele adora ler Shakespeare' (obra pelo autor)."));
        listaExercicios.add(new Exercicios("11. Como identificar a oração principal em um período composto?", "11.R=A oração principal em um período composto é aquela que não depende sintaticamente de outra oração e mantém sentido completo sozinha. As orações subordinadas dependem dela para ter sentido completo."));
        listaExercicios.add(new Exercicios("12. Quais são as classes gramaticais que podem sofrer flexão de número?", "12.R=As classes gramaticais que podem sofrer flexão de número são: substantivo, adjetivo, pronome, artigo e verbo."));
        listaExercicios.add(new Exercicios("13. Como a concordância verbal se aplica em orações com sujeito composto?", "13.R=Quando o sujeito é composto e posposto ao verbo, a concordância verbal pode ser feita no singular ou no plural. Se o sujeito composto está antes do verbo, o verbo fica no plural. Exemplo: 'Pedro e Maria foram ao cinema'."));
        listaExercicios.add(new Exercicios("14. Explique a diferença entre concordância verbal e concordância nominal.", "14.R=Concordância verbal é a relação de concordância entre o verbo e o sujeito da oração quanto ao número e pessoa. Concordância nominal é a relação de concordância entre os substantivos e seus determinantes (adjetivos, artigos, pronomes e numerais) quanto ao gênero e número."));
        listaExercicios.add(new Exercicios("15. Como as variações linguísticas afetam a comunicação no Brasil?", "15.R=As variações linguísticas refletem as diversidades regionais, sociais e culturais do Brasil, podendo influenciar a comunicação e a interpretação de mensagens. Elas mostram a riqueza e a pluralidade da língua, mas também podem causar dificuldades de compreensão em alguns contextos."));
        listaExercicios.add(new Exercicios("16. Quais são os elementos fundamentais da estrutura sintática de uma oração?", "16.R=Os elementos fundamentais da estrutura sintática de uma oração são: sujeito, predicado, objetos (direto e indireto), adjuntos adverbiais e complementos nominais."));
        listaExercicios.add(new Exercicios("17. Dê um exemplo de pleonasmo e explique seu uso em um texto.", "17.R=Um exemplo de pleonasmo é 'subir para cima'. O uso de pleonasmo pode reforçar a mensagem ou criar um efeito estilístico, embora seja considerado um vício de linguagem quando usado de forma desnecessária."));
        listaExercicios.add(new Exercicios("18. Explique o conceito de silepse e forneça um exemplo.", "18.R=A silepse é uma figura de linguagem que ocorre quando a concordância é feita com a ideia implícita e não com a forma gramatical das palavras. Exemplo: 'A gente somos inútil' (concordância com o sentido de plural de 'gente')."));
        listaExercicios.add(new Exercicios("19. Como a polissemia pode causar ambiguidades em um texto?", "19.R=A polissemia é a propriedade de uma palavra ter múltiplos significados. Pode causar ambiguidades quando o contexto não deixa claro qual significado deve ser interpretado. Exemplo: 'Ele partiu a maçã' (pode significar dividir em partes ou iniciar uma viagem)."));
        listaExercicios.add(new Exercicios("20. Quais são as principais classes gramaticais e suas funções na língua?", "20.R=As principais classes gramaticais são: substantivo (nomeia seres, objetos, conceitos), adjetivo (qualifica ou caracteriza o substantivo), verbo (indica ação, estado ou fenômeno), advérbio (modifica o verbo, adjetivo ou outro advérbio), pronome (substitui ou acompanha o substantivo), preposição (liga palavras, indicando relação), conjunção (liga orações ou palavras), artigo (define ou indefinide o substantivo, indicando gênero e número) e numeral(Indica quantidade, ordem, multiplicação ou fração."));
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

    public void criarExercicios(){

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
