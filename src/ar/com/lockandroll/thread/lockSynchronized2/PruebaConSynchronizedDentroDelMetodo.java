package ar.com.lockandroll.thread.lockSynchronized2;

public class PruebaConSynchronizedDentroDelMetodo {
	public static void main(String[] args) {
		Timbre t = new Timbre();
		Thread v1 = new Thread(new Visitante(t));
		Thread v2 = new Thread(new Visitante(t));
		Thread v3 = new Thread(new Visitante(t));
		
		v1.start();
		v2.start();
		v3.start();
	}
}
