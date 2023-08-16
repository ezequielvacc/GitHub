package trabajospracticos.tp1;

import java.util.Arrays;

public class Alumno extends Persona {
	private String curso;
	private double[] calificaciones;

	public Alumno(String nombre, int edad, String curso, double[] calificaciones) {
		super(nombre, edad);
		this.curso = curso;
		this.calificaciones = calificaciones;
	}

	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double[] getCalificaciones() {
		return calificaciones;
	}
	public void setCalificaciones(double[] calificaciones) {
		this.calificaciones = calificaciones;
	}
	
	public void agregarCalificacion(double calificacion) {
		double[] nuevasCalificaciones = new double[this.calificaciones.length + 1];
		if (this.calificaciones.length > 0) {
			for (int i = 0; i < calificaciones.length; i++) {
				nuevasCalificaciones[i] = calificaciones[i];
			}
		}
		nuevasCalificaciones[calificaciones.length] = calificacion;
		calificaciones = nuevasCalificaciones;
	}
	
	public String toString(int espacios) {
		String tab = "    ".repeat(espacios);
		return (tab + "Nombre: " + this.getNombre() + "\n" + tab + "Edad: " + this.getEdad() + " años\n" +
				tab + "Curso: " + curso + "\n" + tab + "Calificaciones: " + Arrays.toString(calificaciones));
	}
	
}
