package com.daniel.models;

public class Usuario {
	
	public String nombre;
	public String apellido;
	public String email;
	public int edad;
	public Direccion dir;
	
	public String getDatosCompletos() {
		String datos = this.nombre +" "+ this.apellido +" "+ this. email +" "+ this.edad +" "+dir.getDireccionCompleta();
		
		return datos;
	}
}	
