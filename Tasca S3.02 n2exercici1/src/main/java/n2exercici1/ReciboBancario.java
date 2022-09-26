package n2exercici1;

public class ReciboBancario implements ModoDePago {

	@Override
	public void pagarCompra() {
		System.out.println("Pagado mediante recibo bancario.");
	}
}