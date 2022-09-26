package n2exercici1;

public class Paypal implements ModoDePago {

	@Override
	public void pagarCompra() {
		System.out.println("Pagado mediante Paypal.");
	}
}