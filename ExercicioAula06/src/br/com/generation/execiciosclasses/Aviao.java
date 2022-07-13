package br.com.generation.execiciosclasses;

public class Aviao {
	
	private int totalPassageiros;
	private String companhia;
	private String tamanho;
	
	
	public int getTotalPassageiros() {
		return totalPassageiros;
	}
	public void setTotalPassageiros(int totalPassageiros) {
		this.totalPassageiros = totalPassageiros;
	}
	public String getCompanhia() {
		return companhia;
	}
	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	void voando() {
		System.out.println("O avião está voando.");
	}
}
