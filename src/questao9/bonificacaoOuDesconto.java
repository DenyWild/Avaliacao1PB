package questao9;

public class bonificacaoOuDesconto {

	private double bonificacao;
	private double desconto;
	private double salarioLiquido;

	public bonificacaoOuDesconto(double bonificacao, double desconto, double salarioLiquido) {
		super();
		this.bonificacao = bonificacao;
		this.desconto = desconto;
		this.salarioLiquido = salarioLiquido;
	}

	public double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public double getSalarioLiquido() {
		return salarioLiquido;
	}

	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}
	//
	public static void bonificaOuDesconta(funcionarios[] func, bonificacaoOuDesconto[] bondesc) {
		for (int i = 0; i < func.length; i++) {
			if (func[i].getSalario() <= 1000) {
				double calculo = func[i].getSalario() * 0.2;
				double salarioLiquido = func[i].getSalario() + calculo;
				bondesc[i] = new bonificacaoOuDesconto(calculo, 0, salarioLiquido);
			}
			if (func[i].getSalario() > 1000 && func[i].getSalario() < 2000) {
				double calculo = func[i].getSalario() * 0.1;
				double salarioLiquido = func[i].getSalario() + calculo;
				bondesc[i] = new bonificacaoOuDesconto(calculo, 0, salarioLiquido);

			} else if (func[i].getSalario() >= 2000) {
				double calculo = (func[i].getSalario() * 0.1);
				double salarioLiquido = func[i].getSalario() - calculo;
				bondesc[i] = new bonificacaoOuDesconto(0, calculo, salarioLiquido);
			}
		}
	}

}
