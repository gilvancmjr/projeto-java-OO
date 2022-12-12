package model;

import java.util.List;

import util.FormataPeriodo;

public abstract class Funcionario {

	private String nome;

	private String periodoContratacao;

	public Funcionario() {

	}

	public Funcionario(String nome, String periodoContratacao) {

		this.nome = nome;
		this.periodoContratacao = periodoContratacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPeriodoContratacao() {
		return periodoContratacao;
	}

	public void setPeriodoContratacao(String periodoContratacao) {
		this.periodoContratacao = periodoContratacao;
	}

	public abstract Double getSalario(String periodoSalario);

	public abstract Double getBeneficio(String periodoBeneficio);

	public static Double calcularValorTotalPagoSalarioBeneficio(List<Funcionario> funcionarios, String periodo) {

		Double valorTotal = 0.0;

		for (Funcionario funcionario : funcionarios) {

			valorTotal += funcionario.getSalario(periodo);
			valorTotal += funcionario.getBeneficio(periodo);

		}

		return valorTotal;

	};

	public static Double calcularValorTotalPagoSalario(List<Funcionario> funcionarios, String periodo) {

		Double valorTotal = 0.0;

		for (Funcionario funcionario : funcionarios) {
			valorTotal += funcionario.getSalario(periodo);
		}
		return valorTotal;
	};

	public static Double calcularValorTotalPagoBeneficio(List<Funcionario> funcionarios, String periodo) {

		Double valorTotal = 0.0;

		for (Funcionario funcionario : funcionarios) {
			valorTotal += funcionario.getBeneficio(periodo);
		}
		return valorTotal;

	};

	public static Double encontrarMaiorValorTotalPagoSalarioBeneficio(List<Funcionario> funcionarios, String periodo) {

		Double maiorValorTotal = 0.0;

		for (Funcionario funcionario : funcionarios) {
			Double valorTotal = funcionario.getBeneficio(periodo) + funcionario.getSalario(periodo);
			if (maiorValorTotal < valorTotal) {
				maiorValorTotal = valorTotal;
			}
		}
		return maiorValorTotal;

	};

	public static String encontrarNomeDoFuncionarioValorTotalPagoBeneficio(List<Funcionario> funcionarios,
			String periodo) {

		String nomeFuncionario = "";
		Double maiorValorTotal = 0.0;

		for (Funcionario funcionario : funcionarios) {
			Double valorTotal = funcionario.getBeneficio(periodo);
			if (maiorValorTotal < valorTotal) {
				nomeFuncionario = funcionario.nome;
				maiorValorTotal = valorTotal;
			}
		}
		return nomeFuncionario;

	};

	public static Vendedor encontrarMaiorValorVendido(List<Vendedor> vendedors, String periodo) {

		int anoConsulta = FormataPeriodo.formataPeriodoEmAno(periodo);
		int mesConsulta = FormataPeriodo.formataPeriodoEmMes(periodo);
		Double maiorVenda = 0.0;
		Vendedor vendedorMaiorValorVenda = new Vendedor();
		for (Vendedor vendedor : vendedors) {

			for (Venda venda : vendedor.getVendas()) {
				int anoVenda = FormataPeriodo.formataPeriodoEmAno(venda.getPeriodo());
				int mesVenda = FormataPeriodo.formataPeriodoEmMes(venda.getPeriodo());
				if (anoVenda == anoConsulta && mesVenda == mesConsulta) {
					if (maiorVenda < venda.getValor()) {
						maiorVenda = venda.getValor();
						vendedorMaiorValorVenda = vendedor;
					}

				}
			}

		}

		return vendedorMaiorValorVenda;
	};

}
