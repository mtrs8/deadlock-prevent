package br.edu.ifba.ads.inf010.app;

import br.edu.ifba.ads.inf010.deadlock.Thread1;
import br.edu.ifba.ads.inf010.deadlock.Thread2;

public class App {
	public static void main(String[] args) {
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		//PASSA DOIS OBJETOS PARA SEREM EXECUTADOS SIMULTANEAMENTE
		Thread1 thr1 = new Thread1(obj1, obj2); 
		thr1.start();
		Thread2 thr2 = new Thread2(obj1, obj2);
		thr2.start();
	}
}
