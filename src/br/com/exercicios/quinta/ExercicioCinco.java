package br.com.exercicios.quinta;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int nota1, nota2, nota3, media;
		
		System.out.println("leia nota 1: ");
		nota1 = ler.nextInt();

		System.out.println("leia nota 2: ");
		nota2 = ler.nextInt();
		
		System.out.println("leia nota 3: ");
		nota3 = ler.nextInt();
	media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5))/10;
	
	System.out.println("A média do aluno é :" + media);
	
	}

}
