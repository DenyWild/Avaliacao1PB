package questao8;

import java.util.Calendar;
import java.util.Scanner;

public class questao8Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Calendar cal = Calendar.getInstance();
		int hora = cal.get(Calendar.HOUR_OF_DAY);

		questao8Complemento[] comp = new questao8Complemento[3];

//VARIAVEIS PARA RECEBER O USUARIO E A SENHA
		String aux1;
		String aux2;
//ARRAYS CONTENDO O CADASTRO
		comp[0] = new questao8Complemento("joana", "1234");
		comp[1] = new questao8Complemento("compasso", "estagio");
		comp[2] = new questao8Complemento("denys", "4321");

		System.out.println("Por favor nos informe seu usuario e senha para login");
		System.out.println("Usuario: ");
		aux1 = input.nextLine();
		System.out.println("Senha: ");
		aux2 = input.nextLine();
		validacaoLogin(aux1, aux2, comp, hora);

	}

	public static void validacaoLogin(String aux1, String aux2, questao8Complemento[] comp, int hora) {

		for (int i = 0; i <= comp.length; i++) {

			if (i == 3) {
				System.out.println("Usuário e/ou senha incorretos.");
				i--;
				break;
			}
			if (aux1.equalsIgnoreCase(comp[i].getUsuario()) && aux2.equalsIgnoreCase(comp[i].getSenha())) {
				horaDoDia(hora);
				break;
			}

		}
	}

	public static void horaDoDia(int hora) {

		if (hora >= 6 && hora < 12) {
			System.out.println("Bom dia, você se logou ao nosso sistema.");
		}
		if (hora >= 12 && hora < 18) {
			System.out.println("Boa tarde, você se logou ao nosso sistema.");
		}
		if (hora >= 18 && hora < 0) {
			System.out.println("Boa noite, você se logou ao nosso sistema.");
		}
		if (hora >= 0 && hora < 6) {
			System.out.println("Boa Madrugada, você se logou ao nosso sistema.");
		}

	}
}
