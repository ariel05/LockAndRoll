package ar.com.lockandroll.thread;

import java.time.Duration;

public class PruebaConInterrupcion {

	public static void main(String[] args) throws InterruptedException {
		HiloInterrumpido hiloInterrumpido = new HiloInterrumpido();
		
		hiloInterrumpido.start();
		
		Thread.sleep(Duration.ofSeconds(2).getSeconds());
		syso();
		hiloInterrumpido.interrupt();
		
	}

	
	private static void syso() {
		System.out.println("Esto se está ejecutando el en hilo principal");
	}
}
