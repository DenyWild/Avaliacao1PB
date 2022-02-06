package questao8;

import java.util.Calendar;
import java.util.Scanner;

public class questao8Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Calendar cal = Calendar.getInstance();
		int hora = cal.get(Calendar.HOUR_OF_DAY);

		Login[] login = new Login[3];

//VARIAVEIS PARA RECEBER O USUARIO E A SENHA
		String loginUsuario;
		String loginSenha;
//ARRAYS CONTENDO O CADASTRO
		login[0] = new Login("joana", "1234");
		login[1] = new Login("compasso", "estagio");
		login[2] = new Login("denys", "4321");

		System.out.println("Por favor nos informe seu usuario e senha para login");
		System.out.println("Usuario: ");
		loginUsuario = input.nextLine();
		System.out.println("Senha: ");
		loginSenha = input.nextLine();

		Login.validacaoLogin(loginUsuario, loginSenha, login, hora);

	}

}
