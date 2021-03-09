package controller;



public class ThreadSapo extends Thread{
	Sapo s;
	private int chegada;
	public ThreadSapo(int id,int chegada) {
		s = new Sapo(id);
		this.chegada = chegada;
	}
	@Override
	public void run() {
		while (s.distancia < chegada) {
		s.corre(chegada);
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		System.out.println("Sapo "+s.idsapo);
	}
}
