package br.com.generation.sobrecarga;

public class MinhaCalculadora {
	
	public int soma(int numero1, int numero2) {
		System.out.println("Inteiros");
		return numero1 + numero2;
	}
	
	public double soma(double numero1, double numero2) {
		System.out.println("Fracionarios");
		return numero1 + numero2;
		
	}
	
	public double soma(double numero1, double numero2, double numero3) {
		System.out.println("Tres numeros");
		return numero1 + numero2 + numero3;
		
	}
}
