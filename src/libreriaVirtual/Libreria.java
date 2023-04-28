package libreriaVirtual;



public final class Libreria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MenuCompras menuCompras = new MenuCompras();
		
		StockLibreria stockLibreria= new StockLibreria();
		CarritoDecompras carritoCompras = new CarritoDecompras();
		
		menuCompras.Menu(stockLibreria,carritoCompras);
		System.out.println();

	}

}
