package n1exercici1;

public class Main {

	public static void main(String[] args) {

		//Instanciamos objeto bolsa para poder modificar su estado mediante método Set.
		Bolsa bolsa = new Bolsa();

		//Instanciamos las agencias.
		AgenciaDeBolsa agencia = new AgenciaDeBolsa1();
		AgenciaDeBolsa agencia1 = new AgenciaDeBolsa2();

		//Añadimos agencias al agente de bolsa.
		AgenteDeBolsa.getAgenteDeBolsa().añadirAgencia(agencia);
		AgenteDeBolsa.getAgenteDeBolsa().añadirAgencia(agencia1);

		
		//Cambiamos el estado de la bolsa para comprobar la correcta funcionalidad.
		bolsa.setEstado("Sube");

		bolsa.setEstado("Baja");

	}
}