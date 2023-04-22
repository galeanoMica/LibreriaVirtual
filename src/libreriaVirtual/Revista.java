package libreriaVirtual;

public class Revista extends ProductosDeLibreria {
    
    private String nombre;
    private String editor ;

    public Revista(String nombre, String editor, LocalDate fechaDepublicacion, int codigo, Tipo tipo) {
        super(fechaDepublicacion, codigo, tipo);
        this.nombre = nombre;
        this.editor = editor;
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
}
