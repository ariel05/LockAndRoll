package ar.com.lockandroll.thread.lockSynchronized;

public class PruebaConSynchronized {

	public static void main(String[] args) throws InterruptedException {
		long inicio = System.currentTimeMillis();

		for(int i = 0; i < 10; i++)
			Contable.iterar();

		long fin =  System.currentTimeMillis() - inicio;
		System.out.println("Tiempo total transcurrido: " + fin/1000.00 + " segundos");
	}

}
