package biblioteca.unlam.edu.ar;

public class libro {
	private Integer codigo;
	private String nombre;
	private String autor;
	
	@Override
	public String toString() {
		return "libro [codigo=" + codigo + ", nombre=" + nombre + "]\n";
	}

	public libro(Integer codigo, String nombre, String autor) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.autor = autor;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	
}
