package br.com.exercicios.quinta;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade, meses, anos, dias;
		
		System.out.println("coloque a idade: ");
		idade = ler.nextInt();
		
		meses = idade * 12;
		dias = meses * 365;
		
		System.out.println("a sua idade expressa em dias é: "+ dias);
		
		
		

	}

}
