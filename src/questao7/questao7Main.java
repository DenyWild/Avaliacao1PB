package questao7;

import java.util.Scanner;

public class questao7Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		perguntasERespostas[] quiz = new perguntasERespostas[5];

		int acertos = 0;
		int erros = 0;
		String nomeUsuario;
		String suaResposta;

		quiz[0] = new perguntasERespostas("Qual o tempo maximo em minutos que uma daily pode ter?", "15");
		quiz[1] = new perguntasERespostas("Quem representa o cliente dentro da equipe e � o dono da product backlog? "
				+ "\n" + "Por favor responder com o nome inteiro da fun��o", "product owner");
		quiz[2] = new perguntasERespostas("Qual time box ocupa 2,5% do total da sprint?", "review meeting");
		quiz[3] = new perguntasERespostas("No Scrum a equipe s� � formado por desenvolvedores e o product owner?" + "\n"
				+ "Responda com sim ou n�o", "nao");
		quiz[4] = new perguntasERespostas("Quanto equivale a planning meeting numa sprint dita em porcentagem?", "5");

		System.out.println("-----------------------------------------------------------");
		System.out.println("Digite o nome de usu�rio");
		nomeUsuario = input.nextLine();
		System.out.println("BEM VINDO, " + nomeUsuario.toUpperCase() + "! ESTE � UM QUIZ DE 5 PERGUNTAS SOBRE SCRUM");
		System.out.println("AO FINAL SER� INFORMADO SEUS ACERTOS E ERROS");
		System.out.println("-----------------------------------------------------------");
		for (int posicao = 0; posicao < quiz.length; posicao++) {

			System.out.println(quiz[posicao].getPerguntas());
			suaResposta = input.nextLine();

			if (suaResposta.equalsIgnoreCase(quiz[posicao].getRespostas())) {
				System.out.println("Voc� Acertou!!! \n");
				acertos++;
			} else {
				System.out.println("Voc� Errou! \n");
				erros++;
			}

		}

		System.out.println("PARAB�NS! VOC� CHEGOU AO FINAL DO QUIZ!");
		System.out.println("Usu�rio: " + nomeUsuario);
		System.out.println("Respostas certas: " + acertos + "");
		System.out.println("Respostas erradas: " + erros);

	}

}
