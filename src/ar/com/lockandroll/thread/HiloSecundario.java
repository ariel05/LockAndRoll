package ar.com.lockandroll.thread;

public class HiloSecundario extends Thread{

	@Override
	public void run() {
		System.out.println("Estoy ejecutando HiloSecundario");
	}

}
