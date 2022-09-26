package n1exercici1;

public class Bolsa {

	private String estado;
	private static AgenteDeBolsa agenteDeBolsa;

	//método para obtener el esatdo de la bolsa si fuera necesario.
	public String getEstado() {
		return estado;
	}

	//método para cambiar el estado de la bolsa y a su vez avisar al agente de bolsa.
	public void setEstado(String estado) {
		this.estado = estado;
		//instanciamos el agente de bolsa y si ya existe al implemntar Singleton devuelve el mismo.
		agenteDeBolsa = AgenteDeBolsa.getAgenteDeBolsa();
		//método para notificar a las agencias mediante el agente de bolsa el esatdo de la misma.
		agenteDeBolsa.notificarEstadoBolsa(estado);
		
	}
}