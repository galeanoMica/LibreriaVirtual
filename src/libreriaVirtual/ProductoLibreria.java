package libreriaVirtual;

import java.time.LocalDate;

public abstract class ProductoLibreria {
	
	private LocalDate fechaDepublicacion ;
	private int codigo ;
	private String tipo;
	
	

public ProductoLibreria(LocalDate fechaDepublicacion, int codigo, String tipo) {
	this.fechaDepublicacion = fechaDepublicacion;
	this.codigo = codigo;
	this.setTipo(tipo);
	
	
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
