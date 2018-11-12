package com.daniel;

import java.util.ArrayList;

import com.daniel.models.Amigo;

public class Principal {

	public static void main(String[] args) {
		Amigo pepe = new Amigo(101, "Jose", "j@j.es", 23, true);
		
		Amigo juan = new Amigo(102, "Juan", "ju@jn.es", 25, false);
		
		Amigo petra = new Amigo(103, "Petra", "p@tr.es", 27, true);
		
		ArrayList<Amigo> amigosPepe = new ArrayList<Amigo>();
		amigosPepe.add(juan);
		amigosPepe.add(petra);
		
		pepe.misamigos = amigosPepe;
		
		System.out.println(pepe.showInfo());
		

	}

}
