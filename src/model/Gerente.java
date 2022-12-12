package model;

import util.Tempo;

public class Gerente extends Funcionario {

	public Gerente(String nome, String periodoContratacao) {
		super(nome, periodoContratacao);

	}

	@Override
	public Double getSalario(String periodoSalario) {
		int tempoServico = Tempo.tempoServicoAno(super.getPeriodoContratacao(), periodoSalario);

		Double salario = 20000.00 + (3000.00 * tempoServico);

		return salario;

	}

	@Override
	public Double getBeneficio(String periodoBeneficio) {
		return 0.0;
	}

}
