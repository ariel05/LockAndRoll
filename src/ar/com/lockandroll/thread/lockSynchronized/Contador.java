package ar.com.lockandroll.thread.lockSynchronized;

public class Contador {

	private int valor = 0;

	int getValor() {
		return valor;
	}

	public synchronized void ping() {
		int old = this.valor;
		old++;
		this.valor = old;
	}

}
