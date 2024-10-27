package com.education.infintyelevator.controller;

import android.view.animation.AlphaAnimation;
import android.view.animation.BounceInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.Toast;

import com.education.infintyelevator.databinding.FragmentInglesExerciciosBinding;
import com.education.infintyelevator.model.Exercicios;

import java.util.ArrayList;
import java.util.List;

public class ExerciciosInglesController extends ExerciciosController {

    private FragmentInglesExerciciosBinding binding;
    private List<Exercicios> listaExercicios;
    private int indice;
    AlphaAnimation fade_in;
    ScaleAnimation diminuir;
    BounceInterpolator bounceInterpolator;

    public ExerciciosInglesController(FragmentInglesExerciciosBinding binding) {
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
        listaExercicios.add(new Exercicios("1. Como se utiliza o 'verb to be' no presente?", "1.R=O 'verb to be' no presente é utilizado da seguinte forma: 'am' com 'I', 'is' com 'he', 'she' e 'it', e 'are' com 'you', 'we' e 'they'. Exemplos: 'I am a teacher', 'She is happy', 'They are students'."));
        listaExercicios.add(new Exercicios("2. Explique o uso do Simple Present para descrever hábitos.", "2.R=O Simple Present é usado para descrever ações habituais ou rotineiras que ocorrem regularmente. Exemplos: 'I wake up at 7 am every day', 'She goes to the gym twice a week'."));
        listaExercicios.add(new Exercicios("3. Dê exemplos de verbos regulares e irregulares no passado simples.", "3.R=Exemplos de verbos regulares: 'worked', 'played', 'studied'. Exemplos de verbos irregulares: 'went', 'saw', 'took'."));
        listaExercicios.add(new Exercicios("4. Como se forma a forma afirmativa em inglês com o verbo 'to be'?", "4.R=Para formar a forma afirmativa com o verbo 'to be', utiliza-se o sujeito seguido do verbo 'to be' no presente. Exemplos: 'I am', 'You are', 'He/She/It is', 'We are', 'They are'."));
        listaExercicios.add(new Exercicios("5. Explique como se constrói a forma interrogativa com o verbo 'to be'.", "5.R=Para construir a forma interrogativa com o verbo 'to be', inverte-se a posição do sujeito e do verbo 'to be'. Exemplos: 'Am I?', 'Are you?', 'Is he/she/it?', 'Are we?', 'Are they?'."));
        listaExercicios.add(new Exercicios("6. Descreva a formação da forma negativa no Simple Present.", "6.R=A forma negativa no Simple Present é formada pelo sujeito seguido de 'do not' (don't) ou 'does not' (doesn't) para a terceira pessoa do singular, seguido do verbo na forma base. Exemplos: 'I do not like coffee', 'She doesn't play piano'."));
        listaExercicios.add(new Exercicios("7. Dê exemplos de frases no Futuro Contínuo.", "7.R=Exemplos de frases no Futuro Contínuo: 'I will be studying at 8 pm', 'They will be traveling next month', 'She will be working all day tomorrow'."));
        listaExercicios.add(new Exercicios("8. Como se usa 'and', 'but', e 'because' como linking words?", "8.R='And' é usado para adicionar informações: 'I like apples and oranges'. 'But' é usado para contrastar ideias: 'I like coffee, but I don't like tea'. 'Because' é usado para dar razões: 'I stayed home because it was raining'."));
        listaExercicios.add(new Exercicios("9. Como se forma a forma afirmativa no Simple Past?", "9.R=A forma afirmativa no Simple Past é formada pelo sujeito seguido do verbo no passado. Para verbos regulares, adiciona-se '-ed' ao verbo base. Para verbos irregulares, usa-se a forma específica do passado. Exemplos: 'He visited his grandparents', 'She saw a movie'."));
        listaExercicios.add(new Exercicios("10. Dê exemplos de perguntas com question words.", "10.R=Exemplos de perguntas com question words: 'What is your name?', 'Where do you live?', 'When did you arrive?', 'Who is your best friend?', 'Why are you late?', 'How does this work?'."));
        listaExercicios.add(new Exercicios("10. Como a forma afirmativa do verbo 'to be' é utilizada no presente?", "10.R=A forma afirmativa do verbo 'to be' no presente é usada para descrever estados, identidades ou características. É conjugado como 'am' para 'I', 'is' para 'he', 'she', 'it' e 'are' para 'you', 'we', 'they'. Exemplo: 'I am a teacher', 'She is happy', 'They are students'."));
        listaExercicios.add(new Exercicios("11. Quais são as regras para adicionar 's' ou 'es' aos verbos no Simple Present para a terceira pessoa do singular?", "11.R=No Simple Present, para a terceira pessoa do singular, adiciona-se 's' ao verbo base. Se o verbo termina em 'ch', 'sh', 'x', 's', 'z' ou 'o', adiciona-se 'es'. Se termina em consoante + 'y', troca-se 'y' por 'i' e adiciona 'es'. Exemplo: 'watch' se torna 'watches', 'study' se torna 'studies'."));
        listaExercicios.add(new Exercicios("12. Como os verbos irregulares são conjugados no Simple Past?", "12.R=Os verbos irregulares no Simple Past não seguem um padrão fixo de conjugação. Por exemplo, 'go' se torna 'went', 'see' se torna 'saw', 'take' se torna 'took'. Esses verbos precisam ser memorizados devido às suas formas únicas."));
        listaExercicios.add(new Exercicios("13. Qual é a estrutura de uma pergunta no Simple Present?", "13.R=No Simple Present, a estrutura de uma pergunta é formada pelo auxiliar 'do' ou 'does' (para a terceira pessoa do singular), seguido do sujeito e do verbo base. Exemplo: 'Do you like coffee?' 'Does she play tennis?'."));
        listaExercicios.add(new Exercicios("14. Qual é a estrutura da forma negativa do Futuro Contínuo?", "14.R=A forma negativa do Futuro Contínuo é formada pelo sujeito seguido de 'will not' (contraído como 'won't') + 'be' e o verbo principal no gerúndio. Exemplo: 'I will not be studying at 8 pm', 'She won't be working tomorrow'."));
        listaExercicios.add(new Exercicios("15. Como as linking words são usadas para adicionar informações em um texto?", "15.R=Linking words de adição incluem 'and', 'also', 'besides', 'moreover', 'furthermore'. Elas são usadas para adicionar informações ou ideias em um texto. Exemplo: 'She is a talented singer, and she also writes her own songs'."));
        listaExercicios.add(new Exercicios("16. Como as questões no Simple Past são formuladas?", "16.R=As questões no Simple Past são formuladas com o auxiliar 'did', seguido do sujeito e do verbo na forma base. Exemplo: 'Did you go to the party?' 'Did he finish his homework?'."));
        listaExercicios.add(new Exercicios("17. Qual é a importância das question words 'what', 'where' e 'when' em perguntas?", "17.R=As question words 'what', 'where' e 'when' são usadas para obter informações específicas: 'what' pergunta sobre coisas ou informações, 'where' sobre lugares ou localização, e 'when' sobre tempo. Exemplo: 'What is your name?' 'Where do you live?' 'When is your birthday?'."));
        listaExercicios.add(new Exercicios("18. Dê um exemplo de uma frase afirmativa, negativa e interrogativa com o verbo 'to be' no presente.", "18.R=Frase afirmativa: 'She is a teacher.' Frase negativa: 'She is not a teacher.' Frase interrogativa: 'Is she a teacher?'."));
        listaExercicios.add(new Exercicios("19. Quais são os principais usos do Futuro Contínuo?", "19.R=O Futuro Contínuo é usado para descrever ações que estarão em progresso em um momento específico no futuro, para falar sobre eventos futuros planejados ou esperados, e para fazer suposições sobre atividades provavelmente acontecendo agora. Exemplo: 'At this time tomorrow, I will be flying to New York'."));
        listaExercicios.add(new Exercicios("20. Explique a diferença entre 'how much' e 'how many' com exemplos.", "20.R='How much' é usado para perguntar sobre quantidade não contável, enquanto 'how many' é usado para quantidade contável. Exemplo: 'How much money do you have?' 'How many books are there?'."));
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
