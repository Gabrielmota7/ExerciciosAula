package br.com.exercicios.quinta;

import java.util.Scanner;

public class ExercicioOito {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double custoFabrica, custoConsumidor, distribuidor;
		
		System.out.println("entre com o custo de fabrica: ");
		custoFabrica= ler.nextDouble();
		
		distribuidor = custoFabrica + (custoFabrica*0.28);
		custoConsumidor = distribuidor + (distribuidor*0.45);
		
		System.out.println("custo do consumidor é: "+ custoConsumidor);
	}

}
