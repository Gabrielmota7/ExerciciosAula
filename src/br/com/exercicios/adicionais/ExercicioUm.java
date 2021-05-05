package br.com.exercicios.adicionais;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, c, maior;
		
		System.out.println("insira o valor de a: ");
		a = ler.nextInt();
		maior = a;
		
		
		System.out.println("insira o valor de b: ");
		b = ler.nextInt();
		
		System.out.println("insira o valor de c: ");
		c = ler.nextInt();
	
		if(b > maior) {
			maior = b;
		}
		if(c > maior) {
			maior = c;
		}
	System.out.println("o Maior inteiro é: "+ maior);
	
	
	
	}

}
