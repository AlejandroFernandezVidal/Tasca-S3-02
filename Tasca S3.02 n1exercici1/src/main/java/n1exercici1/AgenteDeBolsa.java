package n1exercici1;

import java.util.ArrayList;
import java.util.List;


public class AgenteDeBolsa {
	
	private static AgenteDeBolsa agenteDeBolsa;
	private List<AgenciaDeBolsa> agencias;
	
	private AgenteDeBolsa() {
		this.agencias = new ArrayList<AgenciaDeBolsa>();
	}
	
	//creamos el agente de bolsa y una vez creado devuelve el mismo ya que el enunciado habla de un agente de bolsa(Singleton).
	public static AgenteDeBolsa getAgenteDeBolsa() {
		if (agenteDeBolsa == null) {
			return agenteDeBolsa = new AgenteDeBolsa();
		}
		return agenteDeBolsa;
	}
	
	//método para añadir agencia al agente de bolsa.
	public void añadirAgencia(AgenciaDeBolsa a) {
		this.agencias.add(a);
	}
	
	//método para notificar a las agencias de un cambio en el estado de la bolsa.
	public void notificarEstadoBolsa(String estado) {
		for(AgenciaDeBolsa agencia : agencias) {
			agencia.actualizar(estado);
		}
	}
}