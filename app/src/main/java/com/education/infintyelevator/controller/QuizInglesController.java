package com.education.infintyelevator.controller;

import android.os.Handler;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.core.content.ContextCompat;
import androidx.navigation.Navigation;

import com.education.infintyelevator.R;
import com.education.infintyelevator.databinding.FragmentQuizInglesBinding;
import com.education.infintyelevator.model.Quizes;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class QuizInglesController extends QuizesController{

        private List<Quizes> quizesLista;
        private int alternativaCorreta;
        private int alternativaSelecionada;
        private int pontos;
        public  boolean errou;
        private FragmentQuizInglesBinding binding;

        public QuizInglesController(FragmentQuizInglesBinding binding) {
            super();
            quizesLista = new ArrayList<Quizes>();
            this.binding = binding;
            quizesLista.add(new Quizes("Qual frase utiliza corretamente o Present Perfect?", R.id.radioButtonAIngles, "I have lived in this city since 2000.", "She is eating an apple now.", "They played football yesterday.", "He will travel to Europe next year."));
            quizesLista.add(new Quizes("Qual palavra é sinônimo de \"happy\"?", R.id.radioButtonCIngles, "Sad", "Angry", "Glad", "Tired"));
            quizesLista.add(new Quizes("Complete a frase: \"___ apple a day keeps the doctor away.\"", R.id.radioButtonBIngles, "A", "An", "The", "No article needed"));
            quizesLista.add(new Quizes("Qual frase expressa uma condição hipotética no futuro?", R.id.radioButtonAIngles, "If I study, I will pass the exam.", "If I had studied, I would have passed the exam.", "If I studied, I would pass the exam.", "If I had studied, I passed the exam."));
            quizesLista.add(new Quizes("Na frase \"She gave me a hint about the party\", a palavra \"hint\" significa:", R.id.radioButtonBIngles, "Um presente", "Uma dica", "Um convite", "Uma promessa"));
            quizesLista.add(new Quizes("Qual pronome substitui corretamente \"John and Mary\" na frase \"John and Mary are going to the movies\"?", R.id.radioButtonAIngles, "They", "Them", "Their", "Theirs"));
            quizesLista.add(new Quizes("Qual phrasal verb significa \"entender\"?", R.id.radioButtonBIngles, "To look up", "To figure out", "To give up", "To put up with"));
            quizesLista.add(new Quizes("Qual par de palavras NÃO são \"false friends\" (palavras que parecem iguais em português e inglês, mas têm significados diferentes)?", R.id.radioButtonDIngles, "Actual - atual", "Library - biblioteca", "Pretend - pretender", "Embarrassed - embaraçado"));
            quizesLista.add(new Quizes("Qual conjunção expressa oposição?", R.id.radioButtonCIngles, "And", "5 dias Because", "But", "So"));
            quizesLista.add(new Quizes("Qual a melhor opção para completar a frase: \"She has a ___ for languages.\" (Ela tem um dom para línguas.)", R.id.radioButtonAIngles, "gift", "present", "talent", "ability"));
            quizesLista.add(new Quizes("What is the past tense of 'go'?", R.id.radioButtonBIngles, "goed", "went", "gone", "goes"));
            quizesLista.add(new Quizes("What is the plural of 'child'?", R.id.radioButtonAIngles, "children", "childs", "childes", "child"));
            quizesLista.add(new Quizes("What does 'beautiful' mean?", R.id.radioButtonCIngles, "ugly", "quick", "pretty", "slow"));
            quizesLista.add(new Quizes("How do you say 'gato' in English?", R.id.radioButtonDIngles, "dog", "cow", "bird", "cat"));
            quizesLista.add(new Quizes("Choose the correct form: 'She _ to school every day.'", R.id.radioButtonAIngles, "goes", "go", "going", "gone"));
            quizesLista.add(new Quizes("What is the opposite of 'hot'?", R.id.radioButtonBIngles, "warm", "cold", "cool", "boiling"));
            quizesLista.add(new Quizes("Which word is a verb?", R.id.radioButtonCIngles, "quick", "blue", "run", "happy"));
            quizesLista.add(new Quizes("What is the meaning of 'breakfast'?", R.id.radioButtonDIngles, "lunch", "dinner", "snack", "morning meal"));
            quizesLista.add(new Quizes("What is the superlative of 'good'?", R.id.radioButtonAIngles, "best", "better", "most good", "goodest"));
            quizesLista.add(new Quizes("Which is a synonym for 'happy'?", R.id.radioButtonBIngles, "sad", "joyful", "angry", "bored"));
            quizesLista.add(new Quizes("What is the opposite of 'up'?", R.id.radioButtonCIngles, "left", "right", "down", "over"));
            quizesLista.add(new Quizes("What is the past tense of 'eat'?", R.id.radioButtonDIngles, "eated", "eats", "eating", "ate"));
            quizesLista.add(new Quizes("Which is a fruit?", R.id.radioButtonAIngles, "apple", "carrot", "potato", "onion"));
            quizesLista.add(new Quizes("What is the correct translation for 'thank you'?", R.id.radioButtonBIngles, "please", "obrigado", "hello", "goodbye"));
            quizesLista.add(new Quizes("What is the plural of 'foot'?", R.id.radioButtonCIngles, "foots", "footes", "feet", "feets"));
            quizesLista.add(new Quizes("How do you say 'livro' in English?", R.id.radioButtonDIngles, "pen", "pencil", "notebook", "book"));
            quizesLista.add(new Quizes("What is the past form of 'be'?", R.id.radioButtonAIngles, "was/were", "is", "been", "being"));
            quizesLista.add(new Quizes("What is a synonym for 'big'?", R.id.radioButtonBIngles, "small", "large", "tiny", "little"));
            quizesLista.add(new Quizes("What is the opposite of 'early'?", R.id.radioButtonCIngles, "soon", "before", "late", "next"));
            quizesLista.add(new Quizes("Which word means 'quickly'?", R.id.radioButtonDIngles, "slow", "careful", "bright", "fast"));
            quizesLista.add(new Quizes("Choose the correct word: 'He _ a car.'", R.id.radioButtonAIngles, "has", "have", "haves", "had"));
            quizesLista.add(new Quizes("What does 'library' mean?", R.id.radioButtonBIngles, "gym", "place with books", "park", "supermarket"));
            quizesLista.add(new Quizes("What is the opposite of 'old'?", R.id.radioButtonCIngles, "ancient", "older", "young", "aged"));
            quizesLista.add(new Quizes("Which is an animal?", R.id.radioButtonDIngles, "chair", "tree", "flower", "dog"));
            quizesLista.add(new Quizes("What is the past tense of 'see'?", R.id.radioButtonAIngles, "saw", "see", "seeing", "seen"));
            quizesLista.add(new Quizes("What is the plural of 'mouse'?", R.id.radioButtonBIngles, "mouses", "mice", "mouse", "mousees"));
            quizesLista.add(new Quizes("What is the opposite of 'high'?", R.id.radioButtonCIngles, "tall", "large", "low", "up"));
            quizesLista.add(new Quizes("How do you say 'cadeira' in English?", R.id.radioButtonDIngles, "table", "desk", "bed", "chair"));
            quizesLista.add(new Quizes("Which word means 'intelligent'?", R.id.radioButtonAIngles, "smart", "dull", "slow", "weak"));
            quizesLista.add(new Quizes("What is the correct form: 'I _ a student.'", R.id.radioButtonBIngles, "is", "am", "are", "be"));
            quizesLista.add(new Quizes("What is the opposite of 'dark'?", R.id.radioButtonCIngles, "black", "gray", "light", "dimmer"));
            quizesLista.add(new Quizes("Which is a synonym for 'friend'?", R.id.radioButtonDIngles, "enemy", "foe", "stranger", "buddy"));
            quizesLista.add(new Quizes("What is the translation of 'dog'?", R.id.radioButtonAIngles, "cachorro", "gato", "cavalo", "pássaro"));
            quizesLista.add(new Quizes("What is the meaning of 'house'?", R.id.radioButtonBIngles, "car", "casa", "porta", "árvore"));
            quizesLista.add(new Quizes("What is the opposite of 'happy'?", R.id.radioButtonCIngles, "joyful", "excited", "sad", "grateful"));
            quizesLista.add(new Quizes("What is the past tense of 'drink'?", R.id.radioButtonDIngles, "drinks", "drinked", "drunk", "drank"));
            quizesLista.add(new Quizes("Choose the correct form: 'They _ playing.'", R.id.radioButtonAIngles, "are", "is", "be", "am"));
            quizesLista.add(new Quizes("Which word means 'beautiful'?", R.id.radioButtonBIngles, "ugly", "pretty", "bad", "plain"));
            quizesLista.add(new Quizes("What is the translation of 'thank you'?", R.id.radioButtonCIngles, "por favor", "de nada", "obrigado", "adeus"));

        }


        public void criarQuestao() {

            binding.textEnunciadoIngles.setText(quizesLista.get(0).getEnunciado());
            binding.radioButtonAIngles.setText(quizesLista.get(0).getListaQuestoes().get(0));
            binding.radioButtonBIngles.setText(quizesLista.get(0).getListaQuestoes().get(1));
            binding.radioButtonCIngles.setText(quizesLista.get(0).getListaQuestoes().get(2));
            binding.radioButtonDIngles.setText(quizesLista.get(0).getListaQuestoes().get(3));
            alternativaCorreta = quizesLista.get(0).getAlternativaCorreta();

        }

        public void criarQuiz() {

            criarQuestao();

            binding.radioGQuizIngles.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int i) {
                    alternativaSelecionada = binding.radioGQuizIngles.getCheckedRadioButtonId();
                    RadioButton botaoSelecionado = binding.getRoot().findViewById(alternativaSelecionada);
                    if (botaoSelecionado != null) {

                        if (alternativaSelecionada == alternativaCorreta && !quizesLista.isEmpty()) {
                            pontos += 1;
                            botaoSelecionado.setBackgroundColor(ContextCompat.getColor(botaoSelecionado.getContext(), R.color.verde));
                            binding.radioGQuizIngles.clearCheck();
                            new Handler().postDelayed(new Runnable() {

                                @Override
                                public void run() {
                                    botaoSelecionado.setBackgroundColor(0);
                                    binding.textPontosIngles.setText(MessageFormat.format("Pontos: {0}", pontos));
                                    quizesLista.remove(0);
                                    criarQuestao();


                                }

                            }, 1000);


                        } else {

                            botaoSelecionado.setBackgroundColor(ContextCompat.getColor(botaoSelecionado.getContext(), R.color.red));
                            binding.radioGQuizIngles.clearCheck();
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {

                                    botaoSelecionado.setBackgroundColor(0);
                                    errou = true;
                                    if(errou) {

                                        voltar();
                                        Toast.makeText(binding.getRoot().getContext(), "Você errou.Tente novamente!", Toast.LENGTH_LONG).show();

                                    }
                                }
                            }, 1000);


                        }
                    }

                }
            });
        }

    public void voltar() {

        Navigation.findNavController(binding.getRoot()).popBackStack();
    }

}

