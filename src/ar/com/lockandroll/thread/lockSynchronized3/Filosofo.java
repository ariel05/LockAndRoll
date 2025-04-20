package ar.com.lockandroll.thread.lockSynchronized3;

import java.util.Random;

public class Filosofo implements Runnable {
	
	private static Random r = new Random();
	
	private final Palillo izquierdo;
	private final Palillo derecho;
	
	String nombre;
	int iteracion = 0;
	
	public Filosofo(String nombre, Palillo izquierdo, Palillo derecho) {
		this.nombre = nombre.toUpperCase();
		this.izquierdo = izquierdo;
		this.derecho = derecho;
	}

	@Override
	public void run() {
		while(true) {
			pensar();
			comer();
		}
	}
	
	private void pensar() {
		System.out.println(nombre + " está pensando");
		esperar(r.nextInt(2000, 3000));
	}
	
	private void comer() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("INICIA ITERACION " + iteracion + " de "+ nombre);
		System.out.println(nombre +" intenta agarra el palillo IZQUIERDO");
		esperar(r.nextInt(400, 600));
		synchronized(izquierdo) {
			System.out.println(nombre +" logra agarrar el palillo IZQUIERDO");
			System.out.println(nombre +" intenta agarrar el palillo DERECHO");
			esperar(r.nextInt(400, 600));
			
			synchronized(derecho) {
				System.out.println(nombre +" logra agarrar el palillo DERECHO");
				System.out.println(nombre +" COMIENDO");
				esperar(r.nextInt(2000, 3000));
			}
			System.out.println(nombre +" soltó el tenedor DERECHO");
		}
		System.out.println(nombre +" soltó el tenedor IZQUIERDO");
		System.out.println("TERMINA ITERACION " + iteracion + " de " + nombre);
		System.out.println("-------------------------------------------------------------------");
		iteracion++;
	}
	
	private void esperar(int espera) {
		try {
			Thread.sleep(espera);
		} catch (InterruptedException e) {
			System.out.println("*****" + nombre + "*****" +" No pudo esperar más");
		}
	}

}
