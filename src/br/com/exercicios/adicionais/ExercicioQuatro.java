package br.com.exercicios.adicionais;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double numero, raiz, potencia;
		numero = ler.nextDouble();
		
		if(numero % 2 == 0) {
			raiz = Math.sqrt(numero);
			System.out.println("esse número é par");
			System.out.println("\nA raiz desse número é: "+ raiz);
		}
		else if(numero % 2 != 0) {
			potencia = (Math.pow((numero), 2.0));
			System.out.println("o número é impar");
			System.out.println("\nA potencia do número é : "+ potencia);
		}
	}

}
