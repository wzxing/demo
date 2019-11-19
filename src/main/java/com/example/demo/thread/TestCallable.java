package com.example.demo.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestCallable {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask<String> task = new FutureTask((Callable<String>) () -> {
            return "1234";
        });

        Thread thread = new Thread(task);
        thread.start();

        String result = task.get();


    }

}
