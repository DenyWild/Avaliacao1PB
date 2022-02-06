package questao9;

import java.util.Scanner;

public class questao9Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Scanner entrada = new Scanner(System.in);
		// TODO Auto-generated method stub
		String nome;
		double salario;

		int numerodefuncionarios = 0;

		System.out.println("Por favor, informe a quantidade de funcionários a serem cadastrados: ");
		numerodefuncionarios = input.nextInt();

		Funcionarios[] funcionarios = new Funcionarios[numerodefuncionarios];
		BonificacaoOuDesconto[] bonificacaooudesconto = new BonificacaoOuDesconto[numerodefuncionarios];

		for (int posicao = 0; posicao < numerodefuncionarios; posicao++) {
			System.out.println("Por favor, nos informe seu nome: ");
			nome = entrada.nextLine();

			System.out.println("Por favor, nos informe seu salario: ");
			salario = input.nextDouble();
			funcionarios[posicao] = new Funcionarios(nome, salario);

		}

		BonificacaoOuDesconto.bonificaOuDesconta(funcionarios, bonificacaooudesconto);

		Funcionarios.imprimirFuncionariosInfo(funcionarios, bonificacaooudesconto);
	}

}
