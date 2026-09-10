package src.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Completable
{
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String> cf= new CompletableFuture<>();
        cf.get();
        cf.complete("returning some data...");
    }
}
