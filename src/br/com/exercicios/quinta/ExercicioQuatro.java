package br.com.exercicios.quinta;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int A, B, C;
		double D, R, S;
		
		System.out.println("leia A: ");
		A= ler.nextInt();
	
		System.out.println("leia B: ");
		B= ler.nextInt();
		
		System.out.println("leia C: ");
		C= ler.nextInt();
		
		R = (A + B)*2;
		System.out.println("escreva valor de R:"+ R );
		S = (B + C)*2;
		System.out.println("escreva o valor de S:"+ S);
		D = (R + S)/2;
		System.out.println("Valor de D é: "+ D);
	
	}
	

}
