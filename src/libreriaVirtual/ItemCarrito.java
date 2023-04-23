package libreriaVirtual;

public class ItemCarrito {
	ProductoLibreria producto;
	int cantidad;
	
	
	public ItemCarrito(ProductoLibreria producto, int cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}
	
	public void mostrarItem() {
		System.out.println("Producto: " + producto.getTipo() + " - cantidad: " + cantidad);
		
		if(producto.cantidad >= cantidad) {
			System.out.println("Total : " + producto.getPrecioVenta());
		}else {
			System.out.println("No hay stock disponible");
		}
	}
	

}
