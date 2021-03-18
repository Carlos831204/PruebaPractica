package com.test.job.dto;

public class RegistroDto {
	
	private String nombre;
	private String apellido;
	private boolean procesado = false;
	
	public RegistroDto() {
		
	}

	public RegistroDto(String nombre, String apellido, boolean procesado) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.procesado = procesado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public boolean isProcesado() {
		return procesado;
	}

	public void setProcesado(boolean procesado) {
		this.procesado = procesado;
	}
	
	
	
	
	
	
	
	

}
