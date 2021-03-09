package view;

import controller.ThreadId;

public class Principal {
	public static void main(String[] args) {
		for(int id = 0; id < 6; id++) {
			Thread tid = new ThreadId(id);
			tid.start();
		}
	}
}
