package org.example;

public class Ex12_JoinThreads {
    public static void main(String[] args) throws InterruptedException {
        System.out.printf("%s: Starting ThreadMain%n", Thread.currentThread().getName());

        PrintTask task0 = new PrintTask("Task0");
        PrintTask task1 = new PrintTask("Task1");
        PrintTask task2 = new PrintTask("Task2");

        Thread thread0 = new Thread(task0);
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread0.start();
        thread1.start();
        thread2.start();

        thread0.join();
        thread1.join();
        thread2.join();

        System.out.printf("%s: ThreadMain terminated%n", Thread.currentThread().getName());
    }
}
