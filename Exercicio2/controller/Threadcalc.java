package controller;

public class Threadcalc extends Thread {
	private int matriz[][];
	private int indice;
	public Threadcalc(int matriz[][],int indice) {
		this.matriz = matriz;
		this.indice = indice;
	}
	@Override
	public void run() {
		calc();
	}
	
	private void calc() {
		int soma = 0;
		for(int i = 0; i < 5; i++) {
			soma += matriz[indice][i];
		}
		System.out.println("Linha " + (indice + 1) + ". Soma = " + soma + ".");
	}
}
