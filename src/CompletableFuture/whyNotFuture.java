package src.CompletableFuture;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class whyNotFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);

        Future<List<Integer>> submit = service.submit(() -> {
            System.out.println("Thread :" + Thread.currentThread().getName());
//            thread will be blocked untill this process completed
//           delay(10);
            return Arrays.asList(1, 2, 3, 4);
        });
        List<Integer> list = submit.get();
        System.out.println(list);

//        once the future is consumed then there is no option to use it again

        Future<List<Integer>> future = service.submit(() -> {
            System.out.println("Thread :" + Thread.currentThread().getName());
//            thread will be blocked untill this process completed
//           delay(10);
            return Arrays.asList(1, 2, 3, 4);
        });
//        we can't combine multiple futures we can run separately
//        no exceptional handling mechanisum is provided in future


    }

    private static void delay(int min) {
        try {
            TimeUnit.SECONDS.sleep(min);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
