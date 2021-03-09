package view;

import java.util.Random;

import controller.Threadcalc;

public class Main {
	private static int[][] matriz = new int[3][5];
	public static int indice = 0;
	public static void main(String[] args) {
		Random r = new Random();
		for(int i = 0; i < 3; i++) {
			for(int y = 0; y<5; y++) {
				matriz[i][y] = r.nextInt(100);
			}
			Thread tcalc = new Threadcalc(matriz,indice);
			tcalc.start();
			indice++;
		}
		
	}
}
