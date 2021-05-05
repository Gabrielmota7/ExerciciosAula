package br.com.exercicios.quinta;

import java.util.Scanner;

public class ExercicioSete {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, b, c, d, f,e, x, y;
		
		System.out.println("escreva o valor de a: ");
		a= ler.nextDouble();
		
		System.out.println("escreva o valor de b: ");
		b= ler.nextDouble();
		
		System.out.println("escreva o valor de c: ");
		e= ler.nextDouble();
		
		System.out.println("escreva o valor de d: ");
		d= ler.nextDouble();
		
		c= a + b;
		f = d+ e;
		
		x= ((c*e) - (b*f)) / ((a*e) - (b*d));
		y= ((a * f)- (c * d)) / ((a * e )- (b*d));
		
		System.out.println("escreva o valor de x: "+ x);
		System.out.println("escreva o valor de y: "+ y);
	}

}
