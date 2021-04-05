package br.edu.ifba.ads.inf010.deadlock;

public class Thread1 extends Thread {

	private Object objeto1;
	private Object objeto2;

	public Thread1(Object objeto1, Object objeto2) {
		this.objeto1 = objeto1;
		this.objeto2 = objeto2;
	}
	
	/* 
	 * NESSE EXEMPLO, APENAS UM DEADLOCK PODE OCORRER
	 * PARA EVITAR O DEADLOCK, É PRECISO PASSAR O MESMO OBJETO NO MESMO PERÍODO DE TEMPO
	 * PASSAGENS DIFERENTES CAUSAM O ÚNICO DEADLOCK
	 * EXISTEM OUTRAS FORMAS DE EVITAR ESSE DEADLOCK
	 * 
	*/
	public void run() {
		synchronized (objeto1) { //PASSAGEM 1
			try {
				System.out.println("Adquire objeto1, espera pelo objeto2!");
				Thread.sleep(10); //
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized(objeto2) { // PASSAGEM 2
				System.out.println("Adquire objeto1 e objeto2");
			}
		}
	}
}
