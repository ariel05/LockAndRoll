package ar.com.lockandroll.thread.lockSynchronized;

public class Contable implements Runnable {

	private Contador cont;
	public static int HILOS = 20000;
	
	public Contable(Contador cont) {
		this.cont = cont;
	}

	@Override
	public void run() {
		cont.ping();
	}
	
	public static void iterar() throws InterruptedException {
		Contador c = new Contador();
		long inicio = System.currentTimeMillis();
		
		Thread threads[] = new Thread[HILOS];
		for(int i = 0; i < HILOS; i++) {
			threads[i] = new Thread(new Contable(c));
		}
		
		for(int i = 0; i < HILOS; i++) {
			threads[i].start();
		}
		
		for(int i = 0; i < HILOS; i++) {
			threads[i].join();
		}
		int valorTotal = c.getValor();
		
		long fin =  System.currentTimeMillis() - inicio;
		System.out.println("El resultado final es: " + valorTotal + " y el tiempo transcurrido: " + fin/1000.00 + " segundos");
		System.out.println("*************************************************************************\n");
	}

}