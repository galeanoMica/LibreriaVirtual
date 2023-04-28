package libreriaVirtual;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class MenuCompras {
	StockLibreria stock = new StockLibreria();
	CarritoDecompras carritoCompras = new CarritoDecompras();
	
	
	
	public void Menu(StockLibreria stock, CarritoDecompras carrito) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		StockLibreria stockLibreria = stock;
		CarritoDecompras carritoCompras = carrito;
		
		stockLibreria.agregarStock();
		
		//CarritoDecompras nuevoCarrito = new CarritoDecompras();
		
		
		
		String opcion="0";
		
		
		do {
			System.out.println("Bienvenido al menú de compras");
		System.out.println("1 - Consultar stock");
		System.out.println("2 - Añadir producto al carrito de compras");
		System.out.println("3 - Mostrar productos añadidos al carrito de compras");
		System.out.println("4 - Eliminar producto del carrito de compras");
		System.out.println("5 - Consultar total a abonar");
		System.out.println("6 - Salir");
		System.out.println("Para acceder a las opciones, ingrese el número correspondiente a ella"
				+ " (ej: para consultar stock, ingrese el número 1)");
			opcion = leer.next();
			switch (opcion) {
			case "1":
				stockLibreria.mostrarStock();
				
				System.out.println();
			
				break;


			case "2":
			System.out.println("elegir una opcion ");
			System.out.println("1_Libro");
			System.out.println("2_Revista ");
			int respuesta = leer.nextInt();
			if (respuesta== 1 ){
				System.out.println("su libro lo quiere en version");
				System.out.println("1_digital");
				System.out.println("2_fisico");
			   int res = leer.nextInt();
			   if ( res == 1 ){
				System.out.println("los libros digitales son:");
				stock.stockDigitalLibro(carritoCompras);
				
			  }else if (res==2){
				System.out.println("los libros fisicos son:");
				stock.stockFisicoLibro(carritoCompras);
			  } else{
				System.out.println("la opcion no es correcta");
			  }
				
			} else if(respuesta==2 ) {
				System.out.println("su revista lo quiere en version");
				System.out.println("1_digital");
				System.out.println("2_fisico");
				int res = leer.nextInt();
			if ( res==1 ){
				System.out.println("las revista digitales son ");
				
				stock.stockDigitalRevista(carritoCompras);
				System.out.println();
			}else  if (  res== 2 ){
				System.out.println("las revista fisica son");
			   stock.stockFisicoRevista(carritoCompras);
				
			}else{
				System.out.println("la opcion no es correcta");
			  }
				
			}else{
				System.out.println("la opcion no es correcta");
			}
	
		
				break;



			case "3":
            System.out.println("_________________________________________________________________________");
            System.out.println("sus productos son" );
			
			carritoCompras.mostrarCarrito();
            System.out.println("__________________________________________________________________________");

			
				break;
			case "4":
             
				
				carritoCompras.quitarItem();
				
				break;
			case "5":

			carritoCompras.consultarPrecio();
				break;
			case "6":
		
				break;

			default:
				System.out.println("La opción seleccionada no es correcta, intentelo nuevamente.");
				break;
			}
		} while (!opcion.equals("6"));

		System.out.println("muchas gracias por usar  el menu de compras ");
	
	}

	
		

	

    
}

	

