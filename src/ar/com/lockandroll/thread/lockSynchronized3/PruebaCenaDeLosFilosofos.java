package ar.com.lockandroll.thread.lockSynchronized3;

public class PruebaCenaDeLosFilosofos {

	public static void main(String[] args) throws InterruptedException {
		String[] nombres = {"Aristoteles", "Socrates", "Platón", "Sóstenes"};
		
		Palillo[] palillos = new Palillo[nombres.length];
		for(int i = 0; i < palillos.length; i++) {
			palillos[i] = new Palillo();
		}
		
		Filosofo[] filosofos = new Filosofo[nombres.length];
		for(int i = 0; i < filosofos.length; i++) {
			Palillo izquierdo = palillos[i % palillos.length];
			Palillo derecho = palillos[(i + 1) % palillos.length];
			filosofos[i] = new Filosofo(nombres[i], izquierdo, derecho);
		}
		
		
		for(Filosofo f : filosofos) {
			new Thread(f).start();
			Thread.sleep(2000);
		}

	}

}
