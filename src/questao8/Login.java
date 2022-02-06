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

	public static void validacaoDoLogin(String aux1, String aux2, Login[] comp, int hora) {

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
