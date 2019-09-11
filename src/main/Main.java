package main;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	/*
	 * Pide una frase.
	 * Guarda palabras en ArrayList.
	 * Dice cuantas palabras hay y la más larga.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("* Introduce una frase:");
		String frase = in.nextLine();
		
		String[] palabrasAux = frase.split("[\\\"+*()/&%$:;.,!¡¿? ]");
		ArrayList<String> palabras = new ArrayList<String>();
		
		for (int i = 0; i < palabrasAux.length; i++) {
			if (!palabrasAux[i].equals("")) palabras.add(palabrasAux[i]);	// quita palabras "vacias"
		}
		
		String masLarga = palabras.get(0);
		
		for (int i = 1; i < palabras.size(); i++) {		
			if (masLarga.length() < palabras.get(i).length()) masLarga = palabras.get(i); 
		}
		
		System.out.println("-> En esta frase hay " + palabras.size() + " palabras.");
		System.out.println("-> La palabra más larga es: " + masLarga);
		
		in.close();
	}
}
