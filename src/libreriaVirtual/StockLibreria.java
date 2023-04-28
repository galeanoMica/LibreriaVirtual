package libreriaVirtual;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import libreriaVirtual.CarritoDecompras;



public class StockLibreria {

public ArrayList<ProductoLibreria>Stock;
public CarritoDecompras carrito;

	
	public StockLibreria() {
        this.Stock = new ArrayList<ProductoLibreria>();
        this.carrito = new CarritoDecompras();		
		
	}

public void agregarStock() {
	LocalDate fechaPublicacionPrincipito = LocalDate.of(1943, 04, 06);
	LocalDate fechaPublicacionVogueMes= LocalDate.of(2023, 04, 02);
	LocalDate fechaPublicacionElSilmarillion = LocalDate.of(1977, 9, 15);
	LocalDate fechaPublicacionWeekend = LocalDate.of(2000, 7, 15);

	Libro elPrincipitoDigital = new Libro(fechaPublicacionPrincipito,"El Principito - Digital", "Antoine de Saint-Exupéry", "Salamandra", 001, 800, "digital", 3);

	Libro elPrincipitoFisico = new Libro(fechaPublicacionPrincipito,"El Principito - Fisico", "Antoine de Saint-Exupéry", "Salamandra", 002, 800, "fisico", 3);

	Revista vogueDigital = new Revista(fechaPublicacionVogueMes,"Vogue - Digital", "Ediciones Condé Nast", 003, 400, "digital", 2);

	Revista vogueFisico = new Revista(fechaPublicacionVogueMes,"Vogue - Fisico", "Ediciones Condé Nast", 004, 400, "fisico", 2);
	
	Libro elSilmarillionFisico = new Libro(fechaPublicacionElSilmarillion, "El Silmarillion - Fisico", "J. R. R. Tolkien", "Minotauro", 005, 1000, "fisico", 2);
	
	Libro elSilmarillionDigital = new Libro(fechaPublicacionElSilmarillion, "El Silmarillion - Digital", "J. R. R. Tolkien", "Minotauro", 006, 1000, "digital", 2);
	
	Revista weekendDigital = new Revista(fechaPublicacionWeekend,"Weekend - Digital", "Perfil", 007, 200, "digital", 4);
	
	Revista weekendFisico = new Revista(fechaPublicacionWeekend,"Weekend - Fisico", "Perfil", 8, 200, "fisico", 3);
	
	Stock.add(elPrincipitoDigital);
	Stock.add(elPrincipitoFisico);
	Stock.add(vogueFisico);
	Stock.add(vogueDigital);
	Stock.add(elSilmarillionDigital);
	Stock.add(elSilmarillionFisico);
	Stock.add(weekendFisico);
	Stock.add(weekendDigital);
}

public void mostrarStock() {
	for (ProductoLibreria productoLibreria : Stock) {
		System.out.println(productoLibreria);
	}

}




public void stockFisicoLibro(CarritoDecompras carrito) {
    ArrayList<Libro> librosFisicoDisponibles = new ArrayList<>();
    
    int i = 1;
    for (ProductoLibreria productoLibreria : Stock) {
        String fisico = productoLibreria.getTipo();
        if (fisico.equals("fisico")) {
            if (productoLibreria instanceof Libro) {
                System.out.println(i + ". " + productoLibreria);
                librosFisicoDisponibles.add((Libro) productoLibreria);
                int resta=1;
                productoLibreria.cantidad= productoLibreria.cantidad - resta;
                i++;
            }
        }
    }
    Scanner scanner = new Scanner(System.in);
    System.out.print("Seleccione el número del libro que desea guardar: ");
    int seleccion = scanner.nextInt();
    Libro libroSeleccionado = librosFisicoDisponibles.get(seleccion - 1);
	//CarritoDecompras carrito = new CarritoDecompras();  instancie un carrito para ver si funcionaba, pero por ahora no
	carrito.agregarItem(libroSeleccionado);
   
    System.out.println("Usted eligio el libro " + libroSeleccionado);
}


public void stockDigitalLibro(CarritoDecompras carrito) {
	ArrayList<Libro> librosDigitalDisponibles = new ArrayList<>();
    int i = 1;
    for (ProductoLibreria productoLibreria : Stock) {
        String fisico = productoLibreria.getTipo();
        if (fisico.equals("digital")) {
            if (productoLibreria instanceof Libro) {
                System.out.println(i + ". " + productoLibreria);
                librosDigitalDisponibles.add((Libro) productoLibreria);
              System.out.println(librosDigitalDisponibles.size());
              int resta=1;
                productoLibreria.cantidad= productoLibreria.cantidad - resta;
                i++;
            }
        }
    }
    Scanner scanner = new Scanner(System.in);
    System.out.print("Seleccione el número del libro que desea guardar: ");
    int seleccion = scanner.nextInt();
    Libro libroSeleccionado = librosDigitalDisponibles.get(seleccion - 1);
	carrito.agregarItem(libroSeleccionado);
    System.out.println("Usted eligio el libro " + libroSeleccionado);
	
}

public void stockFisicoRevista(CarritoDecompras carrito) {
	ArrayList<Revista> revistaFisicoDisponibles = new ArrayList<>();
    int i = 1;
    for (ProductoLibreria productoLibreria : Stock) {
        String fisico = productoLibreria.getTipo();
        if (fisico.equals("fisico")) {
            if (productoLibreria instanceof Revista) {
                System.out.println(i + ". " + productoLibreria);
                revistaFisicoDisponibles.add((Revista) productoLibreria);
                int resta=1;
                productoLibreria.cantidad= productoLibreria.cantidad - resta;
                i++;
            }
        }
    }
    Scanner scanner = new Scanner(System.in);
    System.out.print("Seleccione el número del libro que desea guardar: ");
    int seleccion = scanner.nextInt();
    Revista revistaSeleccionado = revistaFisicoDisponibles.get(seleccion - 1);
	carrito.agregarItem(revistaSeleccionado);
    System.out.println("Usted eligio el libro " + revistaSeleccionado);
}


public void stockDigitalRevista(CarritoDecompras carrito) {
	ArrayList<Revista> revistaDigitalDisponibles = new ArrayList<>();
    int i = 1;
    for (ProductoLibreria productoLibreria : Stock) {
        String fisico = productoLibreria.getTipo();
        if (fisico.equals("digital")) {
            if (productoLibreria instanceof Revista) {
                System.out.println(i + ". " + productoLibreria);
                revistaDigitalDisponibles.add((Revista) productoLibreria);
                int resta=1;
                productoLibreria.cantidad= productoLibreria.cantidad - resta;
                i++;
            }
        }
    }
    Scanner scanner = new Scanner(System.in);
    System.out.print("Seleccione el número del libro que desea guardar: ");
    int seleccion = scanner.nextInt();
    Revista revistaSeleccionado = revistaDigitalDisponibles.get(seleccion - 1);
	carrito.agregarItem(revistaSeleccionado);
    System.out.println("Usted eligio el libro " + revistaSeleccionado);

	
}
}