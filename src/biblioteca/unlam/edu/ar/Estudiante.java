package biblioteca.unlam.edu.ar;

public class Estudiante implements Comparable<Estudiante>{
	
	private Integer dni;
	private String apellido;
	private String nombre;
	private Integer retiros=0;
	
	
	public Estudiante(Integer dni2, String apellido2, String nombre2) {
		this.dni = dni2;
		this.apellido = apellido2;
		this.nombre = nombre2;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int compareTo(Estudiante o) {
		// TODO Auto-generated method stub
		return this.dni.compareTo(o.getDni());
	}

	public Integer getRetiros() {
		return retiros;
	}

	public void setRetiros(Integer retiros) {
		this.retiros = retiros;
	}

	@Override
	public String toString() {
		return "Estudiante [dni=" + dni + ", nombre=" + nombre + "]\n";
	}
	
	
}
