package libreriaVirtual;

import java.time.LocalDate;

public class Libro extends ProductoLibreria {
    private String titulo;
    private String autorPrincipal;
    private String editorial ;
    private double precio;
    

    public Libro(LocalDate fechaDePublicacion, String titulo, String autorPrincipal, String editorial,  int codigo, double precio, String tipo, int cantidad) {
        super(fechaDePublicacion, codigo, tipo, cantidad);
        this.titulo = titulo;
        this.autorPrincipal = autorPrincipal;
        this.editorial = editorial;
        this.setPrecio(precio);
        
        
        
    }

   
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutorPrincipal() {
        return autorPrincipal;
    }

    public void setAutorPrincipal(String autorPrincipal) {
        this.autorPrincipal = autorPrincipal;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}
    

	@Override
	public double getPrecioVenta() {
		// TODO Auto-generated method stub
		double precioVenta = this.getPrecio();
		if(this.getTipo().equals("fisico")) {
			precioVenta *=1.18;
		}else if(this.getTipo().equals("digital")) {
			precioVenta *= 1.08;
		}
		return precioVenta;
	}


	@Override
	public String toString() {
		return "Libro || título: " + titulo + ", autor principal: " + autorPrincipal + ", editorial: " + editorial + ", "
				+ "precio de venta: $"+ getPrecioVenta()+ " cantidad: "+cantidad + ", codigo: "+getCodigo();
	}

	
}
