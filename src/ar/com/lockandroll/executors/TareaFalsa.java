package ar.com.lockandroll.executors;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TareaFalsa implements Runnable{

	long amount;
	
	TimeUnit unit;
	
	String id;
	
	public TareaFalsa(long amount, TimeUnit unit, String id) {
		this.amount = amount;
		this.unit = unit;
		this.id = id;
	}
	
	@Override
	public void run() {
		System.out.println(id + ": Comenzando");
		
		try {
			Thread.sleep(Duration.of(amount, unit.toChronoUnit()).toMillis());
			System.out.println(id + ": Terminamos");
		} catch (InterruptedException e) {
			System.out.println(id + ": Ocurrió una interrupción");
		}
		
	}
}
