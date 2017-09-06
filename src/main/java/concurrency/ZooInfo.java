package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Serkan on 04/09/2017.
 */
public class ZooInfo {
    public static void main(String[] args) {
        ExecutorService service = null;

        try {
            service = Executors.newSingleThreadExecutor();

            System.out.println("Begin");
            service.submit(() -> System.out.println("Printing first inventory"));
            service.submit(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Printing record: " + i);
                }
            });

            service.submit(() -> System.out.println("Printing second inventory"));
            System.out.println("end");
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}
