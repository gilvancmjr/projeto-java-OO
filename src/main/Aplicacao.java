package main;

import java.util.ArrayList;
import java.util.List;

import model.Funcionario;
import model.Gerente;
import model.Secretario;
import model.Venda;
import model.Vendedor;

public class Aplicacao {

	public static void main(String args[]) {

		// Vendas
		Venda vendaI = new Venda("12/2021", 5200.00);
		Venda vendaII = new Venda("01/2022", 4000.00);
		Venda vendaIII = new Venda("02/2022", 4200.00);
		Venda vendaIV = new Venda("03/2022", 5850.00);
		Venda vendaV = new Venda("04/2022", 7000.00);
		Venda vendaVI = new Venda("12/2021", 3400.00);
		Venda vendaVII = new Venda("01/2022", 7700.00);
		Venda vendaVIII = new Venda("02/2022", 5000.00);
		Venda vendaIX = new Venda("03/2022", 5900.00);
		Venda vendaX = new Venda("04/2022", 6500.00);

		// Vendedores
		Vendedor vendedorI = new Vendedor("Ana Silva", "12/2021");
		vendedorI.getVendas().add(vendaI);
		vendedorI.getVendas().add(vendaII);
		vendedorI.getVendas().add(vendaIII);
		vendedorI.getVendas().add(vendaIV);
		vendedorI.getVendas().add(vendaV);

		Vendedor vendedorII = new Vendedor("João Mendes", "12/2021");
		vendedorII.getVendas().add(vendaVI);
		vendedorII.getVendas().add(vendaVII);
		vendedorII.getVendas().add(vendaVIII);
		vendedorII.getVendas().add(vendaIX);
		vendedorII.getVendas().add(vendaX);

		// Secretarios
		Secretario secretarioI = new Secretario("Jorge Carvalho", "01/2018");
		Secretario secretarioII = new Secretario("Maria Souza", "12/2015");

		// Gerentes
		Gerente gerenteI = new Gerente("Juliana Alves", "07/2017");
		Gerente gerenteII = new Gerente("Bento Albino", "03/2014");

		List<Funcionario> funcionarios = new ArrayList<>();
		funcionarios.add(vendedorI);
		funcionarios.add(vendedorII);
		funcionarios.add(secretarioI);
		funcionarios.add(secretarioII);
		funcionarios.add(gerenteI);
		funcionarios.add(gerenteII);

		List<Vendedor> vendedors = new ArrayList<>();
		vendedors.add(vendedorI);
		vendedors.add(vendedorII);

		System.out.println("Total Gasto com salario e beneficios : "
				+ Funcionario.calcularValorTotalPagoSalarioBeneficio(funcionarios, "01/2022"));

		System.out.println(
				"Total Gasto com salario: " + Funcionario.calcularValorTotalPagoSalario(funcionarios, "01/2022"));

		System.out.println(
				"Total Gasto com beneficios: " + Funcionario.calcularValorTotalPagoBeneficio(funcionarios, "01/2022"));

		System.out.println("Maior valor pago: "
				+ Funcionario.encontrarMaiorValorTotalPagoSalarioBeneficio(funcionarios, "01/2022"));

		System.out.println("Funcionario com maior valor de beneficio pago: "
				+ Funcionario.encontrarNomeDoFuncionarioValorTotalPagoBeneficio(funcionarios, "01/2022"));

		System.out.println("Vendedor com maior valor vedido: "
				+ Funcionario.encontrarMaiorValorVendido(vendedors, "12/2021").getNome());
	}

}
