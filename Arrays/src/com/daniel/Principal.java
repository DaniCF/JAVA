package com.daniel;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		String[] meses = new String[12];

		String[] mascotas = new String[1000];
		
		meses[0]="Ene";
		meses[1]="Feb";
		meses[2]="Mar";
		meses[3]="Abr";
		meses[4]="May";
		meses[5]="Jun";
		meses[6]="Jul";
		meses[7]="Ago";
		meses[8]="Sep";
		meses[9]="Oct";
		meses[10]="Nov";
		meses[11]="Dic";
		
		for (int i = 0; i < meses.length; i++) {
			System.out.println("El mes " + (i+1) + " es " + meses[i]);
		}
		
		for (String unMes : meses) {
			System.out.println("Un mes: " + unMes);
		}
		
		for (int i = 0; i < mascotas.length; i++) {
			mascotas[i] = "XxxSniper"+i+"xxX";
		}
		
		for (String Mascota : mascotas) {
			System.out.println(Mascota);
		}
		
		for (int i = 0; i < mascotas.length; i++) {
			mascotas[i] = generalNombre();
		}
		
		for (String Mascota : mascotas) {
			System.out.println(Mascota);
		}


	}
	
	public static String generalNombre() {
		String[] nombresSueltos = new String[20];
		nombresSueltos[0] = "Excalibur";
		nombresSueltos[1] = "Mag";
		nombresSueltos[2] = "Loki";
		nombresSueltos[3] = "Rhino";
		nombresSueltos[4] = "Volt";
		nombresSueltos[5] = "Mesa";
		nombresSueltos[6] = "Atlas";
		nombresSueltos[7] = "Nidus";
		nombresSueltos[8] = "Banshee";
		nombresSueltos[9] = "Vauban";
		nombresSueltos[10] = "Nekros";
		nombresSueltos[11] = "Oberon";
		nombresSueltos[12] = "Zephyr";
		nombresSueltos[13] = "Frost";
		nombresSueltos[14] = "Inaros";
		nombresSueltos[15] = "Valkyr";
		nombresSueltos[16] = "Hydroid";
		nombresSueltos[17] = "Titania";
		nombresSueltos[18] = "Equinox";
		nombresSueltos[19] = "Ivara";
		
		Random rand = new Random();
		
		int n1 = rand.nextInt(20);
		int n2 = rand.nextInt(20);
		
		String nombreAleatorio = nombresSueltos[n1] + " " + nombresSueltos[n2];
		
		return nombreAleatorio;
		
		
	}
}
