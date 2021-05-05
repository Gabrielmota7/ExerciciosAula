package br.com.exercicios.quinta;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int segundos, horas, minutos;
		
		System.out.println("coloque os segundos: ");
		segundos = ler.nextInt();
				
			horas = segundos / 3600;
			minutos = segundos / 60;
			
			System.out.println("os segundos do evento da fabrica foram: "+ segundos);
			System.out.println("os minutos do evento da fabrica foram: "+ minutos);
			System.out.println("as horas do evento da fabrica foram: "+ horas);
		
	}
}
