package model;

public class Venda {

	private String periodo;

	private Double valor;

	public Venda(String periodo, Double valor) {
		this.periodo = periodo;
		this.valor = valor;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
