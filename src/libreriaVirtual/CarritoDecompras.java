package libreriaVirtual;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;


 class CarritoDecompras {

	private List<ProductoLibreria>items;
	
	
	public CarritoDecompras() {
         this.items = new ArrayList<ProductoLibreria>();		
		
	}
	
	public void agregarItem(ProductoLibreria producto) {
		this.items.add(producto);
	}
	
	
	public void quitarItem() {
		Scanner leer = new Scanner(System.in);
		Iterator<ProductoLibreria> it = items.iterator();
		System.out.println("Ingrese el código del libro que desea eliminar");
		int prodEliminado=leer.nextInt();
		while (it.hasNext()) {
			
			
			if (it.next().getCodigo()==prodEliminado) {
				
				it.remove();
			}
			
		}
	}


	public void mostrarCarrito() {
		System.out.println(items.size());
    	if(items.isEmpty()) {
        	System.out.println("No hay productos en el carrito");
    	} else {
        	System.out.println("Productos en el carrito:");
        	for (ProductoLibreria producto : items) {
            	System.out.println(producto.toString());
        	}
    	}
	}
	
	public void consultarPrecio() {
		Double precio=0d;
		
		for (ProductoLibreria productoLibreria : items) {
			precio = precio + productoLibreria.getPrecioVenta();
		}
		
		System.out.println("El total a abonar es de: $"+precio);
	}
	
	
}
