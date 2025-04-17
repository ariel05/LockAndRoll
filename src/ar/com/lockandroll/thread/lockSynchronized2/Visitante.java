package ar.com.lockandroll.thread.lockSynchronized2;

public class Visitante implements Runnable{

	private Timbre t;
	
	public Visitante(Timbre t) {
		this.t = t;
	}
	
	@Override
	public void run() {
		t.timbre();
	}

}
