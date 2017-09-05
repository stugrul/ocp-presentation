package concurrency.syncronizingaccess;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Serkan on 04/09/2017.
 */
public class SheepManagerWithAtomicInteger {
    /**
     * Atomic is the property of an operation to be  carried out as a single unit of execution
     */
    private AtomicInteger sheepCount = new AtomicInteger();

    private void incrementAndReport() {
        System.out.print((sheepCount.incrementAndGet() + " "));
    }

    public static void main(String[] args) {
        ExecutorService service = null;

        try {
            service = Executors.newFixedThreadPool(20);

            SheepManagerWithAtomicInteger manager = new SheepManagerWithAtomicInteger();

            for (int i = 0; i < 10; i++) {
                service.submit((manager::incrementAndReport));
            }
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}
