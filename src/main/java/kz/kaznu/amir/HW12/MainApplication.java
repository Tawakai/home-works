package kz.kaznu.amir.HW12;

public class MainApplication {
    public static void main(String[] args) {
        firstMethod();
        secondMethod();
    }

    public static void firstMethod() {
        double[] array = new double[100_000_000];
        long t = System.currentTimeMillis();
        for (int i = 0; i < 100_000_000; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i*0.2) * Math.cos(i/1.2);
        }
        System.out.println(System.currentTimeMillis() - t);
    }

    public static void secondMethod() {
        double[] array = new double[100_000_000];
        final int stoMillionov = 100_000_000;
        long t = System.currentTimeMillis();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < stoMillionov/4 ; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i*0.2) * Math.cos(i/2);
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = stoMillionov/4; i < stoMillionov/2 ; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i*0.2) * Math.cos(i/2);
            }
        });
        Thread thread3 = new Thread(() -> {
            for (int i = stoMillionov/2; i < stoMillionov * 0.75; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i*0.2) * Math.cos(i/2);
            }
        });
        Thread thread4 = new Thread(() -> {
            for (int i = 75_000_000; i < stoMillionov; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i*0.2) * Math.cos(i/2);
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
       try {thread1.join();
           thread2.join();
           thread3.join();
           thread4.join();
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
        System.out.println(System.currentTimeMillis() - t);
    }
}
