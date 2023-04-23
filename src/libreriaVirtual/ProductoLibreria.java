package libreriaVirtual;

import java.time.LocalDate;

public abstract class ProductoLibreria {
	
	private LocalDate fechaDepublicacion ;
	private int codigo ;
	private String tipo;
	public int cantidad;
	
	

public ProductoLibreria(LocalDate fechaDepublicacion, int codigo, String tipo, int cantidad) {
	this.fechaDepublicacion = fechaDepublicacion;
	this.codigo = codigo;
	this.setTipo(tipo);
	this.cantidad = cantidad;
	
	
}

public int getCantidad() {
	return cantidad;
}

public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}

public LocalDate getFechaDepublicacion() {
	return fechaDepublicacion;
}

public void setFechaDepublicacion(LocalDate fechaDepublicacion) {
	this.fechaDepublicacion = fechaDepublicacion;
}

public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public abstract double getPrecioVenta();

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}



	
}
