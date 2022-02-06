package questao9;

public class Funcionarios {

	private String nome;
	private double salario;

	public Funcionarios(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public static void imprimirFuncionariosInfo(Funcionarios[] funcionarios,
			BonificacaoOuDesconto[] bonificacaooudesconto) {
		for (int posicao = 0; posicao < funcionarios.length; posicao++) {
			
			System.out.println("Funcionário: "+ funcionarios[posicao].getNome().toString());
			System.out.printf(" %s %.2f %s", "Salário: ", funcionarios[posicao].getSalario(), "\n");
			if (bonificacaooudesconto[posicao].getBonificacao() > 0) {
				System.out.printf(" %s %.2f %s", "Bonus: ", bonificacaooudesconto[posicao].getBonificacao(), "\n");
				System.out.printf(" %s %.2f %s %s", "Salario Líquido: ",
						bonificacaooudesconto[posicao].getSalarioLiquido(), "\n", "\n");

			} else if (bonificacaooudesconto[posicao].getBonificacao() <= 0) {
				System.out.printf(" %s %.2f %s", "Desconto: ", bonificacaooudesconto[posicao].getDesconto(), "\n");
				System.out.printf(" %s %.2f %s %s", "Salario Líquido: ",
						bonificacaooudesconto[posicao].getSalarioLiquido(), "\n", "\n");

			}
		}
	}
}
