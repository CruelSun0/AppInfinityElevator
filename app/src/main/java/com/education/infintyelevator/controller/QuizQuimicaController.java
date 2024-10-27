package com.education.infintyelevator.controller;

import android.os.Handler;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.core.content.ContextCompat;
import androidx.navigation.Navigation;

import com.education.infintyelevator.R;
import com.education.infintyelevator.databinding.FragmentQuizQuimicaBinding;
import com.education.infintyelevator.model.Quizes;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class QuizQuimicaController extends QuizesController {

    private List<Quizes> quizesLista;
    private int alternativaCorreta;
    private int alternativaSelecionada;
    private int pontos;
    public  boolean errou;
    private FragmentQuizQuimicaBinding binding;

    public QuizQuimicaController(FragmentQuizQuimicaBinding binding) {
        super();
        quizesLista = new ArrayList<Quizes>();
        this.binding = binding;
        quizesLista.add(new Quizes("Qual cientista é creditado pela primeira observação de células vivas?", R.id.radioButtonCQuimica, "Charles Darwin", "Gregor Mendel", "Robert Hooke", "Louis Pasteur"));
        quizesLista.add(new Quizes("Qual o principal gás do efeito estufa liberado pela queima de combustíveis fósseis?", R.id.radioButtonDQuimica, "Oxigênio", "Nitrogênio", "Metano", "Dióxido de carbono"));
        quizesLista.add(new Quizes("Qual o processo pelo qual uma célula somática se divide em duas células filhas idênticas?", R.id.radioButtonBQuimica, "Meiose", "Mitose", "Crossing over", "Transcrição"));
        quizesLista.add(new Quizes("A seleção natural, proposta por Charles Darwin, é um mecanismo evolutivo que favorece:", R.id.radioButtonCQuimica, "Os indivíduos mais fortes.", "Os indivíduos mais inteligentes.", "Os indivíduos mais adaptados ao ambiente.", "Os indivíduos com maior número de descendentes."));
        quizesLista.add(new Quizes("Qual órgão é responsável pela produção de insulina?", R.id.radioButtonAQuimica, "Pâncreas", "Fígado", "Rim", "Estômago"));
        quizesLista.add(new Quizes("Qual o reino dos seres vivos que inclui os fungos?", R.id.radioButtonCQuimica, "Monera", "Protista", "Fungi", "Plantae"));
        quizesLista.add(new Quizes("Os vírus são considerados seres vivos?", R.id.radioButtonCQuimica, "Sim, pois possuem células.", "Sim, pois possuem material genético.", "Não, pois não possuem metabolismo próprio.", "Não, pois não possuem material genético."));
        quizesLista.add(new Quizes("Qual a parte da flor responsável pela produção de pólen?", R.id.radioButtonDQuimica, "Estigma", "Ovário", "Estilete", "Antera"));
        quizesLista.add(new Quizes("Qual o filo animal que apresenta maior diversidade de espécies?", R.id.radioButtonAQuimica, "Artrópodes", "Cordados", "Moluscos", "Equinodermos"));
        quizesLista.add(new Quizes("Qual o principal fator abiótico que influencia a distribuição dos seres vivos em um bioma?", R.id.radioButtonAQuimica, "Temperatura", "Número de predadores", "Disponibilidade de alimento", "Interação entre espécies"));
        quizesLista.add(new Quizes("Qual é o número atômico do Oxigênio?", R.id.radioButtonBQuimica, "6", "8", "12", "16"));
        quizesLista.add(new Quizes("Qual é a fórmula química da água?", R.id.radioButtonAQuimica, "H2O", "H2O2", "CO2", "HO"));
        quizesLista.add(new Quizes("Quem é considerado o pai da Tabela Periódica?", R.id.radioButtonCQuimica, "Lavoisier", "Dalton", "Mendeleev", "Rutherford"));
        quizesLista.add(new Quizes("Qual é o elemento mais abundante no universo?", R.id.radioButtonAQuimica, "Hidrogênio", "Oxigênio", "Carbono", "Hélio"));
        quizesLista.add(new Quizes("O que é um cátion?", R.id.radioButtonDQuimica, "Um átomo neutro", "Um átomo com elétrons a mais", "Um isótopo", "Um íon positivo"));
        quizesLista.add(new Quizes("Qual é o símbolo do elemento Potássio?", R.id.radioButtonBQuimica, "P", "K", "Po", "Pt"));
        quizesLista.add(new Quizes("Qual gás é liberado na fotossíntese?", R.id.radioButtonCQuimica, "Nitrogênio", "Gás Carbônico", "Oxigênio", "Ozônio"));
        quizesLista.add(new Quizes("Qual é a unidade de medida da quantidade de matéria?", R.id.radioButtonDQuimica, "Joule", "Litro", "Kelvin", "Mol"));
        quizesLista.add(new Quizes("O que é uma ligação iônica?", R.id.radioButtonBQuimica, "Ligação entre dois metais", "Transferência de elétrons", "Compartilhamento de elétrons", "Ligação entre não metais"));
        quizesLista.add(new Quizes("Qual é o pH da água pura?", R.id.radioButtonAQuimica, "7", "0", "14", "1"));
        quizesLista.add(new Quizes("Qual é o símbolo do elemento Ferro?", R.id.radioButtonCQuimica, "Fe", "F", "Fe", "Ir"));
        quizesLista.add(new Quizes("Qual elemento possui o menor ponto de fusão?", R.id.radioButtonAQuimica, "Hélio", "Oxigênio", "Nitrogênio", "Neônio"));
        quizesLista.add(new Quizes("Qual é o nome do processo de separação de misturas sólido-líquido por gravidade?", R.id.radioButtonDQuimica, "Filtração", "Decantação", "Destilação", "Sedimentação"));
        quizesLista.add(new Quizes("Qual é o nome do processo em que o líquido passa para o estado gasoso?", R.id.radioButtonBQuimica, "Solidificação", "Evaporação", "Sublimação", "Liquefação"));
        quizesLista.add(new Quizes("Qual gás é conhecido como gás dos peidos?", R.id.radioButtonCQuimica, "Hidrogênio", "Oxigênio", "Metano", "Dióxido de carbono"));
        quizesLista.add(new Quizes("O que é um isótopo?", R.id.radioButtonDQuimica, "Átomos com mesmo número de prótons e elétrons", "Átomos com número de prótons diferentes", "Átomos que se unem formando íons", "Átomos com mesmo número de prótons e diferentes números de nêutrons"));
        quizesLista.add(new Quizes("Qual a fórmula do ácido sulfúrico?", R.id.radioButtonAQuimica, "H2SO4", "H2CO3", "HNO3", "HCl"));
        quizesLista.add(new Quizes("Qual é o metal líquido à temperatura ambiente?", R.id.radioButtonBQuimica, "Césio", "Mercúrio", "Lítio", "Sódio"));
        quizesLista.add(new Quizes("Qual é a fórmula do metano?", R.id.radioButtonCQuimica, "CH3", "C2H4", "CH4", "C3H8"));
        quizesLista.add(new Quizes("Qual é o nome do elemento de símbolo 'Na'?", R.id.radioButtonDQuimica, "Níquel", "Nitrogênio", "Nióbio", "Sódio"));
        quizesLista.add(new Quizes("O que é a eletronegatividade?", R.id.radioButtonBQuimica, "Capacidade de doar elétrons", "Capacidade de atrair elétrons", "Quantidade de prótons no núcleo", "Massa de um átomo"));
        quizesLista.add(new Quizes("Qual é a principal aplicação do gás hélio?", R.id.radioButtonCQuimica, "Encher balões de ar comprimido", "Anestésicos", "Balões de festa", "Combustível"));
        quizesLista.add(new Quizes("Qual é a forma geométrica da molécula de água?", R.id.radioButtonDQuimica, "Linear", "Triangular", "Tetraédrica", "Angular"));
        quizesLista.add(new Quizes("Qual é a fórmula química do gás carbônico?", R.id.radioButtonAQuimica, "CO2", "CO", "C2O4", "CH4"));
        quizesLista.add(new Quizes("O que é uma base segundo Arrhenius?", R.id.radioButtonBQuimica, "Substância que libera H+", "Substância que libera OH-", "Substância que doa elétrons", "Substância que aceita elétrons"));
        quizesLista.add(new Quizes("Qual é o principal componente do ar?", R.id.radioButtonCQuimica, "Oxigênio", "Dióxido de carbono", "Nitrogênio", "Argônio"));
        quizesLista.add(new Quizes("O que é um ácido forte?", R.id.radioButtonDQuimica, "Aquele que libera poucos íons H+", "Aquele que tem pH alto", "Aquele que reage lentamente", "Aquele que libera muitos íons H+"));
        quizesLista.add(new Quizes("Qual é a função do catalisador em uma reação?", R.id.radioButtonAQuimica, "Acelerar a reação", "Reduzir a temperatura", "Aumentar a pressão", "Aumentar a concentração de reagentes"));
        quizesLista.add(new Quizes("Qual é a fórmula da amônia?", R.id.radioButtonBQuimica, "NH", "NH3", "NH4", "NH2"));
        quizesLista.add(new Quizes("Qual o estado físico do cloro em temperatura ambiente?", R.id.radioButtonCQuimica, "Sólido", "Líquido", "Gasoso", "Plasma"));
        quizesLista.add(new Quizes("Qual é o principal elemento encontrado nos seres vivos?", R.id.radioButtonDQuimica, "Oxigênio", "Nitrogênio", "Fósforo", "Carbono"));
        quizesLista.add(new Quizes("Qual é a definição de massa atômica?", R.id.radioButtonAQuimica, "Média ponderada dos isótopos", "Número de prótons", "Número de nêutrons", "Massa do elétron"));
        quizesLista.add(new Quizes("Qual é o estado de agregação de maior densidade?", R.id.radioButtonBQuimica, "Gasoso", "Sólido", "Líquido", "Plasma"));
        quizesLista.add(new Quizes("O que ocorre em uma reação de combustão?", R.id.radioButtonCQuimica, "Liberação de nitrogênio", "Absorção de calor", "Liberação de dióxido de carbono", "Produção de gelo"));
        quizesLista.add(new Quizes("Qual é a fórmula do ácido clorídrico?", R.id.radioButtonAQuimica, "HCl", "HBr", "HI", "H2S"));
        quizesLista.add(new Quizes("Qual é o nome do processo de separação que usa a diferença de ponto de ebulição?", R.id.radioButtonDQuimica, "Decantação", "Filtração", "Centrifugação", "Destilação"));
        quizesLista.add(new Quizes("Qual o nome da substância que acelera a reação sem ser consumida?", R.id.radioButtonBQuimica, "Solvente", "Catalisador", "Inibidor", "Redutor"));
        quizesLista.add(new Quizes("Qual é a fórmula do gás oxigênio?", R.id.radioButtonCQuimica, "O", "O3", "O2", "O4"));
        quizesLista.add(new Quizes("Qual é a definição de ligação covalente?", R.id.radioButtonAQuimica, "Compartilhamento de elétrons", "Doação de prótons", "Transferência de elétrons", "Formação de íons"));
        quizesLista.add(new Quizes("Qual é o nome do processo de conversão de gás em líquido?", R.id.radioButtonDQuimica, "Sublimação", "Solidificação", "Evaporação", "Condensação"));

    }


    public void criarQuestao() {

        binding.textEnunciadoQuimica.setText(quizesLista.get(0).getEnunciado());
        binding.radioButtonAQuimica.setText(quizesLista.get(0).getListaQuestoes().get(0));
        binding.radioButtonBQuimica.setText(quizesLista.get(0).getListaQuestoes().get(1));
        binding.radioButtonCQuimica.setText(quizesLista.get(0).getListaQuestoes().get(2));
        binding.radioButtonDQuimica.setText(quizesLista.get(0).getListaQuestoes().get(3));
        alternativaCorreta = quizesLista.get(0).getAlternativaCorreta();

    }

    public void criarQuiz() {

        criarQuestao();

        binding.radioGQuizQuimica.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                alternativaSelecionada = binding.radioGQuizQuimica.getCheckedRadioButtonId();
                RadioButton botaoSelecionado = binding.getRoot().findViewById(alternativaSelecionada);
                if (botaoSelecionado != null) {

                    if (alternativaSelecionada == alternativaCorreta && !quizesLista.isEmpty()) {
                        pontos += 1;
                        botaoSelecionado.setBackgroundColor(ContextCompat.getColor(botaoSelecionado.getContext(), R.color.verde));
                        binding.radioGQuizQuimica.clearCheck();
                        new Handler().postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                botaoSelecionado.setBackgroundColor(0);
                                binding.textPontosQuimica.setText(MessageFormat.format("Pontos: {0}", pontos));
                                quizesLista.remove(0);
                                criarQuestao();


                            }

                        }, 1000);


                    } else {

                        botaoSelecionado.setBackgroundColor(ContextCompat.getColor(botaoSelecionado.getContext(), R.color.red));
                        binding.radioGQuizQuimica.clearCheck();
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
