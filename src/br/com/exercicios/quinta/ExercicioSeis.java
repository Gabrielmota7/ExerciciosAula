package br.com.exercicios.quinta;

import java.util.Scanner;
import java.lang.Math;

public class ExercicioSeis {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double x1, y1, x2, y2, potencia1, potencia2, D;
		
		System.out.println("coloque o valor de x1: ");
		x1= ler.nextDouble();
		
		System.out.println("coloque o valor de x2: ");
		x2= ler.nextDouble();
		
		System.out.println("coloque o valor de y1: ");
		y1= ler.nextDouble();
		
		System.out.println("coloque o valor de y2: ");
		y2= ler.nextDouble();
		
		potencia1 = (Math.pow((x2 - x1), 2));
		
		D= (Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 + y1), 2))));
		System.out.println("O valor de D � :"+ D);
	}

}
