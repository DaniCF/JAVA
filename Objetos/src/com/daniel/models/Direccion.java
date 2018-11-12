package com.daniel.models;

public class Direccion {
	
	public String calle;
	public int numero;
	public String ciudad;
	
	public String getDireccionCompleta() {
		String datos = this.calle +" "+ this.numero +","+ this.ciudad;
		return datos;
	}
}
