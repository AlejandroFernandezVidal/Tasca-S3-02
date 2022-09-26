package n2exercici1;

public class TiendaDeZapatos {

	public static void main(String[] args) {

		PasarelaDePago factura;

		ModoDePago tarjeta = new TarjetaDeCredito();
		ModoDePago paypal = new Paypal();
		ModoDePago reciboBancario = new ReciboBancario();

		factura = new PasarelaDePago(tarjeta);

		factura = new PasarelaDePago(paypal);

		factura = new PasarelaDePago(reciboBancario);
	}
}