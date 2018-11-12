package com.daniel;

import com.daniel.models.Direccion;
import com.daniel.models.Usuario;

public class Principal {

	public static void main(String[] args) {
		
		Usuario kenobi = new Usuario();
		kenobi.nombre = "Obi";
		kenobi.apellido = "Juan";
		kenobi.edad = 30;
		kenobi.email = "juan@kenobi.com";
		
		kenobi.dir = new Direccion();
		
		kenobi.dir.calle = "Rue del Percebe";
		kenobi.dir.numero = 13;
		kenobi.dir.ciudad = "Madrid";
		
		System.out.println(kenobi.getDatosCompletos());

	}

}
