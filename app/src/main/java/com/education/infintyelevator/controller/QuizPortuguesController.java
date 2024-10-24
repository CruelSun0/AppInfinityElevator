package com.education.infintyelevator.controller;

import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import com.education.infintyelevator.R;
import com.education.infintyelevator.databinding.FragmentQuizBiologiaBinding;
import com.education.infintyelevator.databinding.FragmentQuizInformaticaBinding;
import com.education.infintyelevator.databinding.FragmentQuizInglesBinding;
import com.education.infintyelevator.databinding.FragmentQuizMatematicaBinding;
import com.education.infintyelevator.databinding.FragmentQuizPortuguesBinding;
import com.education.infintyelevator.databinding.FragmentQuizQuimicaBinding;
import com.education.infintyelevator.model.Quizes;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class QuizPortuguesController extends QuizesController{

    private List<Quizes> quizesLista;
    int alternativaCorreta;
    int alternativaSelecionada;
    int pontos;
    public boolean errou;
    FragmentQuizPortuguesBinding binding;

    public QuizPortuguesController (FragmentQuizPortuguesBinding binding) {

        this.binding = binding;
        quizesLista = new ArrayList<Quizes>();
        quizesLista.add(new Quizes("Em A maioria dos alunos _________ a prova difícil, a forma verbal correta a ser empregada é:", R.id.radioButtonB, "acharam","achou","acharam-se","achou-se"));
        quizesLista.add(new Quizes("\"A vida é a arte do encontro, algo assim como música\". Nessa frase, a palavra \"algo\" tem a função de:", R.id.radioButtonC, "intensificar o sentido de \"arte\"","atenuar a afirmação anterior.","introduzir uma comparação.","negar a ideia de que a vida é uma arte."));
        quizesLista.add(new Quizes("Assinale a alternativa em que a vírgula foi empregada corretamente:", R.id.radioButtonA, "O menino, inteligente e criativo, resolveu o problema.","O menino inteligente, e criativo, resolveu o problema.","O menino, inteligente e, criativo, resolveu o problema.","O menino inteligente e criativo resolveu, o problema"));
        quizesLista.add(new Quizes("O antônimo da palavra \"abundante\" é:", R.id.radioButtonA, "escasso","farto","pleno","vasto"));
        quizesLista.add(new Quizes("Em \"Chovia de mansinho, uma chuva fina, que parecia acariciar a terra\", temos a figura de linguagem:", R.id.radioButtonB, "metáfora","personificação","comparação","hipérbole"));
        quizesLista.add(new Quizes("A frase em que a regência verbal está correta é:", R.id.radioButtonD, "Aspiro um futuro melhor.","Prefiro mais chocolate do que morango.","Assisti o filme ontem à noite.","Lembro-me daquela viagem."));
        quizesLista.add(new Quizes("Assinale a alternativa em que o uso do acento indicativo de crase está correto:", R.id.radioButtonA, "Fui à casa de Maria.","Referi-me àquele assunto.","Voltei à pé para casa.","Cheguei à uma conclusão."));
        quizesLista.add(new Quizes("\"A menina bonita sorriu para o menino\", a palavra \"bonita\" é:", R.id.radioButtonA, "adjetivo","advérbio","substantivo","verbo"));
        quizesLista.add(new Quizes("Assinale a alternativa que completa a frase de forma coesa e coerente: \"O livro era muito interessante, _____________ li rapidamente.", R.id.radioButtonA, "por isso","portanto","mas","logo"));
        quizesLista.add(new Quizes("A linguagem utilizada em uma conversa informal entre amigos, geralmente, apresenta:", R.id.radioButtonB, "linguagem formal e rebuscada.","uso de gírias e expressões coloquiais.","vocabulário técnico e especializado.","estruturas gramaticais complexas."));
        quizesLista.add(new Quizes("Qual é o plural de 'cidadão'?", R.id.radioButtonA, "Cidadãos", "Cidadões", "Cidadãs", "Cidades"));
        quizesLista.add(new Quizes("O que é um advérbio?", R.id.radioButtonB, "Palavra que nomeia", "Palavra que modifica verbos", "Palavra que define", "Palavra que substitui"));
        quizesLista.add(new Quizes("Qual é o antônimo de 'feliz'?", R.id.radioButtonC, "Alegre", "Contente", "Triste", "Eufórico"));
        quizesLista.add(new Quizes("Qual palavra é um adjetivo?", R.id.radioButtonD, "Amor", "Correr", "Viver", "Bonito"));
        quizesLista.add(new Quizes("O que é um ditongo?", R.id.radioButtonA, "Encontro de vogal e semivogal", "Encontro de duas consoantes", "Encontro de duas vogais", "Palavra com duas sílabas"));
        quizesLista.add(new Quizes("Qual é a função de um pronome?", R.id.radioButtonB, "Descrever ações", "Substituir substantivos", "Indicar lugar", "Modificar verbos"));
        quizesLista.add(new Quizes("O que é uma oração coordenada?", R.id.radioButtonC, "Depende de outra oração", "Não tem sentido completo", "Independente sintaticamente", "Define o sujeito"));
        quizesLista.add(new Quizes("Qual frase tem crase correta?", R.id.radioButtonD, "Vou a escola", "Chegou a uma hora", "Fui a praia", "Vou à casa"));
        quizesLista.add(new Quizes("Qual é a função do verbo 'ser'?", R.id.radioButtonA, "Verbo de ligação", "Verbo de ação", "Verbo auxiliar", "Verbo modal"));
        quizesLista.add(new Quizes("O que é uma metáfora?", R.id.radioButtonB, "Afirmação objetiva", "Comparação implícita", "Figura de repetição", "Afirmação exagerada"));
        quizesLista.add(new Quizes("Qual é o plural de 'maçã'?", R.id.radioButtonC, "Maças", "Maçães", "Maçãs", "Maçãos"));
        quizesLista.add(new Quizes("O que indica uma interjeição?", R.id.radioButtonD, "Modo", "Tempo", "Lugar", "Emoção"));
        quizesLista.add(new Quizes("Qual é a classificação de 'casa'?", R.id.radioButtonA, "Substantivo comum", "Adjetivo", "Pronome", "Verbo"));
        quizesLista.add(new Quizes("Qual a função de uma preposição?", R.id.radioButtonB, "Descrever um verbo", "Ligar termos na oração", "Indicar quantidade", "Substituir o sujeito"));
        quizesLista.add(new Quizes("O que é um vocativo?", R.id.radioButtonC, "Complemento direto", "Predicado", "Chamamento", "Adjunto adverbial"));
        quizesLista.add(new Quizes("Qual é a sílaba tônica de 'café'?", R.id.radioButtonD, "Ca", "Fe", "Fé", "fé"));
        quizesLista.add(new Quizes("Qual é o sujeito da frase 'Choveu muito'?", R.id.radioButtonA, "Sujeito inexistente", "Sujeito simples", "Sujeito indeterminado", "Sujeito composto"));
        quizesLista.add(new Quizes("Qual frase está na voz passiva?", R.id.radioButtonB, "Eu comprei um carro", "O carro foi comprado por mim", "Eu estou comprando um carro", "O carro está comigo"));
        quizesLista.add(new Quizes("Qual é o verbo da frase 'Ela canta bem'?", R.id.radioButtonC, "Ela", "Bem", "Canta", "Canta bem"));
        quizesLista.add(new Quizes("O que é um hiato?", R.id.radioButtonD, "Duas consoantes juntas", "Duas vogais na mesma sílaba", "Duas semivogais juntas", "Duas vogais em sílabas diferentes"));
        quizesLista.add(new Quizes("Qual é a forma correta do plural de 'pai'?", R.id.radioButtonA, "Pais", "Paies", "Países", "Paieis"));
        quizesLista.add(new Quizes("O que é um sujeito oculto?", R.id.radioButtonB, "Aparece explícito", "Não aparece na frase", "É composto", "É determinado"));
        quizesLista.add(new Quizes("Qual é o sinônimo de 'triste'?", R.id.radioButtonC, "Alegre", "Feliz", "Melancólico", "Eufórico"));
        quizesLista.add(new Quizes("Qual palavra é um substantivo?", R.id.radioButtonD, "Rapidamente", "Azul", "Correr", "Mesa"));
        quizesLista.add(new Quizes("Qual é a função de um artigo?", R.id.radioButtonA, "Determinar o substantivo", "Descrever um verbo", "Indicar lugar", "Modificar adjetivos"));
        quizesLista.add(new Quizes("Qual é a classe gramatical de 'felizmente'?", R.id.radioButtonB, "Adjetivo", "Advérbio", "Verbo", "Conjunção"));
        quizesLista.add(new Quizes("Qual é o antônimo de 'difícil'?", R.id.radioButtonC, "Complicado", "Trabalhoso", "Fácil", "Confuso"));
        quizesLista.add(new Quizes("O que é uma aliteração?", R.id.radioButtonD, "Repetição de palavras", "Repetição de ideias", "Repetição de frases", "Repetição de sons"));
        quizesLista.add(new Quizes("Qual é o tempo verbal de 'eu comi'?", R.id.radioButtonA, "Pretérito perfeito", "Pretérito imperfeito", "Futuro do presente", "Presente"));
        quizesLista.add(new Quizes("Qual é a forma correta: 'a gente' ou 'agente'?", R.id.radioButtonB, "'A gente'", "'Agente'", "'Ajeente'", "'Ajente'"));
        quizesLista.add(new Quizes("O que indica uma interrogação?", R.id.radioButtonC, "Afirmação", "Explicação", "Pergunta", "Emoção"));
        quizesLista.add(new Quizes("Qual é o substantivo coletivo de 'peixe'?", R.id.radioButtonD, "Arquipélago", "Nuvem", "Constelação", "Cardume"));
        quizesLista.add(new Quizes("Qual é o aumentativo de 'cão'?", R.id.radioButtonA, "Cachorrão", "Cãozinho", "Cachorro", "Cãozito"));
        quizesLista.add(new Quizes("O que é um pronome possessivo?", R.id.radioButtonB, "Substitui substantivos", "Indica posse", "Expressa dúvida", "Indica lugar"));
        quizesLista.add(new Quizes("Qual é a função do sujeito na frase 'João foi ao mercado'?", R.id.radioButtonC, "Objeto direto", "Predicado", "Sujeito simples", "Sujeito composto"));
        quizesLista.add(new Quizes("Qual é a forma correta de escrever 'parabéns'?", R.id.radioButtonD, "Parabens", "Parabém", "Parabeins", "Parabéns"));
        quizesLista.add(new Quizes("O que é uma oração subordinada?", R.id.radioButtonA, "Depende de outra oração", "Independente", "Completa sozinha", "Não faz sentido"));
        quizesLista.add(new Quizes("Qual é o sujeito indeterminado da frase 'Vive-se bem aqui'?", R.id.radioButtonB, "Eu", "Não identificado", "Todos", "Nós"));
        quizesLista.add(new Quizes("Qual é a sílaba tônica de 'abacaxi'?", R.id.radioButtonC, "A", "Ba", "Xi", "Ca"));
    }


    public void criarQuestao() {

        binding.textEnunciado.setText(quizesLista.get(0).getEnunciado());
        binding.radioButtonA.setText(quizesLista.get(0).getListaQuestoes().get(0));
        binding.radioButtonB.setText(quizesLista.get(0).getListaQuestoes().get(1));
        binding.radioButtonC.setText(quizesLista.get(0).getListaQuestoes().get(2));
        binding.radioButtonD.setText(quizesLista.get(0).getListaQuestoes().get(3));
        alternativaCorreta = quizesLista.get(0).getAlternativaCorreta();

    }


    public void criarQuiz() {

        criarQuestao();

        binding.radioGQuiz.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                    alternativaSelecionada = binding.radioGQuiz.getCheckedRadioButtonId();
                    if (alternativaSelecionada == alternativaCorreta && !quizesLista.isEmpty()) {
                        pontos += 1;
                        RadioButton botaoAlternativaCorreta = binding.getRoot().findViewById(alternativaCorreta);
                        binding.radioGQuiz.clearCheck();
                        quizesLista.remove(0);
                        binding.textPontos.setText(MessageFormat.format("Pontos: {0}", pontos));
                        criarQuestao();
                    }

                    else {

                        errou = true;

                    }
                }
        });

    }

}
