package n2exercici1;

public class PasarelaDePago {

	public PasarelaDePago(ModoDePago tipo) {
		System.out.println("Pagar factura mediante opcion seleccionada.");
		tipo.pagarCompra();
	}
}