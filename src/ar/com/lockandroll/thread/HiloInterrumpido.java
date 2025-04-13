package ar.com.lockandroll.thread;

public class HiloInterrumpido extends Thread {

	@Override
	public void run() {
		System.out.println("Estoy ejecutando HiloTerciario");
		int i = 0;
		for (;;) {
			System.out.println("Iteración número: " + i++);

			//Thread.interrupted(); La llamada estática solo limpia la llamada en ese momento, la siguiente vez seguirá siendo false
			//Thread.interrupted();
			boolean interrupted = isInterrupted();
			if (interrupted) {
				System.out.println("Ha, Caramba, Fuí interrumpido!");
				return;
			}
		}
	}
}
