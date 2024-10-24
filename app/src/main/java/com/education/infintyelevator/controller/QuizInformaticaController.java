package com.education.infintyelevator.controller;

import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.core.content.ContextCompat;

import com.education.infintyelevator.R;
import com.education.infintyelevator.databinding.FragmentQuizInformaticaBinding;
import com.education.infintyelevator.model.Quizes;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class QuizInformaticaController extends QuizesController{

    private List<Quizes> quizesLista;
    private int alternativaCorreta;
    private int alternativaSelecionada;
    private int pontos;
    public  boolean errou;
    private FragmentQuizInformaticaBinding binding;

    public QuizInformaticaController(FragmentQuizInformaticaBinding binding) {
        super();
        quizesLista = new ArrayList<Quizes>();
        this.binding = binding;
        quizesLista.add(new Quizes("O que é hardware?", R.id.radioButtonAInformatica, "Parte física do computador", "Programas do computador", "Navegador de internet", "Arquivo de texto"));
        quizesLista.add(new Quizes("O que é software?", R.id.radioButtonBInformatica, "Dispositivos de entrada", "Programas e aplicativos", "Cabos de rede", "Processador"));
        quizesLista.add(new Quizes("Qual é a função da CPU?", R.id.radioButtonCInformatica, "Armazenar dados", "Conectar à internet", "Processar informações", "Reproduzir áudio"));
        quizesLista.add(new Quizes("O que significa RAM?", R.id.radioButtonDInformatica, "Real Active Memory", "Remote Access Memory", "Random Access Memory", "Read And Modify"));
        quizesLista.add(new Quizes("O que é um sistema operacional?", R.id.radioButtonAInformatica, "Software que gerencia o hardware", "Antivírus", "Processador de texto", "Editor de imagens"));
        quizesLista.add(new Quizes("Exemplo de sistema operacional:", R.id.radioButtonBInformatica, "Google Chrome", "Windows", "Adobe Reader", "Intel Core"));
        quizesLista.add(new Quizes("Para que serve o antivírus?", R.id.radioButtonCInformatica, "Melhorar o desempenho", "Organizar arquivos", "Proteger contra malware", "Editar vídeos"));
        quizesLista.add(new Quizes("O que é um arquivo PDF?", R.id.radioButtonDInformatica, "Formato de imagem", "Planilha eletrônica", "Documento de texto", "Formato de documento portátil"));
        quizesLista.add(new Quizes("Qual a função do mouse?", R.id.radioButtonAInformatica, "Dispositivo de entrada", "Dispositivo de saída", "Armazenamento externo", "Acelerador de gráficos"));
        quizesLista.add(new Quizes("O que é um navegador de internet?", R.id.radioButtonBInformatica, "Gerenciador de arquivos", "Programa para acessar a web", "Antivírus", "Processador de texto"));
        quizesLista.add(new Quizes("O que é uma URL?", R.id.radioButtonCInformatica, "Nome do computador", "Tipo de arquivo", "Endereço de um site", "Protocolo de segurança"));
        quizesLista.add(new Quizes("O que faz a tecla F5?", R.id.radioButtonDInformatica, "Fecha uma janela", "Salva um arquivo", "Abre o menu iniciar", "Atualiza uma página"));
        quizesLista.add(new Quizes("O que é um HD?", R.id.radioButtonAInformatica, "Disco rígido de armazenamento", "Processador de gráficos", "Memória temporária", "Placa de som"));
        quizesLista.add(new Quizes("Qual a função do Excel?", R.id.radioButtonBInformatica, "Editor de imagens", "Criar planilhas", "Navegar na internet", "Tocar música"));
        quizesLista.add(new Quizes("O que é um byte?", R.id.radioButtonCInformatica, "Unidade de velocidade", "Código de erro", "Unidade de armazenamento", "Tipo de software"));
        quizesLista.add(new Quizes("Qual é a extensão de um arquivo de texto do Word?", R.id.radioButtonDInformatica, ".xls", ".jpeg", ".txt", ".docx"));
        quizesLista.add(new Quizes("Para que serve o Google Drive?", R.id.radioButtonAInformatica, "Armazenar arquivos na nuvem", "Editar vídeos", "Criar gráficos", "Digitalizar documentos"));
        quizesLista.add(new Quizes("O que é uma rede LAN?", R.id.radioButtonBInformatica, "Rede global", "Rede local", "Rede de satélite", "Rede de cabos"));
        quizesLista.add(new Quizes("Qual o atalho para copiar?", R.id.radioButtonCInformatica, "Ctrl + V", "Ctrl + X", "Ctrl + C", "Ctrl + A"));
        quizesLista.add(new Quizes("O que é um modem?", R.id.radioButtonDInformatica, "Um tipo de cabo", "Um software de segurança", "Um editor de imagens", "Dispositivo para conectar à internet"));
        quizesLista.add(new Quizes("Qual a função do teclado?", R.id.radioButtonAInformatica, "Entrada de dados", "Saída de som", "Armazenamento", "Gerar gráficos"));
        quizesLista.add(new Quizes("O que é um vírus de computador?", R.id.radioButtonBInformatica, "Arquivo de texto", "Programa malicioso", "Driver de impressora", "Extensão de vídeo"));
        quizesLista.add(new Quizes("O que é um firewall?", R.id.radioButtonCInformatica, "Programa de edição", "Hardware de segurança", "Sistema de proteção de rede", "Gerenciador de arquivos"));
        quizesLista.add(new Quizes("Qual a função do Outlook?", R.id.radioButtonDInformatica, "Editor de textos", "Navegador", "Criador de planilhas", "Gerenciador de e-mails"));
        quizesLista.add(new Quizes("O que é um drive?", R.id.radioButtonAInformatica, "Software para controlar hardware", "Arquivo de vídeo", "Editor de planilhas", "Site de armazenamento"));
        quizesLista.add(new Quizes("O que é uma planilha eletrônica?", R.id.radioButtonBInformatica, "Editor de texto", "Documento organizado em células", "Imagem digital", "Software de apresentação"));
        quizesLista.add(new Quizes("O que é uma impressora?", R.id.radioButtonCInformatica, "Dispositivo de entrada", "Software de edição", "Dispositivo de saída", "Armazenamento externo"));
        quizesLista.add(new Quizes("O que significa WWW?", R.id.radioButtonDInformatica, "World Web Window", "Web Window World", "Wide Window Web", "World Wide Web"));
        quizesLista.add(new Quizes("O que é um HD SSD?", R.id.radioButtonAInformatica, "Armazenamento mais rápido", "Processador gráfico", "Placa de rede", "Memória de vídeo"));
        quizesLista.add(new Quizes("Para que serve o PowerPoint?", R.id.radioButtonBInformatica, "Editar imagens", "Criar apresentações", "Gerenciar arquivos", "Programar em Java"));
        quizesLista.add(new Quizes("Qual é a função da memória cache?", R.id.radioButtonCInformatica, "Armazenar programas", "Executar jogos", "Acelerar o acesso à memória", "Armazenar senhas"));
        quizesLista.add(new Quizes("O que é uma rede Wi-Fi?", R.id.radioButtonDInformatica, "Rede cabeada", "Protocolo de segurança", "Software de rede", "Rede sem fio"));
        quizesLista.add(new Quizes("O que é um backup?", R.id.radioButtonAInformatica, "Cópia de segurança", "Conexão com a internet", "Atualização de software", "Compressão de arquivos"));
        quizesLista.add(new Quizes("Qual é a função do navegador Chrome?", R.id.radioButtonBInformatica, "Antivírus", "Acessar sites", "Editar documentos", "Criar gráficos"));
        quizesLista.add(new Quizes("Qual comando apaga um arquivo no Windows?", R.id.radioButtonCInformatica, "Ctrl + P", "Ctrl + A", "Delete", "Enter"));
        quizesLista.add(new Quizes("O que é um IP?", R.id.radioButtonDInformatica, "Extensão de vídeo", "Software de segurança", "Protocolo de envio de e-mails", "Endereço de rede"));
        quizesLista.add(new Quizes("O que é a nuvem?", R.id.radioButtonAInformatica, "Armazenamento online", "Editor de imagens", "Antivírus", "Sistema operacional"));
        quizesLista.add(new Quizes("Qual é o sistema de arquivos do Windows?", R.id.radioButtonBInformatica, "FAT32", "NTFS", "EXT4", "HFS+"));
        quizesLista.add(new Quizes("O que faz o Windows Explorer?", R.id.radioButtonCInformatica, "Gerencia impressoras", "Edita vídeos", "Gerencia arquivos e pastas", "Cria planilhas"));
        quizesLista.add(new Quizes("O que é um pendrive?", R.id.radioButtonDInformatica, "Dispositivo de entrada", "Editor de texto", "Memória interna", "Armazenamento portátil"));
        quizesLista.add(new Quizes("O que é um driver?", R.id.radioButtonAInformatica, "Software que controla dispositivos", "Antivírus", "Tipo de processador", "Editor de imagens"));
        quizesLista.add(new Quizes("Qual a função do Windows Defender?", R.id.radioButtonBInformatica, "Gerenciar arquivos", "Proteger contra vírus", "Editar planilhas", "Criar gráficos"));
        quizesLista.add(new Quizes("Qual a função do teclado Num Lock?", R.id.radioButtonCInformatica, "Caps Lock", "Ativar funções do teclado", "Ativar o teclado numérico", "Abrir o menu iniciar"));
        quizesLista.add(new Quizes("O que é um cabo HDMI?", R.id.radioButtonDInformatica, "Conexão de rede", "Tipo de arquivo", "Cabo de áudio", "Transmissão de áudio e vídeo"));
        quizesLista.add(new Quizes("O que é um atalho de teclado?", R.id.radioButtonAInformatica, "Comando rápido", "Processo de instalação", "Tipo de software", "Atualização do sistema"));
        quizesLista.add(new Quizes("Qual é a extensão de um arquivo de imagem JPEG?", R.id.radioButtonBInformatica, ".pdf", ".jpg", ".txt", ".mp3"));
    }


    public void criarQuestao() {

        binding.textEnunciadoInformatica.setText(quizesLista.get(0).getEnunciado());
        binding.radioButtonAInformatica.setText(quizesLista.get(0).getListaQuestoes().get(0));
        binding.radioButtonBInformatica.setText(quizesLista.get(0).getListaQuestoes().get(1));
        binding.radioButtonCInformatica.setText(quizesLista.get(0).getListaQuestoes().get(2));
        binding.radioButtonDInformatica.setText(quizesLista.get(0).getListaQuestoes().get(3));
        alternativaCorreta = quizesLista.get(0).getAlternativaCorreta();

    }

    public void criarQuiz() {

        criarQuestao();

        binding.radioGQuizInformatica.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                alternativaSelecionada = binding.radioGQuizInformatica.getCheckedRadioButtonId();
                if (alternativaSelecionada == alternativaCorreta && !quizesLista.isEmpty()) {
                    pontos += 1;
                    RadioButton botaoAlternativaCorreta = binding.getRoot().findViewById(alternativaCorreta);
                    botaoAlternativaCorreta.setBackgroundColor(ContextCompat.getColor(botaoAlternativaCorreta.getContext(), R.color.verde));

                    binding.radioGQuizInformatica.clearCheck();
                    quizesLista.remove(0);
                    binding.textPontosInformatica.setText(MessageFormat.format("Pontos: {0}", pontos));
                    criarQuestao();
                    botaoAlternativaCorreta.setBackgroundColor(0);

                } else {

                    RadioButton botaoSelecionado = binding.getRoot().findViewById(alternativaSelecionada);
                    errou = true;

                }

            }
        });
    }

}
