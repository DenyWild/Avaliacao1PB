package questao7;

import java.util.Scanner;
import java.util.function.Function;

public class questao7Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		perguntasERespostas[] quiz = new perguntasERespostas[5];

		int certo = 0;
		int errado = 0;
		String nomeUsuario;
		String aux;

		quiz[0] = new perguntasERespostas("Qual o tempo maximo em minutos que uma daily pode ter?", "15");
		quiz[1] = new perguntasERespostas("Quem representa o cliente dentro da equipe e � o dono da product backlog? "
				+ "\n" + "Por favor responder com o nome inteiro da fun��o", "product owner");
		quiz[2] = new perguntasERespostas("Qual time-box ocupa 2,5% do total da sprint?", "5");
		quiz[3] = new perguntasERespostas(
				"No Scrum a equipe s� � formado por desenvolvedores e o product owner? Responda com sim ou n�o", "nao");
		quiz[4] = new perguntasERespostas("Quanto equivale a planning meeting numa sprint dita em porcentagem?", "5");

		System.out.println("-----------------------------------------------------------");
		System.out.println("Digite o nome de usu�rio");
		nomeUsuario = input.nextLine();
		System.out.println("BEM VINDO, " + nomeUsuario.toUpperCase() + "! ESTE � UM QUIZ DE 5 PERGUNTAS SOBRE SCRUM");
		System.out.println("AO FINAL SER� INFORMADO SEUS ACERTOS E ERROS");
		System.out.println("-----------------------------------------------------------");
		for (int i = 0; i < quiz.length; i++) {

			System.out.println(quiz[i].getPerguntas());
			aux = input.nextLine();

			if (aux.equalsIgnoreCase(quiz[i].getRespostas())) {
				System.out.println("Voc� Acertou!!!");
				certo++;
			} else {
				System.out.println("Voc� Errou!!!");
				errado++;
			}

		}

		System.out.println("PARABENS! VOC� CHEGOU AO FINAL DO QUIZ!");
		System.out.println("Usu�rio: " + nomeUsuario);
		System.out.println("Respostas Certas: " + certo);
		System.out.println("Respostas Erradas: " + errado);

	}

}
