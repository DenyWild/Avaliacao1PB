package questao9;

public class funcionarios {

	private String nome;
	private double salario;

	public funcionarios(String nome, double salario) {
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

	public static void imprimirFuncionarios(funcionarios[] func, bonificacaoOuDesconto[] bondesc) {
		for (int i = 0; i < func.length; i++) {
			System.out.println("Funcionário: " + func[i].getNome().toString());
			System.out.println("Salário: " + func[i].getSalario());
			if (bondesc[i].getBonificacao() > 0) {
				System.out.println("Bonus: " + bondesc[i].getBonificacao());
				System.out.println("Salario Líquido: " + bondesc[i].getSalarioLiquido() + "\n");

			} else if (bondesc[i].getBonificacao() <= 0) {
				System.out.println("Desconto: " + bondesc[i].getDesconto());
				System.out.println("Salario Líquido: " + bondesc[i].getSalarioLiquido() + "\n");

			}
		}
	}
}
