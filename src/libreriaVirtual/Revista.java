package libreriaVirtual;

import java.time.LocalDate;

public class Revista extends ProductoLibreria {
    
    private String nombre;
    private String editor;
    private double precio;

    public Revista(LocalDate fechaDePublicacion, String nombre, String editor, int codigo, double precio, String tipo, int cantidad) {
        super(fechaDePublicacion, codigo, tipo, cantidad);
        this.nombre = nombre;
        this.editor = editor;
        this.setPrecio(precio);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
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
			precioVenta *=1.22;
		}else if(this.getTipo().equals("digital")) {
			precioVenta *= 1.12;
		}
		return precioVenta;	
	}
	
	@Override
	public String toString() {
		return "Revista || título: " + nombre + " , editor: " + editor + ", "
				+ "precio de venta: $"+ getPrecioVenta()+ " cantidad: "+cantidad;
	}
}
