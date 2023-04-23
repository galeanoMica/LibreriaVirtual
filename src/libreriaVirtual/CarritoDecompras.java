package libreriaVirtual;

import ar.edu.utn.ItemCarrito;

public class CarritoDecompras {

	private ArrayList<itemsCarrito>items;
	
	
	public CarritoDecompras() {
         this.items = new ArrayList<itemsCarrito>();		
		
	}
	
	public void agregarItem(ItemCarrito itemc) {
		this.items.add(itemsC);
	}
	
	
	public void quitarItem(ItemCarrito ic) {
		this.items.remove(ic);
	}

	
	public void mostrarCarrito() {
		if(items.isEmpty()) {
			system.out.printl("No hay productos en el carrito");
		
		} else {
			for (ItemCarrito i: items) {
				i.mostrarItem();
			}
		}
	}
	
}
