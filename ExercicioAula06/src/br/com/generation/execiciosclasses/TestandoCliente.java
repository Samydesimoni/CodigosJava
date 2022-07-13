package br.com.generation.execiciosclasses;

public class TestandoCliente {

	public static void main(String[] args) {
		
		Cliente kaka = new Cliente();
		
		kaka.setNome("Alice");
		kaka.setIdade(35);
		kaka.setGenero("Feminino");
		
		System.out.println(kaka.getNome());
		System.out.println(kaka.getIdade());
		System.out.println(kaka.getGenero());
		

	}

}
