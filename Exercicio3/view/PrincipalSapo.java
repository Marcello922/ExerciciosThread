package view;

import controller.ThreadSapo;

public class PrincipalSapo {

	public static void main(String[] args) {
		
		int chegada = 300;
		Thread s1 = new ThreadSapo(1,chegada);
		s1.run();
		Thread s2 = new ThreadSapo(2,chegada);
		s2.run();
		Thread s3 = new ThreadSapo(3,chegada);
		s3.run();
	}
}
