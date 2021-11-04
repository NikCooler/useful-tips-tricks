package concurrency;

import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.*;

public class TestExecutorService {

    public static void main(String[] args) throws Exception {
        ExecutorService singleExec = Executors.newSingleThreadExecutor();

        Future<?> res = singleExec.submit(() -> System.out.println("Single executor"));
        singleExec.shutdown();
        ExecutorService fixedExec  = Executors.newFixedThreadPool(2);
        ExecutorService cachedExec = Executors.newCachedThreadPool();

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
        Future<?> sc = scheduledExecutorService.schedule(() -> System.out.println("Scheduled executor"), 3, TimeUnit.SECONDS);
        System.out.println("END");
        sc.get();
        scheduledExecutorService.shutdown();
    }

}
