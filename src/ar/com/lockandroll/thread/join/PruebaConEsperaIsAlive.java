package ar.com.lockandroll.thread.join;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PruebaConEsperaIsAlive {

	public static void main(String[] args) {
		
		Thread h = new Thread(() -> {
			System.out.println("Iniciamos Hilo");
			try {
				Thread.sleep(10);
				System.out.println("Finalizamos Hilo");
			} catch (InterruptedException e) {
				Logger.getLogger(PruebaConEsperaIsAlive.class.getName()).log(Level.SEVERE, "Ha ocurrido un error");
			}
		});
		
		h.start();
		int i = 0;
		while(h.isAlive()) {
			System.out.println("******************** Esperando "+ i +" ********************");
			i++;
		}
		//Pésima forma de esperar, está consumiendo recursos mientras "espera". 
		System.out.println("Ya está listo");
	}

}
