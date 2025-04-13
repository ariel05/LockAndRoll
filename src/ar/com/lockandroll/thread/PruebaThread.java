package ar.com.lockandroll.thread;

import ar.com.lockandroll.thread.runnable.HiloTerciario;

public class PruebaThread {

	public static void main(String[] args) {
		HiloSecundario hiloSecundario = new HiloSecundario();

		System.out.println(hiloSecundario.getState().name());
		hiloSecundario.start();
		System.out.println(hiloSecundario.getState().name());
		
		syso();
		
		Thread hiloTerciario = new Thread(new HiloTerciario());
		hiloTerciario.start();
		
	}
	
	private static void syso() {
		System.out.println("Esto se está ejecutando el en hilo principal");
	}

}
