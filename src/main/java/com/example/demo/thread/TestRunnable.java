package com.example.demo.thread;

public class TestRunnable{

    public static void main(String[] args) {

        Thread thread = new Thread(() -> System.out.println("1234"));
        thread.start();
    }
}
