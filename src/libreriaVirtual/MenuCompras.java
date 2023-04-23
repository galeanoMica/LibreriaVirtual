package libreriaVirtual;

import java.util.Scanner;

public class MenuCompras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		
		String opcion = leer.next();
		
		System.out.println("Bienvenido al menú de compras");
		System.out.println("1 - Consultar stock");
		System.out.println("2 - Añadir producto al carrito de compras");
		System.out.println("3 - Mostrar productos añadidos al carrito de compras");
		System.out.println("4 - Eliminar producto del carrito de compras");
		System.out.println("5 - Consultar total a abonar");
		System.out.println("6 - Salir");
		System.out.println("Para acceder a las opciones, ingrese el número correspondiente a ella"
				+ " (ej: para consultar stock, ingrese el número 1)");
		
		do {
			switch (opcion) {
			case "1":
				
				break;
			case "2":
				
				break;
			case "3":
			
				break;
			case "4":
				
				break;
			case "5":
				
				break;
			case "6":
				
				break;

			default:
				System.out.println("La opción seleccionada no es correcta, intentelo nuevamente.");
				break;
			}
		} while (opcion.equals("6"));
		
		
	}
}
