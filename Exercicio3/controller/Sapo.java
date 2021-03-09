package controller;

import java.util.Random;


public class Sapo	{
	public int distancia,idsapo;
	
	public Sapo(int id) {
		idsapo = id;
	}
	
	public void corre(int chegada) {
		Random r = new Random();
		while (this.distancia < chegada) {
			int p = r.nextInt(100);
			pula(p);
		}
	}
	
	private void pula(int distancia) {
		this.distancia += distancia;
		System.out.println("O sapo "+this.idsapo+" pulou "+distancia+" centimetros");
	}
}
