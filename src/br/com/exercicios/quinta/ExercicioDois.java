package br.com.exercicios.quinta;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int meses, dias, anos;
		
		System.out.println("entre com os dias: ");
		dias = ler.nextInt();
		
		meses = dias / 365;
		anos = meses / 12;
		
		System.out.println("sua idade em anos �: "+ anos);
		System.out.println("sua idade em meses �: "+ meses);
		System.out.println("sua idade em dias �: "+ dias);

	}

}
