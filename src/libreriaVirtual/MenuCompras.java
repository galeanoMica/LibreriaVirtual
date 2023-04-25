package libreriaVirtual;

import java.time.LocalDate;
import java.util.Scanner;

public class MenuCompras {
	Scanner leer = new Scanner(System.in);

	public void Menu () {
		// TODO Auto-generated method stub
		
		
		LocalDate fechaPublicacionPrincipito = LocalDate.of(1943, 04, 06);
		LocalDate fechaPublicacionVogueMes= LocalDate.of(2023, 04, 02);
		
		Libro elPrincipitoDigital = new Libro(fechaPublicacionPrincipito,"El Principito - Digital", "Antoine de Saint-Exupéry", "Salamandra", 001, 800, "digital", 3);
		
		Libro elPrincipitoFisico = new Libro(fechaPublicacionPrincipito,"El Principito - Fisico", "Antoine de Saint-Exupéry", "Salamandra", 002, 800, "fisico", 3);
		
		Revista vogueDigital = new Revista(fechaPublicacionVogueMes,"Vogue - Digital", "Ediciones Condé Nast", 003, 400, "digital", 2);
		
		Revista vogueFisico = new Revista(fechaPublicacionVogueMes,"Vogue - Fisico", "Ediciones Condé Nast", 004, 400, "fisico", 2);
		
		CarritoDecompras nuevoCarrito = new CarritoDecompras();
		
	    
		
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
				  Eleccion();

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

	public  int Eleccion (){
		System.out.println("elegir una opcion ");
		System.out.println("1_Libro");
		System.out.println("2_Revista ");
		int respuesta = leer.nextInt();
		if (respuesta== 1 ){
			System.out.println("su libro lo quiere en version");
			DigitalOFisico();
			return respuesta;
		} else{
			System.out.println("su revista lo quiere en version");
			DigitalOFisico();
			return respuesta ;
		}

	}

	public int DigitalOFisico(){
		System.out.println("1_digital");
		System.out.println("2_fisico");
		int res = leer.nextInt();
		return res;
	}
	
	public void TipoDeEleccion(int respuesta , int res ){
		 
		if (respuesta ==1 && res == 1 ){
			System.out.println("los libros digitales son:");
              ///agregar listas de libros digitales 
		}else if (respuesta ==1 && res==2){
			System.out.println("los libros fisicos son:");
			///agregar listas de libros fisicos
		}else if (respuesta == 2 && res==1 ){
			System.out.println("las revista digitales son ");
			///agregar listas de revista digitales 

		}else  if ( respuesta == 2 && res== 1 ){
			System.out.println("las revista fisica son");
            ///agregar listas de revista fisicas 
			
		}


	}



}
