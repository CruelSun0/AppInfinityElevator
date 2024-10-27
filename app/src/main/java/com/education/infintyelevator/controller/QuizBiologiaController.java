package com.education.infintyelevator.controller;

import android.os.Handler;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.core.content.ContextCompat;
import androidx.navigation.Navigation;

import com.education.infintyelevator.R;
import com.education.infintyelevator.databinding.FragmentQuizBiologiaBinding;
import com.education.infintyelevator.databinding.FragmentQuizMatematicaBinding;
import com.education.infintyelevator.model.Quizes;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class QuizBiologiaController extends QuizesController{

    private List<Quizes> quizesLista;
    private int alternativaCorreta;
    private int alternativaSelecionada;
    private int pontos;
    public  boolean errou;
    private FragmentQuizBiologiaBinding binding;

    public QuizBiologiaController(FragmentQuizBiologiaBinding binding) {
        super();
        quizesLista = new ArrayList<Quizes>();
        this.binding = binding;
        quizesLista.add(new Quizes("Qual cientista é creditado pela primeira observação de células vivas?", R.id.radioButtonCBiologia, "Charles Darwin", "Gregor Mendel", "Robert Hooke", "Louis Pasteur"));
        quizesLista.add(new Quizes("Qual o principal gás do efeito estufa liberado pela queima de combustíveis fósseis?", R.id.radioButtonDBiologia, "Oxigênio", "Nitrogênio", "Metano", "Dióxido de carbono"));
        quizesLista.add(new Quizes("Qual o processo pelo qual uma célula somática se divide em duas células filhas idênticas?", R.id.radioButtonBBiologia, "Meiose", "Mitose", "Crossing over", "Transcrição"));
        quizesLista.add(new Quizes("A seleção natural, proposta por Charles Darwin, é um mecanismo evolutivo que favorece:", R.id.radioButtonCBiologia, "Os indivíduos mais fortes.", "Os indivíduos mais inteligentes.", "Os indivíduos mais adaptados ao ambiente.", "Os indivíduos com maior número de descendentes."));
        quizesLista.add(new Quizes("Qual órgão é responsável pela produção de insulina?", R.id.radioButtonABiologia, "Pâncreas", "Fígado", "Rim", "Estômago"));
        quizesLista.add(new Quizes("Qual o reino dos seres vivos que inclui os fungos?", R.id.radioButtonCBiologia, "Monera", "Protista", "Fungi", "Plantae"));
        quizesLista.add(new Quizes("Os vírus são considerados seres vivos?", R.id.radioButtonCBiologia, "Sim, pois possuem células.", "Sim, pois possuem material genético.", "Não, pois não possuem metabolismo próprio.", "Não, pois não possuem material genético."));
        quizesLista.add(new Quizes("Qual a parte da flor responsável pela produção de pólen?", R.id.radioButtonDBiologia, "Estigma", "Ovário", "Estilete", "Antera"));
        quizesLista.add(new Quizes("Qual o filo animal que apresenta maior diversidade de espécies?", R.id.radioButtonABiologia, "Artrópodes", "Cordados", "Moluscos", "Equinodermos"));
        quizesLista.add(new Quizes("Qual o principal fator abiótico que influencia a distribuição dos seres vivos em um bioma?", R.id.radioButtonABiologia, "Temperatura", "Número de predadores", "Disponibilidade de alimento", "Interação entre espécies"));
        quizesLista.add(new Quizes("Qual é a unidade básica da vida?", R.id.radioButtonABiologia, "Célula", "Átomo", "Molécula", "Organelo"));
        quizesLista.add(new Quizes("O que é fotossíntese?", R.id.radioButtonBBiologia, "Respiração celular", "Produção de glicose pela luz", "Divisão celular", "Excreção de água"));
        quizesLista.add(new Quizes("Qual é a função dos ribossomos?", R.id.radioButtonCBiologia, "Produzir energia", "Armazenar água", "Sintetizar proteínas", "Transportar oxigênio"));
        quizesLista.add(new Quizes("O DNA é composto por?", R.id.radioButtonDBiologia, "Açúcares", "Lipídios", "Aminoácidos", "Nucleotídeos"));
        quizesLista.add(new Quizes("O que caracteriza um ser autotrófico?", R.id.radioButtonABiologia, "Produz seu próprio alimento", "Respira oxigênio", "Se alimenta de outros seres", "Reproduz por sementes"));
        quizesLista.add(new Quizes("Qual é o papel das mitocôndrias?", R.id.radioButtonBBiologia, "Produzir proteínas", "Produzir ATP", "Armazenar gordura", "Controlar o núcleo"));
        quizesLista.add(new Quizes("O que é mutação?", R.id.radioButtonCBiologia, "Troca de habitat", "Morte de uma célula", "Alteração no DNA", "Processo de respiração"));
        quizesLista.add(new Quizes("Qual gás é liberado pela fotossíntese?", R.id.radioButtonDBiologia, "CO2", "N2", "CH4", "O2"));
        quizesLista.add(new Quizes("Qual é a função do sistema circulatório?", R.id.radioButtonABiologia, "Transportar nutrientes", "Produzir hormônios", "Controlar a temperatura", "Eliminar toxinas"));
        quizesLista.add(new Quizes("Qual é o órgão responsável pela filtragem do sangue?", R.id.radioButtonBBiologia, "Coração", "Rim", "Pulmão", "Estômago"));
        quizesLista.add(new Quizes("O que é um ecossistema?", R.id.radioButtonCBiologia, "Um tipo de célula", "Um tipo de planta", "Conjunto de seres vivos e ambiente", "Uma cadeia alimentar"));
        quizesLista.add(new Quizes("Qual reino inclui os fungos?", R.id.radioButtonDBiologia, "Animalia", "Plantae", "Protista", "Fungi"));
        quizesLista.add(new Quizes("O que é um herbívoro?", R.id.radioButtonABiologia, "Alimenta-se de plantas", "Alimenta-se de carne", "Alimenta-se de ambos", "Não se alimenta"));
        quizesLista.add(new Quizes("Qual é a função dos glóbulos vermelhos?", R.id.radioButtonBBiologia, "Defender o organismo", "Transportar oxigênio", "Produzir enzimas", "Filtrar toxinas"));
        quizesLista.add(new Quizes("Qual estrutura celular é responsável pelo controle genético?", R.id.radioButtonCBiologia, "Mitocôndria", "Ribossomo", "Núcleo", "Lisossomo"));
        quizesLista.add(new Quizes("Qual é a base da cadeia alimentar?", R.id.radioButtonDBiologia, "Carnívoros", "Detritívoros", "Onívoros", "Produtores"));
        quizesLista.add(new Quizes("Qual é a função da clorofila?", R.id.radioButtonABiologia, "Captar luz", "Armazenar água", "Produzir aminoácidos", "Controlar temperatura"));
        quizesLista.add(new Quizes("Qual é a função do sistema nervoso?", R.id.radioButtonBBiologia, "Produzir hormônios", "Coordenação corporal", "Transportar nutrientes", "Defesa do corpo"));
        quizesLista.add(new Quizes("O que são genes?", R.id.radioButtonCBiologia, "Células", "Proteínas", "Segmentos de DNA", "Lipídios"));
        quizesLista.add(new Quizes("Qual é a composição da membrana celular?", R.id.radioButtonDBiologia, "Açúcares e proteínas", "DNA e RNA", "Água e sais", "Lipídios e proteínas"));
        quizesLista.add(new Quizes("O que são organismos heterotróficos?", R.id.radioButtonABiologia, "Dependem de outros para se alimentar", "Produzem seu próprio alimento", "Vivem sem oxigênio", "Reproduzem-se por sementes"));
        quizesLista.add(new Quizes("Qual é a função da pele?", R.id.radioButtonBBiologia, "Produzir energia", "Proteção e regulação térmica", "Controlar batimentos cardíacos", "Filtrar toxinas"));
        quizesLista.add(new Quizes("O que é uma célula procariótica?", R.id.radioButtonCBiologia, "Com núcleo", "Com organelas complexas", "Sem núcleo definido", "Com clorofila"));
        quizesLista.add(new Quizes("O que é um vírus?", R.id.radioButtonDBiologia, "Uma célula", "Um fungo", "Um tipo de bactéria", "Agente infeccioso não celular"));
        quizesLista.add(new Quizes("Qual é a base do material genético?", R.id.radioButtonABiologia, "DNA", "RNA", "Proteína", "Lipídios"));
        quizesLista.add(new Quizes("O que caracteriza um ser vivo?", R.id.radioButtonBBiologia, "Respirar oxigênio", "Reproduzir-se e metabolizar", "Mover-se rapidamente", "Possuir DNA"));
        quizesLista.add(new Quizes("Qual é o papel do cloroplasto?", R.id.radioButtonCBiologia, "Produzir ATP", "Controlar o núcleo", "Realizar fotossíntese", "Armazenar água"));
        quizesLista.add(new Quizes("O que é biodiversidade?", R.id.radioButtonDBiologia, "Nível de poluição", "Número de espécies extintas", "Tamanho de um ecossistema", "Variedade de espécies na Terra"));
        quizesLista.add(new Quizes("Qual é a função dos anticorpos?", R.id.radioButtonABiologia, "Combater patógenos", "Transportar oxigênio", "Produzir hormônios", "Armazenar glicose"));
        quizesLista.add(new Quizes("O que é seleção natural?", R.id.radioButtonBBiologia, "Processo artificial", "Adaptação ao ambiente", "Acúmulo de mutações", "Destruição de espécies"));
        quizesLista.add(new Quizes("Qual é o papel dos neurônios?", R.id.radioButtonCBiologia, "Produzir enzimas", "Armazenar energia", "Transmitir impulsos nervosos", "Produzir proteínas"));
        quizesLista.add(new Quizes("Qual é a principal função dos pulmões?", R.id.radioButtonDBiologia, "Filtrar sangue", "Produzir energia", "Armazenar oxigênio", "Trocar gases"));
        quizesLista.add(new Quizes("O que é um habitat?", R.id.radioButtonABiologia, "Local onde vive uma espécie", "Conjunto de ecossistemas", "Aquecimento global", "Reserva biológica"));
        quizesLista.add(new Quizes("O que é um cromossomo?", R.id.radioButtonBBiologia, "Parte do citoplasma", "Estrutura de DNA condensado", "Tipo de célula", "Proteína do núcleo"));
        quizesLista.add(new Quizes("Qual é a função dos lisossomos?", R.id.radioButtonCBiologia, "Produzir energia", "Armazenar nutrientes", "Digestão celular", "Produzir proteínas"));
        quizesLista.add(new Quizes("O que caracteriza uma célula vegetal?", R.id.radioButtonDBiologia, "Ausência de núcleo", "Presença de ribossomos", "Falta de clorofila", "Presença de parede celular"));
        quizesLista.add(new Quizes("O que é um produtor na cadeia alimentar?", R.id.radioButtonABiologia, "Organismo que realiza fotossíntese", "Animal carnívoro", "Decompositor", "Organismo que se alimenta de outros"));
        quizesLista.add(new Quizes("Qual é o órgão responsável pela digestão?", R.id.radioButtonBBiologia, "Pulmão", "Estômago", "Fígado", "Intestino grosso"));
        quizesLista.add(new Quizes("O que é um parasita?", R.id.radioButtonCBiologia, "Organismo que produz seu próprio alimento", "Animal carnívoro", "Vive às custas de outro", "Decompõe matéria orgânica"));

    }


    public void criarQuestao() {

        binding.textEnunciadoBiologia.setText(quizesLista.get(0).getEnunciado());
        binding.radioButtonABiologia.setText(quizesLista.get(0).getListaQuestoes().get(0));
        binding.radioButtonBBiologia.setText(quizesLista.get(0).getListaQuestoes().get(1));
        binding.radioButtonCBiologia.setText(quizesLista.get(0).getListaQuestoes().get(2));
        binding.radioButtonDBiologia.setText(quizesLista.get(0).getListaQuestoes().get(3));
        alternativaCorreta = quizesLista.get(0).getAlternativaCorreta();

    }

    public void criarQuiz() {

        criarQuestao();

        binding.radioGQuizBiologia.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                alternativaSelecionada = binding.radioGQuizBiologia.getCheckedRadioButtonId();
                RadioButton botaoSelecionado = binding.getRoot().findViewById(alternativaSelecionada);
                if (botaoSelecionado != null) {

                    if (alternativaSelecionada == alternativaCorreta && !quizesLista.isEmpty()) {
                        pontos += 1;
                        botaoSelecionado.setBackgroundColor(ContextCompat.getColor(botaoSelecionado.getContext(), R.color.verde));
                        binding.radioGQuizBiologia.clearCheck();
                        new Handler().postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                botaoSelecionado.setBackgroundColor(0);
                                binding.textPontosBiologia.setText(MessageFormat.format("Pontos: {0}", pontos));
                                quizesLista.remove(0);
                                criarQuestao();


                            }

                        }, 1000);


                    } else {

                        botaoSelecionado.setBackgroundColor(ContextCompat.getColor(botaoSelecionado.getContext(), R.color.red));
                        binding.radioGQuizBiologia.clearCheck();
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
