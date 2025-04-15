package ar.com.lockandroll.thread.join;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PruebaConEsperaJoin {

	public static void main(String[] args) throws InterruptedException {
		Thread h = new Thread(() -> {
			System.out.println("Iniciamos Hilo");
			try {
				Thread.sleep(4000);
				System.out.println("Finalizamos Hilo");
			} catch (InterruptedException e) {
				Logger.getLogger(PruebaConEsperaIsAlive.class.getName()).log(Level.SEVERE, "Ha ocurrido un error");
			}
		});
		
		h.start();
		
		System.out.println("******************** Esperando ********************");
		//Espera hata que el hilo finalice, pero si por algún motivo dura más de lo esperado, seguirá esperando
//		h.join();
		
		//Vesión optimizada, le indicamos el tiempo máximo que debe esperar al hilo.
		//Luego de ese tiempo, seguirá avanzando aunque no haya finalizado el hilo
		h.join(3000);
		
		System.out.println("Ya está listo");
	}

}
