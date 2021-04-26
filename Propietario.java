package modelo;

import java.io.Serializable;
import java.time.LocalDate;

public class Propietario implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String nombre;
	private LocalDate fecNacimiento;
	
	//Métodos
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFecNacimiento() {
		return fecNacimiento;
	}
	public void setFecNacimiento(LocalDate fecNacimiento) {
		this.fecNacimiento = fecNacimiento;
	}
	@Override
	public String toString() {
		return "Propietario [id=" + id + ", nombre=" + nombre + ", fecNacimiento=" + fecNacimiento + "]";
	}
	
	
}
