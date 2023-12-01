package thread;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * AbortPolicy
 * CallerRunsPolicy
 * DiscardPolicy
 * DiscardOldPolicy
 */
public class CompletableFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException, Exception {
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("------1------------");
            return 1;
        });
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> {

            System.out.println("------2------------");
            String s = null;
//            s.length();
            return 2;
        });
        CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(() -> {
            System.out.println("------3------------");
//            throw new RuntimeException("aaa");
            return 3;
        });
        CompletableFuture<Integer> future4 = CompletableFuture.supplyAsync(() -> {
//            throw new RuntimeException("bbb");
            return 4;
        });

        CompletableFuture<Integer>[] completableFutureArrayList = new CompletableFuture[]{future3, future4, future1, future2};
        CompletableFuture<Void> completableFuture = CompletableFuture.allOf(completableFutureArrayList);
        completableFuture.thenAccept(r ->
                System.out.println("combinedFuture accepted")
        );
//
        completableFuture.exceptionally(e -> {
            System.out.println(e);
            return null;
        }).join();

        for (CompletableFuture<Integer> integerCompletableFuture : completableFutureArrayList) {
            System.out.println(integerCompletableFuture.get());
        }

        System.out.println("complete--------");
        boolean b = Arrays.stream(completableFutureArrayList).map(CompletableFuture::join).allMatch(a -> a > 0);
        System.out.println(b);
    }
}