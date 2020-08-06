// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PRACTICA04.java."

import java.io.*;

public class Practica04{

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		float gasto;
		int km;
		int kml;
		float lts;
		float pr;
		// Entrada
		System.out.println("Ingrese los Km recorridos: ");
		km = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese Km por Litro");
		kml = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese precio del combustible por litro");
		pr = Float.parseFloat(bufEntrada.readLine());
		// Proceso 
		lts = km/kml;
		gasto = lts*pr;
		// Salida
		System.out.println("Total de litros consumidos: "+lts);
		System.out.println("Gasto total en pesos "+gasto);
	}


}

