package com.education.infintyelevator.controller;

import android.view.animation.AlphaAnimation;
import android.view.animation.BounceInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.Toast;

import com.education.infintyelevator.databinding.FragmentBiologiaExerciciosBinding;
import com.education.infintyelevator.databinding.FragmentInformaticaExerciciosBinding;
import com.education.infintyelevator.model.Exercicios;

import java.util.ArrayList;
import java.util.List;

public class ExerciciosBiologiaController extends ExerciciosController {

    private FragmentBiologiaExerciciosBinding binding;
    private List<Exercicios> listaExercicios;
    private int indice;
    AlphaAnimation fade_in;
    ScaleAnimation diminuir;
    BounceInterpolator bounceInterpolator;

    public ExerciciosBiologiaController(FragmentBiologiaExerciciosBinding binding) {
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
        listaExercicios.add(new Exercicios("1. Descreva a estrutura do DNA e explique a sua importância na genética.", "1.R=A estrutura do DNA é uma dupla hélice formada por nucleotídeos, cada um composto por um grupo fosfato, uma pentose (desoxirribose) e uma base nitrogenada (adenina, timina, citosina ou guanina). A importância do DNA na genética reside no fato de que ele carrega as instruções genéticas para o desenvolvimento e funcionamento de todos os seres vivos."));
        listaExercicios.add(new Exercicios("2. Quais são os principais benefícios e riscos dos alimentos transgênicos?", "2.R=Os principais benefícios dos alimentos transgênicos incluem maior resistência a pragas, aumento da produtividade e melhora nutricional. Os riscos podem incluir reações alérgicas, resistência a antibióticos e impactos ambientais como a redução da biodiversidade."));
        listaExercicios.add(new Exercicios("3. Como a relação entre predadores e presas afeta a dinâmica das populações em um ecossistema?", "3.R=A relação entre predadores e presas afeta a dinâmica das populações, mantendo o equilíbrio ecológico. Predadores controlam a população de presas, evitando a superpopulação e a escassez de recursos. Em contrapartida, a quantidade de presas disponível influencia o número de predadores."));
        listaExercicios.add(new Exercicios("4. Explique a importância das plantas para o ciclo do carbono.", "4.R=As plantas são essenciais para o ciclo do carbono, pois realizam a fotossíntese, processo em que absorvem dióxido de carbono (CO2) da atmosfera e liberam oxigênio (O2). Durante a fotossíntese, as plantas fixam o carbono em compostos orgânicos, contribuindo para a redução dos níveis de CO2 atmosférico."));
        listaExercicios.add(new Exercicios("5. Quais são os principais avanços e aplicações da biotecnologia moderna?", "5.R=Os principais avanços da biotecnologia moderna incluem a engenharia genética, a clonagem, a terapia gênica e a produção de medicamentos biológicos. Suas aplicações abrangem a agricultura, a medicina, a indústria farmacêutica e a bioremediação ambiental."));
        listaExercicios.add(new Exercicios("6. Descreva o papel dos ribossomos na síntese proteica.", "6.R=Os ribossomos são organelas celulares responsáveis pela síntese proteica. Eles leem a sequência de nucleotídeos do RNA mensageiro (mRNA) e, com a ajuda do RNA transportador (tRNA), juntam os aminoácidos na ordem correta para formar proteínas."));
        listaExercicios.add(new Exercicios("7. Como a seleção natural contribui para a evolução das espécies?", "7.R=A seleção natural é o processo pelo qual indivíduos com características favoráveis têm maior probabilidade de sobreviver e se reproduzir, transmitindo essas características à próxima geração. Isso resulta na evolução das espécies, adaptando-as melhor ao seu ambiente."));
        listaExercicios.add(new Exercicios("8. Explique a diferença entre a mitose e a meiose em termos de função e resultado final.", "8.R=A mitose é um processo de divisão celular que resulta em duas células-filhas geneticamente idênticas à célula-mãe, sendo fundamental para o crescimento e a reparação de tecidos. A meiose, por outro lado, produz quatro células-filhas geneticamente distintas, com metade do número de cromossomos da célula-mãe, sendo essencial para a formação de gametas e a variabilidade genética."));
        listaExercicios.add(new Exercicios("9. Quais são os principais tipos de ecossistemas e suas características?", "9.R=Os principais tipos de ecossistemas incluem ecossistemas terrestres (florestas, savanas, desertos, tundras) e aquáticos (ecossistemas de água doce e marinhos). Cada ecossistema possui características específicas de clima, vegetação, fauna e interações bióticas e abióticas."));
        listaExercicios.add(new Exercicios("10. Descreva as funções dos principais órgãos do sistema digestório humano.", "10.R=A boca inicia a digestão com a mastigação e a ação de enzimas salivares. O esôfago transporta o alimento ao estômago, onde ocorre a digestão química. O intestino delgado é responsável pela absorção dos nutrientes. O intestino grosso absorve água e forma as fezes. O fígado produz bile, o pâncreas secreta enzimas digestivas e a vesícula biliar armazena a bile."));
        listaExercicios.add(new Exercicios("11. Como a biotecnologia pode ser aplicada na agricultura para melhorar a produtividade?", "11.R=A biotecnologia pode ser aplicada na agricultura por meio da engenharia genética para desenvolver culturas resistentes a pragas, doenças e condições climáticas adversas, aumentar o valor nutricional dos alimentos e melhorar a eficiência no uso de recursos naturais, como água e fertilizantes."));
        listaExercicios.add(new Exercicios("12. Explique a função das mitocôndrias na célula e a importância da respiração celular.", "12.R=As mitocôndrias são organelas responsáveis pela produção de energia na célula, por meio do processo de respiração celular. Elas convertem a glicose em ATP (adenosina trifosfato), a principal fonte de energia para as atividades celulares."));
        listaExercicios.add(new Exercicios("13. Como a variabilidade genética contribui para a evolução das espécies?", "13.R=A variabilidade genética, resultante de mutações, recombinações genéticas e reprodução sexual, proporciona a matéria-prima para a seleção natural, permitindo que as espécies se adaptem a mudanças ambientais e evoluam ao longo do tempo."));
        listaExercicios.add(new Exercicios("14. Quais são os benefícios e os riscos dos alimentos transgênicos?", "14.R=Os benefícios dos alimentos transgênicos incluem maior resistência a pragas e doenças, aumento da produtividade agrícola e melhoria do valor nutricional. Os riscos envolvem possíveis impactos na saúde humana, como alergias, e efeitos ambientais, como a perda de biodiversidade e a contaminação de cultivos não transgênicos."));
        listaExercicios.add(new Exercicios("15. Explique o papel dos decompositores na ecologia.", "15.R=Os decompositores, como bactérias e fungos, são responsáveis por decompor matéria orgânica morta, transformando-a em nutrientes simples que podem ser reutilizados pelos produtores, fechando o ciclo dos nutrientes e mantendo o equilíbrio dos ecossistemas."));
        listaExercicios.add(new Exercicios("16. Como ocorre a polinização em plantas com flores?", "16.R=A polinização em plantas com flores ocorre quando o pólen é transferido da antera (parte masculina) para o estigma (parte feminina) da mesma flor ou de flores diferentes, geralmente por meio de agentes polinizadores como vento, insetos, aves e morcegos."));
        listaExercicios.add(new Exercicios("17. Qual é a importância do código genético na biogenética?", "17.R=O código genético é fundamental na biogenética, pois é o conjunto de regras que define como a informação contida no DNA é traduzida em proteínas. Ele garante que as instruções genéticas sejam interpretadas corretamente, permitindo a síntese de proteínas essenciais para a vida."));
        listaExercicios.add(new Exercicios("18. Descreva a função dos rins na fisiologia humana.", "18.R=Os rins filtram o sangue para remover resíduos e excesso de água, formando a urina. Eles também regulam o equilíbrio de eletrólitos, o pH do sangue e a pressão arterial, além de produzir hormônios que estimulam a produção de glóbulos vermelhos e a absorção de cálcio."));
        listaExercicios.add(new Exercicios("19. Como as organelas celulares contribuem para o funcionamento de uma célula eucariótica?", "19.R=As organelas celulares têm funções específicas que contribuem para o funcionamento da célula eucariótica. Por exemplo, mitocôndrias produzem energia, ribossomos sintetizam proteínas, o retículo endoplasmático transporta substâncias, o complexo de Golgi modifica e distribui proteínas, e os lisossomos digerem substâncias indesejadas."));
        listaExercicios.add(new Exercicios("20. Qual é a relação entre seleção natural e adaptação?", "20.R=A seleção natural é o processo pelo qual indivíduos com características vantajosas têm maior probabilidade de sobreviver e se reproduzir. Essas características, chamadas de adaptações, são passadas para as gerações seguintes, aumentando a aptidão da população para o ambiente em que vive."));

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
