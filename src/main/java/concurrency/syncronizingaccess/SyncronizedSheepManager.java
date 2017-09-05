package concurrency.syncronizingaccess;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Serkan on 04/09/2017.
 */
public class SyncronizedSheepManager {
    private int sheepCount = 0;

    private void incrementAndReport() {
        synchronized (this) {
            System.out.print((++sheepCount + " "));
        }
    }

    public static void main(String[] args) {
        ExecutorService service = null;

        try {
            service = Executors.newFixedThreadPool(20);

            SyncronizedSheepManager manager = new SyncronizedSheepManager();

            for (int i = 0; i < 10; i++) {
                service.submit(manager::incrementAndReport);
            }
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}
