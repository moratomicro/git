package br.com.dio.calculadora;

import java.util.Scanner;
import java.util.function.ToDoubleFunction;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		int divisao = divisao(a, b);
		
		System.out.println("Soma " + a + " + " + b + " = " + soma);
		System.out.println("Subtra��o " + a + " - " + b + " = " + subtracao);
		System.out.println("Multiplica��o " + a + " * " + b + " = "  + multiplicacao);
		System.out.println("Divis�o " + a + " / " + b + " = "  + divisao);
	}
	
	public static int  soma(int a, int b) {
		return a + b;
	}
	
	public static int  subtracao(int a, int b) {
		return a - b;
	}
	public static int  divisao(int a, int b) {
		return a / b;
	}
	public static int  multiplicacao(int a, int b) {
		return a * b;
	}

}
