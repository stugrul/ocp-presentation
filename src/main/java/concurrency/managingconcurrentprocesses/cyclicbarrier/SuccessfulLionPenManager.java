package concurrency.managingconcurrentprocesses.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Serkan on 04/09/2017.
 */
public class SuccessfulLionPenManager {
    private void removeAnimals() {
        System.out.println("Removing animals");
    }

    private void cleanPen() {
        System.out.println("Cleaning the pen");
    }

    private void addAnimals() {
        System.out.println("Adding animals");
    }

    public void performTask(CyclicBarrier c1, CyclicBarrier c2) {
        try {
            removeAnimals();
            c1.await();
            cleanPen();
            c2.await();
            addAnimals();
        } catch (InterruptedException | BrokenBarrierException e) {
            // Handle Exception
        }
    }

    public static void main(String[] args) {
        ExecutorService service = null;

        try {
            service = Executors.newFixedThreadPool(4);

            SuccessfulLionPenManager manager = new SuccessfulLionPenManager();

            CyclicBarrier c1 = new CyclicBarrier(4, () -> System.out.println("*** Removed Animals! ***"));
            CyclicBarrier c2 = new CyclicBarrier(4, () -> System.out.println("*** Pen Cleaned! ***"));

            for (int i = 0; i < 4; i++) {
                service.submit(() -> manager.performTask(c1, c2));
            }

        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }

}
