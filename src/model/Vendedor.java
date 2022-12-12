package model;

import java.util.ArrayList;
import java.util.List;

import util.FormataPeriodo;
import util.Tempo;

public class Vendedor extends Funcionario {

	private List<Venda> vendas = new ArrayList<>();

	public Vendedor() {
		super();
	}

	public List<Venda> getVendas() {
		return vendas;
	}

	public void setVendas(List<Venda> vendas) {
		this.vendas = vendas;
	}

	public Vendedor(String nome, String periodoContratacao) {
		super(nome, periodoContratacao);
	}

	@Override
	public Double getSalario(String periodoSalario) {

		int tempoServico = Tempo.tempoServicoAno(super.getPeriodoContratacao(), periodoSalario);

		Double salario = 12000.00 + (1800 * tempoServico);

		return salario;
	}

	@Override
	public Double getBeneficio(String periodoBeneficio) {

		int anoBeneficio = FormataPeriodo.formataPeriodoEmAno(periodoBeneficio);
		int mesBeneficio = FormataPeriodo.formataPeriodoEmMes(periodoBeneficio);

		for (Venda venda : this.vendas) {
			int anoVenda =  FormataPeriodo.formataPeriodoEmAno(venda.getPeriodo());
			int mesVenda =  FormataPeriodo.formataPeriodoEmMes(venda.getPeriodo());

			if (anoVenda == anoBeneficio && mesVenda == mesBeneficio) {
				double beneficio = venda.getValor() * 0.3;
				return beneficio;

			}
		}
		return 0.0;
	}

}
