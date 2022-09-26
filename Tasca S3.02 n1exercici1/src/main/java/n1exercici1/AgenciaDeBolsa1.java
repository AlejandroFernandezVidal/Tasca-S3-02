package n1exercici1;

public class AgenciaDeBolsa1 implements AgenciaDeBolsa {

	@Override
	public void actualizar(String estado) {

		String salidaPantalla;

		if (estado.equalsIgnoreCase("SUBE")) {
			salidaPantalla = "Acaban de informar de una subida en bolsa.";
		} else if (estado.equalsIgnoreCase("BAJA")) {
			salidaPantalla = "Acaban de informar de una bajada en bolsa.";
		} else {
			salidaPantalla = "La información es incorrcta.";
		}

		System.out.println(salidaPantalla);
	}
}