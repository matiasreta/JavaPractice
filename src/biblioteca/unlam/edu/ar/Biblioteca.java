package biblioteca.unlam.edu.ar;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Biblioteca {

	private Map<Integer, libro> registrosLibros;
	private Set<Estudiante> listaAlumnos;
	private List<Registro> registroLibrosPrestados;
	
	public Biblioteca() {
		this.registrosLibros = new TreeMap<>();
		this.listaAlumnos = new TreeSet<>();
		this.registroLibrosPrestados = new ArrayList<>();
		
	}

	public Map<Integer, libro> getRegistrosLibros() {
		return registrosLibros;
	}

	public void setRegistrosLibros(Map<Integer, libro> registrosLibros) {
		this.registrosLibros = registrosLibros;
	}	

	public Set<Estudiante> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(Set<Estudiante> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}

	public Integer getRegistroLibrosPrestados() {
		return registroLibrosPrestados.size();
	}

	public void setRegistroLibrosPrestados(List<Registro> registroLibrosPrestados) {
		this.registroLibrosPrestados = registroLibrosPrestados;
	}

	public void agregarLibro(Integer codigo, libro libro1) {
		registrosLibros.put(codigo, libro1);
	}

	public void agregarAlumnos(Estudiante alumno) {
		listaAlumnos.add(alumno);
		
	}

	public void prestamoAlumno(libro libro1, Estudiante alumno){
		if(alumno.getRetiros()<2) {
		for (libro libros : registrosLibros.values()) {
			if (libros.getCodigo().equals(libro1.getCodigo())) {
				registrosLibros.remove(libros.getCodigo());
				Registro nuevoregistro = new Registro(alumno.getDni(),libros.getCodigo());
				registroLibrosPrestados.add(nuevoregistro);
				alumno.setRetiros(alumno.getRetiros()+1);
				break;
				}
			}
		}
	}
	
	
	
	
	
	
	}
	
