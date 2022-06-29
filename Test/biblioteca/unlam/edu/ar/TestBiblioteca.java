package biblioteca.unlam.edu.ar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestBiblioteca {

	@Test	
	public void queSePuedaCrearUnLibro() {
		Integer codigo = 1;
		String nombre = "Maquiavelo";
		String autor = "Maquiavelo";
		
		Integer codigo1 = 2;
		String nombre1 = "America";
		String autor1 = "Americo Vespucio";
		
		Integer codigo2 = 3;
		String nombre2 = "Matematica Discreta";
		String autor2 = "Teresa";
		
		
		libro libro1 = new Historia(codigo,nombre,autor);
		libro libro2 = new Geografia (codigo1,nombre1,autor1);
		libro libro3 = new Matematicas(codigo2,nombre2,autor2);
		
		assertEquals(libro1.getNombre(),nombre);
		assertEquals(libro2.getNombre(),nombre1);
		assertEquals(libro3.getNombre(),nombre2);
		assertNotNull(libro1);
	}
	
	@Test
	public void queSeAgreguenLibrosALaBiblioteca() {
		
		Integer codigo = 1;
		String nombre = "Maquiavelo";
		String autor = "Maquiavelo";
		
		Integer codigo1 = 50;
		String nombre1 = "America";
		String autor1 = "Americo Vespucio";
		
		Integer codigo2 = 30;
		String nombre2 = "Matematica Discreta";
		String autor2 = "Teresa";
		
		
		libro libro1 = new Historia(codigo,nombre,autor);
		libro libro2 = new Geografia (codigo1,nombre1,autor1);
		libro libro3 = new Matematicas(codigo2,nombre2,autor2);
		
		Biblioteca bibliotecaNacional = new Biblioteca();
		
		bibliotecaNacional.agregarLibro(libro1.getCodigo(),libro1);
		bibliotecaNacional.agregarLibro(libro2.getCodigo(),libro2);
		bibliotecaNacional.agregarLibro(libro3.getCodigo(),libro3);
		
		
		assertTrue(bibliotecaNacional.getRegistrosLibros().containsKey(libro3.getCodigo()));					
	}
	@Test
	public void queSePuedaCrearEstudiante() {
		Integer dni = 3251458;
		String apellido = "Gaspar";
		String nombre = "nacho";
		
		Estudiante alumno = new Estudiante(dni,apellido,nombre);
		assertNotNull(alumno);
	}
	@Test
	public void queLosEstudiantesNoPuedanPedirMasDeDosLibrosPrestados(){
		Biblioteca bibliotecaNacional = new Biblioteca();
		Integer dni = 3251458;
		String apellido = "Gaspar";
		String nombreAlumno = "nacho";
		
		Estudiante alumno = new Estudiante(dni,apellido,nombreAlumno);
		
		bibliotecaNacional.agregarAlumnos(alumno);
		
		Integer codigo = 1;
		String nombre = "Maquiavelo";
		String autor = "Maquiavelo";
		
		Integer codigo1 = 2;
		String nombre1 = "America";
		String autor1 = "Americo Vespucio";
		
		Integer codigo2 = 3;
		String nombre2 = "Matematica Discreta";
		String autor2 = "Teresa";
		
		
		libro libro1 = new Historia(codigo,nombre,autor);
		libro libro2 = new Geografia (codigo1,nombre1,autor1);
		libro libro3 = new Matematicas(codigo2,nombre2,autor2);
		
		
		bibliotecaNacional.agregarLibro(libro1.getCodigo(),libro1);
		bibliotecaNacional.agregarLibro(libro2.getCodigo(),libro2);
		bibliotecaNacional.agregarLibro(libro3.getCodigo(),libro3);
		
		bibliotecaNacional.prestamoAlumno(libro1,alumno);
		bibliotecaNacional.prestamoAlumno(libro2,alumno);
		bibliotecaNacional.prestamoAlumno(libro3,alumno);
		
		Integer contador = 2;

		assertEquals(contador,bibliotecaNacional.getRegistroLibrosPrestados());
	}
	@Test
	public void intentarSacarDosVecesElMismoLibro(){
		Biblioteca bibliotecaNacional = new Biblioteca();
		Integer dni = 32;
		String apellido = "Gaspar";
		String nombreAlumno = "nacho";
		
		Integer dni0 = 325;
		String apellido0 = "vergara";
		String nombreAlumno0 = "matias";
		
		Integer dni1 = 655;
		String apellido1 = "vergara";
		String nombreAlumno1 = "matias";
		
		Integer dni2 = 200;
		String apellido2 = "vergara";
		String nombreAlumno2 = "matias";
		
		
		
		Estudiante alumno  = new Estudiante(dni,apellido,nombreAlumno);
		Estudiante alumno0 = new Estudiante(dni0,apellido0,nombreAlumno0);
		Estudiante alumno1 = new Estudiante(dni1,apellido1,nombreAlumno1);
		Estudiante alumno2 = new Estudiante(dni2,apellido2,nombreAlumno2);
		
		bibliotecaNacional.agregarAlumnos(alumno);
		bibliotecaNacional.agregarAlumnos(alumno0);
		bibliotecaNacional.agregarAlumnos(alumno1);
		bibliotecaNacional.agregarAlumnos(alumno2);
		
		Integer codigo = 1;
		String nombre = "Maquiavelo";
		String autor = "Jose Luqeti";
		libro libro1 = new Historia(codigo,nombre,autor);
		bibliotecaNacional.agregarLibro(codigo, libro1);
		
		
		bibliotecaNacional.prestamoAlumno(libro1,alumno);
		bibliotecaNacional.prestamoAlumno(libro1,alumno0);

		
		Integer resultadoEsperado = 1;
		assertEquals(resultadoEsperado,bibliotecaNacional.getRegistroLibrosPrestados());
	}
	
	
	
	
	
}
