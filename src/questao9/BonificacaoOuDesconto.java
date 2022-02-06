package questao9;

public class BonificacaoOuDesconto {

	private double bonificacao;
	private double desconto;
	private double salarioLiquido;

	public BonificacaoOuDesconto(double bonificacao, double desconto, double salarioLiquido) {
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

	public static void bonificaOuDesconta(Funcionarios[] funcionarios, BonificacaoOuDesconto[] bonificacaooudesconto) {
		for (int posicao = 0; posicao < funcionarios.length; posicao++) {
			if (funcionarios[posicao].getSalario() <= 1000) {
				double calculo20porCentoBonificacao = funcionarios[posicao].getSalario() * 0.2;
				double salarioLiquido = funcionarios[posicao].getSalario() + calculo20porCentoBonificacao;
				bonificacaooudesconto[posicao] = new BonificacaoOuDesconto(calculo20porCentoBonificacao, 0,
						salarioLiquido);
			}
			if (funcionarios[posicao].getSalario() > 1000 && funcionarios[posicao].getSalario() < 2000) {
				double calculo10porCentoBonificacao = funcionarios[posicao].getSalario() * 0.1;
				double salarioLiquido = funcionarios[posicao].getSalario() + calculo10porCentoBonificacao;
				bonificacaooudesconto[posicao] = new BonificacaoOuDesconto(calculo10porCentoBonificacao, 0,
						salarioLiquido);

			} else if (funcionarios[posicao].getSalario() >= 2000) {
				double calculo10porCentoDesconto = (funcionarios[posicao].getSalario() * 0.1);
				double salarioLiquido = funcionarios[posicao].getSalario() - calculo10porCentoDesconto;
				bonificacaooudesconto[posicao] = new BonificacaoOuDesconto(0, calculo10porCentoDesconto,
						salarioLiquido);
			}
		}
	}

}
