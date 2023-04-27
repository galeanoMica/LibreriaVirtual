package libreriaVirtual;

import java.util.List;
import java.util.ArrayList;


 class CarritoDecompras {

	private List<ProductoLibreria>items;
	
	
	public CarritoDecompras() {
         this.items = new ArrayList<ProductoLibreria>();		
		
	}
	
	public void agregarItem(ProductoLibreria producto) {
		this.items.add(producto);
	}
	
	
	public void quitarItem( ProductoLibreria producto) {
		this.items.remove(producto);
	}


	


	public void mostrarCarrito() {
    	if(items.isEmpty()) {
        	System.out.println("No hay productos en el carrito");
    	} else {
        	System.out.println("Productos en el carrito:");
        	for (ProductoLibreria producto : items) {
            	System.out.println(producto.toString());
        	}
    	}
	}
	
}
