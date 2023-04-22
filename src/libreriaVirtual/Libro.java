public class Libro extends ProductosDeLibreria {
    private String titulo;
    private String autorPrincipal;
    private String editorial ;
    
    

    public Libro(String titulo, String autorPrincipal, String editorial, LocalDate fechaDepublicacion, int codigo, Tipo tipo) {
        super(fechaDepublicacion, codigo, tipo);
        this.titulo = titulo;
        this.autorPrincipal = autorPrincipal;
        this.editorial = editorial;
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
    
}
