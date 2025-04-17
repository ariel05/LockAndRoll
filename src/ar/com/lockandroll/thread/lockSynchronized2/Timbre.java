package ar.com.lockandroll.thread.lockSynchronized2;

public class Timbre {
	public void timbre() {
		System.out.println("Me estoy acercando al timbre...");
		synchronized(this) {
			
			System.out.println("Ding... ");
			try {
				Thread.sleep(2000);
				System.out.println("Dong...");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
