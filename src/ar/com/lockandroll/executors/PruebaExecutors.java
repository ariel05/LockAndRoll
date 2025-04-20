package ar.com.lockandroll.executors;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PruebaExecutors {

	public static void main(String[] args) throws InterruptedException {
		var service = Executors.newSingleThreadExecutor();
		
		service.submit(new TareaFalsa(1, TimeUnit.SECONDS, "Primer Tarea"));
		service.submit(new TareaFalsa(1, TimeUnit.SECONDS, "Segunda Tarea"));
		service.submit(new TareaFalsa(1, TimeUnit.SECONDS, "Tercer Tarea"));
		service.submit(new TareaFalsa(1, TimeUnit.SECONDS, "Cuarta Tarea"));
		System.out.println("Tarea/s encolada/s...");
		service.shutdown();
		service.awaitTermination(1, TimeUnit.DAYS);
		
		System.out.println("Todo Terminado...");
		

	}

}
