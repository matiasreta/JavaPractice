package biblioteca.unlam.edu.ar;

public class Registro {
	private Integer dniEstudiante;
	private Integer codigoDelLibro;
	private Integer codigoDeRegistro=0;
	
	
	public Registro(Integer dniEstudiante, Integer codigoDelLibro) {
		super();
		this.setDniEstudiante(dniEstudiante);
		this.setCodigoDelLibro(codigoDelLibro);
		this.codigoDeRegistro++;
		
	}


	public Integer getDniEstudiante() {
		return dniEstudiante;
	}


	public void setDniEstudiante(Integer dniEstudiante) {
		this.dniEstudiante = dniEstudiante;
	}


	public Integer getCodigoDelLibro() {
		return codigoDelLibro;
	}


	public void setCodigoDelLibro(Integer codigoDelLibro) {
		this.codigoDelLibro = codigoDelLibro;
	}
	
	
	
	
	
}
