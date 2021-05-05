package br.com.exercicios.adicionais;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade;
		idade= ler.nextInt();
		
		if(idade >=10 && idade <=14) {
			System.out.println("está na categoria infantil");
		}
		if(idade >=15 && idade <=17) {
			System.out.println("está na categoria juvenil");
		}
		if(idade >=18 && idade <=25) {
			System.out.println("está na categoria adulto");
		}
		if(idade <10) {
			System.out.println("idade invalida");
		}
		if(idade>25) {
			System.out.println("idade invalida");
		}
	}

}
