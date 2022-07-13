package br.com.generation.execiciosclasses;

public class TestandoAviao {

	public static void main(String[] args) {
		
		Aviao bol = new Aviao();
		
		bol.setCompanhia("Fly");
		bol.setTamanho("Grande");
		bol.setTotalPassageiros(120);
		
		
		System.out.println(bol.getCompanhia());
		System.out.println(bol.getTamanho());
		System.out.println(bol.getTotalPassageiros());
		
		

	}

}
