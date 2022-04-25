package aceleracao;

import java.util.Random;

public class EstruturasCondicionais {
  public static void main(String[] args) {
    ifElse();
    while_();
    doWhile();
    for_();
    forArray();
  }

  public static void ifElse() {
    double mediaFinal = Math.random() * 10;
    String resultado = "INDEFINIDO";

    if (mediaFinal >= 7) {
      resultado = "APROVADA";
    } else {
      resultado = "REPROVADA";
    }
    System.out.println(resultado);
  }

  public static void while_() {
    // Cria um array com os inscritos
    String[] inscritos = { "MARCOS", "ALINE", "LUCAS", "PATRICIA", "JOAO", "FELIPE", "LUCIA", "ANTONIO", "FERNANDA",
        "MARCELA", "VITOR", "BEATRIZ", "JORGE", "JULIA" };

    // Determina o número máximo de vagas
    final int numeroVagas = 10;
    // A palavra `final` determina que o valor dessa variável não é alterável, ele
    // passa a ser uma constante!

    // Criamos um vetor vazio com espaço igual ao número de vagas. Não se preocupe
    // se não entender a sintaxe 100% — em breve entenderá!
    String[] vagas = new String[numeroVagas];

    // Determinamos quantas vagas já foram preenchidas
    int vagaAtual = 0;

    // Percorremos todos inscritos e adicionamos nas vagas até que o número
    // total de vagas seja preenchido
    String inscrito = "Indefinido";
    String log;

    while (vagaAtual < numeroVagas) {
      inscrito = inscritos[vagaAtual];
      log = "Adicionando a inscrição: " + inscrito + " Na vaga: " + (vagaAtual + 1) + "\n";
      vagas[vagaAtual] = inscrito;
      vagaAtual += 1;
      System.out.println(log);
    }
  }

  public static void doWhile() {
    int tentativas = 0;
    int atendeu = 0;
    String log;

    do {
      log = "Ligando para candidato selecionado ...\n";
      // O código abaixo nos dá um numero aleatório entre 0 e 2.
      atendeu = new Random().ints(0, 2).findFirst().getAsInt();
      tentativas += 1;
    } while (atendeu == 0 && tentativas < 3);

    log = "Candidato atendeu na tentativa: " + tentativas;
    System.out.println(log);
  }

  public static void for_() {
    int numero;
    String log;

    // Leia como: PARA numero = 1, contanto que numero <= 10, faça o loop e depois
    // faça numero += 1!
    for (numero = 1; numero <= 10; numero += 1) {
      log = "O Número atual é: " + numero + "\n";
      System.out.println(log);
    }
  }

  public static void forArray() {
    // Cria um vetor com 4 alunos
    String[] alunos = { "MARCOS", "ALINE", "LUCAS", "PATRICIA" };
    String log;

    int matricula = 1;
    for (String aluno : alunos) {
      log = "Matricula: " + matricula + " Aluno: " + aluno + "\n";
      matricula++;
      System.out.println(log);
    }
  }
}