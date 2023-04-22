package libreriaVirtual;

import java.time.LocalDate;

private LocalDate fechaDepublicacion ;
private int codigo ;
private Tipo tipo;

public ProductosDeLibreria(LocalDate fechaDepublicacion, int codigo, Tipo tipo) {
	this.fechaDepublicacion = fechaDepublicacion;
	this.codigo = codigo;
	this.tipo = tipo;
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

public Tipo getTipo() {
	return tipo;
}

public void setTipo(Tipo tipo) {
	this.tipo = tipo;
}
	
}
