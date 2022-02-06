package questao8;

import java.util.Calendar;
import java.util.Scanner;

public class questao8Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Calendar calendario = Calendar.getInstance();
		int horaAtual = calendario.get(Calendar.HOUR_OF_DAY);

		Login[] login = new Login[3];

//VARIAVEIS PARA RECEBER O USUARIO E A SENHA
		String campoUsuario;
		String campoSenha;
//ARRAYS CONTENDO O CADASTRO
		login[0] = new Login("tranquilidade", "1234");
		login[1] = new Login("vamo", "nacalma");
		login[2] = new Login("denys", "4321");

		System.out.println("Por favor, nos informe seu usuario e senha para login");
		System.out.println("Usuario: ");
		campoUsuario = input.nextLine();
		System.out.println("Senha: ");
		campoSenha = input.nextLine();

		Login.validacaoDoLogin(campoUsuario, campoSenha, login, horaAtual);

	}

}
