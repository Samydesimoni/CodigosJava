package br.com.generation.construtordeclasses;

import java.util.Scanner;

public class TestaPessoa {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome da Pessoa: ");
		String nome = entrada.next();
		
		System.out.println("Digite a idade da Pessoa: ");
		int idade = entrada.nextInt();
		
		Pessoa p1 = new Pessoa(nome, idade);
		
		System.out.println(p1.nome);
		System.out.println(p1.idade);
		

	}

}
