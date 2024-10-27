package com.education.infintyelevator.controller;

import android.view.animation.AlphaAnimation;
import android.view.animation.BounceInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.Toast;

import com.education.infintyelevator.databinding.FragmentInformaticaExerciciosBinding;
import com.education.infintyelevator.databinding.FragmentMatematicaExerciciosBinding;
import com.education.infintyelevator.model.Exercicios;

import java.util.ArrayList;
import java.util.List;

public class ExerciciosInformaticaController extends ExerciciosController {

    AlphaAnimation fade_in;
    ScaleAnimation diminuir;
    BounceInterpolator bounceInterpolator;
    private final FragmentInformaticaExerciciosBinding binding;
    private final List<Exercicios> listaExercicios;
    private int indice;

    public ExerciciosInformaticaController(FragmentInformaticaExerciciosBinding binding) {
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
        listaExercicios.add(new Exercicios("1. Diferencie hardware de software.", "1.R=Hardware é a parte física do computador, composta pelos componentes eletrônicos e mecânicos, enquanto software é a parte lógica, composta pelos programas e sistemas operacionais que controlam o hardware."));
        listaExercicios.add(new Exercicios("2. Explique a função da unidade central de processamento (CPU).", "2.R=A CPU é o componente principal de um computador que executa instruções de programas, realizando operações aritméticas, lógicas e de controle."));
        listaExercicios.add(new Exercicios("3. Quais são os principais tipos de memória em um computador e suas funções?", "3.R=Os principais tipos de memória são: RAM (memória de acesso aleatório), usada para armazenar temporariamente dados e programas em execução; ROM (memória somente de leitura), que armazena dados permanentes necessários para o funcionamento do sistema; e memória de armazenamento, como HDDs e SSDs, usada para armazenar dados de forma permanente."));
        listaExercicios.add(new Exercicios("4. Qual a função de um periférico de entrada? Cite dois exemplos.", "4.R=Periféricos de entrada permitem a entrada de dados no computador. Exemplos: teclado (entrada de texto) e mouse (entrada de comandos e seleção)."));
        listaExercicios.add(new Exercicios("5. Quais são as principais funções do sistema operacional Windows?", "5.R=O sistema operacional Windows gerencia os recursos do computador, como memória e dispositivos, fornece uma interface gráfica para o usuário, executa e organiza programas e arquivos, além de garantir a segurança e integridade do sistema."));
        listaExercicios.add(new Exercicios("6. Diferencie memória RAM de memória ROM.", "6.R=A memória RAM é volátil, usada para armazenar temporariamente dados e programas em execução, enquanto a memória ROM é não volátil, armazenando dados permanentes necessários para o funcionamento do sistema."));
        listaExercicios.add(new Exercicios("7. Quais são os componentes principais de um computador?", "7.R=Os componentes principais de um computador são: CPU (unidade central de processamento), memória RAM, memória ROM, unidade de armazenamento (HDD ou SSD), placa-mãe, fonte de alimentação e periféricos (teclado, mouse, monitor)."));
        listaExercicios.add(new Exercicios("8. Explique a diferença entre HDD e SSD.", "8.R=HDD (disco rígido) utiliza discos magnéticos para armazenar dados, enquanto SSD (unidade de estado sólido) utiliza memória flash, sendo mais rápido, silencioso e resistente a impactos."));
        listaExercicios.add(new Exercicios("9. Quais são os tipos de arquivos mais comuns e suas extensões?", "9.R=Os tipos de arquivos mais comuns incluem: arquivos de texto (.txt, .docx), arquivos de imagem (.jpg, .png), arquivos de áudio (.mp3, .wav), arquivos de vídeo (.mp4, .avi) e arquivos compactados (.zip, .rar)."));
        listaExercicios.add(new Exercicios("10. Quais são os principais atalhos do Windows e suas funções?", "10.R=Principais atalhos do Windows: Ctrl+C (copiar), Ctrl+V (colar), Ctrl+X (recortar), Ctrl+Z (desfazer), Alt+Tab (alternar entre janelas), Win+D (mostrar área de trabalho), Win+L (bloquear o computador)."));
        listaExercicios.add(new Exercicios("11. Qual a importância do BIOS no funcionamento do computador?", "11.R=BIOS (Sistema Básico de Entrada/Saída) é um firmware essencial que inicializa o hardware durante o boot e fornece uma interface de baixo nível para o sistema operacional e outros softwares."));
        listaExercicios.add(new Exercicios("12. O que são drivers e qual sua função?", "12.R=Drivers são programas que permitem ao sistema operacional comunicar-se com o hardware, garantindo que os dispositivos funcionem corretamente."));
        listaExercicios.add(new Exercicios("13. Como funciona a multitarefa no sistema operacional Windows?", "13.R=A multitarefa no Windows permite que vários programas sejam executados simultaneamente, gerenciando recursos do sistema para que as tarefas possam compartilhar o processamento da CPU e a memória de forma eficiente."));
        listaExercicios.add(new Exercicios("14. Explique a função de uma placa-mãe em um computador.", "14.R=A placa-mãe é responsável por conectar todos os componentes de hardware de um computador, permitindo que eles se comuniquem entre si. Ela fornece os conectores necessários para instalar a CPU, memória RAM, dispositivos de armazenamento, placas de expansão e periféricos."));
        listaExercicios.add(new Exercicios("15. Como a memória ROM difere da memória RAM em termos de funcionalidade?", "15.R=A memória ROM (Read-Only Memory) é um tipo de memória não volátil que armazena dados permanentemente, sendo usada principalmente para o firmware do computador. A memória RAM (Random Access Memory) é volátil e usada para armazenar dados temporários que o CPU precisa acessar rapidamente enquanto realiza tarefas."));
        listaExercicios.add(new Exercicios("16. Quais são as vantagens e desvantagens dos SSDs em comparação com os HDDs?", "16.R=Os SSDs (Solid State Drives) são mais rápidos, consomem menos energia, são mais duráveis e silenciosos que os HDDs (Hard Disk Drives). No entanto, os SSDs têm um custo por gigabyte mais alto e, geralmente, menor capacidade de armazenamento em comparação aos HDDs."));
        listaExercicios.add(new Exercicios("17. Descreva as principais funções do sistema operacional Windows.", "17.R=O sistema operacional Windows gerencia os recursos do computador, incluindo a CPU, memória e dispositivos de entrada e saída. Ele também fornece uma interface gráfica de usuário (GUI) para facilitar a interação com o sistema, gerencia arquivos e pastas, executa aplicativos e assegura a segurança do sistema por meio de atualizações e proteções contra malware."));
        listaExercicios.add(new Exercicios("18. Quais são os tipos de arquivos mais comuns e suas extensões no Windows?", "18.R=Os tipos de arquivos mais comuns no Windows incluem documentos (.docx, .pdf), imagens (.jpg, .png), vídeos (.mp4, .avi), áudios (.mp3, .wav) e executáveis (.exe). Cada tipo de arquivo é identificado por uma extensão específica que define o formato e o programa necessário para abri-lo."));
        listaExercicios.add(new Exercicios("19. Cite três atalhos de teclado úteis no Windows e suas funções.", "19.R=Três atalhos úteis no Windows são: Ctrl+C (copia o item selecionado), Ctrl+V (cola o item copiado) e Alt+Tab (alterna entre as janelas abertas). Esses atalhos ajudam a aumentar a eficiência na utilização do sistema operacional."));
        listaExercicios.add(new Exercicios("20. Quais são os principais componentes de hardware de um computador e suas funções?", "20.R=Os principais componentes de hardware de um computador são: CPU (processador central que executa as instruções do sistema), RAM (memória temporária para armazenamento de dados em uso), HDD/SSD (dispositivos de armazenamento permanente), placa-mãe (conecta todos os componentes de hardware), GPU (processador gráfico que renderiza imagens e vídeos), e fontes de alimentação (fornece energia elétrica para os componentes do computador)."));
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
