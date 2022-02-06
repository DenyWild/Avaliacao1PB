package questao8;

public class Login {

	private String usuario;
	private String senha;

	public Login(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public static void validacaoDoLogin(String campoUsuario, String campoSenha, Login[] login, int horaAtual) {

		for (int posicao = 0; posicao <= login.length; posicao++) {

			if (posicao == login.length) {
				System.out.println("Usuário e/ou senha incorretos.");
				posicao--;
				break;
			}
			if (campoUsuario.equalsIgnoreCase(login[posicao].getUsuario())
					&& campoSenha.equalsIgnoreCase(login[posicao].getSenha())) {
				horaDoDia(horaAtual);
				break;
			}

		}
	}

	public static void horaDoDia(int horaAtual) {

		if (horaAtual >= 6 && horaAtual < 12) {
			System.out.println("Bom dia, você se logou ao nosso sistema.");
		} else if (horaAtual >= 12 && horaAtual < 18) {
			System.out.println("Boa tarde, você se logou ao nosso sistema.");
		} else if (horaAtual >= 18 && horaAtual < 24) {
			System.out.println("Boa noite, você se logou ao nosso sistema.");
		} else if (horaAtual >= 0 && horaAtual < 6) {
			System.out.println("Boa Madrugada, você se logou ao nosso sistema.");
		}

	}

}
