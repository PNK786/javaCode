package src.java8;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class completable
{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> completablefuture=new CompletableFuture<>();
        completablefuture.get();
        completablefuture.complete("return something....");

//        if no return type is expecting use runAsync()


    }
}
