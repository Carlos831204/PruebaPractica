package com.test.job.dto;

import java.util.List;

import com.test.job.entity.Registro;

public class ArrayRegistrosDTO {

	private List<Registro> registros;

	public ArrayRegistrosDTO() {

	}

	public ArrayRegistrosDTO(List<Registro> registros) {

		this.registros = registros;
	}

	public List<Registro> getRegistros() {
		return registros;
	}

	public void setRegistros(List<Registro> registros) {
		this.registros = registros;
	}

}
