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

		funcionarios[] func = new funcionarios[numerodefuncionarios];
		bonificacaoOuDesconto[] bondesc = new bonificacaoOuDesconto[numerodefuncionarios];

		for (int i = 0; i < numerodefuncionarios; i++) {
			System.out.println("Por favor, nos informe seu nome: ");
			nome = entrada.nextLine();

			System.out.println("Por favor, nos informe seu salario: ");
			salario = input.nextDouble();
			func[i] = new funcionarios(nome, salario);

		}
		//CHAMA A FUNÇÃO PARA FAZER OS CALCULOS
		bonificacaoOuDesconto.bonificaOuDesconta(func, bondesc);
		//CHAMA A FUNÇÃO PARA IMPRIMIR TODOS OS FUNCIONARIOS COM OS DEVIDOS VALORES
		funcionarios.imprimirFuncionarios(func, bondesc);
	}

}
