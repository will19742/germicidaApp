
// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "CIRCUITO_GERMICIDA.java."

import java.io.*;
import java.math.*;

public class App {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double dist;
		double dosis;
		double poten;
		double tamano_lamp;
		System.out.println("Determina la dosis de tiempo requerida para desinfectar tu objeto ");
		System.out.println(" ingresa la medida de la lampara en pulgadas ");
		tamano_lamp = Double.parseDouble(bufEntrada.readLine());
		System.out.println(" ingresa la distancia entre la lampara y la superficie a desinfectar ");
		dist = Double.parseDouble(bufEntrada.readLine());
		System.out.println(" ingresa la potencia emite la lampara ");
		poten = Double.parseDouble(bufEntrada.readLine());
		dosis = ((241)*tamano_lamp*3.1416*(Math.pow(dist,2)))/poten;
		System.out.println(" la dosis de tiempo requerida para desinfectar el objeto es de "+dosis+" segundos ");
	}


}

