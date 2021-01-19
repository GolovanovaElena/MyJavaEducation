package ru.golovanova.Interface;

public class Greeter implements Runnable {
    private int n = 0;
    private String target;

    public Greeter(int n, String target) {
        this.n = n;
        this.target = target;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++){
            System.out.println("Hello!" + target);
        }
    }

    public static void main (String [] args){
        Greeter one = new Greeter(11, "sleep");
        Greeter two = new Greeter(11, "eat");
        Thread thread1 = new Thread(one);
        Thread thread2 = new Thread(two);
        thread1.start();
        thread2.start();

    }
}
