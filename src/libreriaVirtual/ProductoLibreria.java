package libreriaVirtual;

import java.time.LocalDate;

public class ProductoLibreria {
	private LocalDate fechaPublicacion;
	private int codigo;
	
	public ProductoLibreria(LocalDate fechaPublicacion, int codigo) {
		this.fechaPublicacion = fechaPublicacion;
		this.codigo = codigo;
		
	}

	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(LocalDate fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
}
