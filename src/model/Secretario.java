package model;

import util.Tempo;

public class Secretario extends Funcionario {

	public Secretario(String nome, String periodoContratacao) {
		super(nome, periodoContratacao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getSalario(String periodoSalario) {

		int tempoServico = Tempo.tempoServicoAno(super.getPeriodoContratacao(), periodoSalario);

		Double salario = 7000.00 + (1000 * tempoServico);

		return salario;
	}

	@Override
	public Double getBeneficio(String periodoBeneficio) {

		Double beneficio = this.getSalario(periodoBeneficio)* 0.3;
		
		return beneficio;

	}

}
