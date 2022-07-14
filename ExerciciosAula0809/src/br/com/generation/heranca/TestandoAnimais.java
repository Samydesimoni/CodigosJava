package br.com.generation.heranca;

public class TestandoAnimais {

	public static void main(String[] args) {
		
		Cavalo C = new Cavalo();
		
		//Animal
		C.setNome("Pé de Pano");
		C.setIdade(3);
		C.setSom("Relinchar");
		
		//Cachorro
		C.setCorrer("Galopar");
		
		System.out.println("Nome do cavalo: " +C.getNome());
		System.out.println("Idade do cavalo: " +C.getIdade());
		System.out.println("O cavalo emite o som de: " +C.getSom());
		System.out.println("Para o cavalo coorrer é a mesma coisa de: " +C.getCorrer());
		
	
	}
	
	
}