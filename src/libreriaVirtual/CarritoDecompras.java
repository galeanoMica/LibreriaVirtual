package libreriaVirtual;

import java.util.ArrayList;


 class CarritoDecompras {

	private ArrayList<ItemCarrito>items;
	
	
	public CarritoDecompras() {
         this.items = new ArrayList<ItemCarrito>();		
		
	}
	
	public void agregarItem(ItemCarrito itemc) {
		this.items.add(itemc);
	}
	
	
	public void quitarItem(ItemCarrito itemc) {
		this.items.remove(itemc);
	}

	
	public void mostrarCarrito() {
		if(items.isEmpty()) {
			System.out.println("No hay productos en el carrito");
		
		} else {
			for (ItemCarrito i: items) {
				i.mostrarItem();
			}
		}
	}
	
}
