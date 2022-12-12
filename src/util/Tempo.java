package util;

public abstract class Tempo {

	public static int tempoServicoAno(String periodoInicial, String periodoFinal) {

		int mesInicial = Integer.parseInt(periodoInicial.substring(0, 2));
		int anoInicial = Integer.parseInt(periodoInicial.substring(3, 7));
		int mesFinal = Integer.parseInt(periodoFinal.substring(0, 2));
		int anoFinal = Integer.parseInt(periodoFinal.substring(3, 7));

		if (anoFinal < anoInicial) {
			return 0;
		} else {

			int inicio = anoInicial + mesInicial / 12;
			int fim = anoFinal + mesFinal / 12;

			return  fim - inicio;
		}

	}

}
