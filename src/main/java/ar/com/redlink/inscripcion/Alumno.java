package ar.com.redlink.inscripcion;

import java.util.Collection;
import java.util.List;

public class Alumno {
	
	private String nombre;
	private List<Curso> cursos;
	private Collection<Materia> materiasAprobadas;

	public Alumno(String nombre) {
		this.setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	public Collection<Materia> getMateriasAprobadas() {
		return materiasAprobadas;
	}

	public void setMateriasAprobadas(Collection<Materia> materiasAprobadas) {
		this.materiasAprobadas = materiasAprobadas;
	}
	
	

}
