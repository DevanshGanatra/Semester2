/*Write an application that executes two threads. One thread displays "Good Morning" every 1000 milliseconds 
& another thread displays "Good Afternoon" every 3000 milliseconds. Create the threads by implementing 
the Runnable interface.  */

import java.util.Scanner;

class MyThread implements Runnable {
    String s;
    int delay;

    public MyThread(String s, int delay) {
        this.s = s;
        this.delay = delay;
    }

    @Override
    public void run() {
        try {
            while(true){
                System.out.println(s);
                Thread.sleep(delay);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class L9Aprog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyThread m1 = new MyThread("Good Morning", 1000);
        Thread t1 = new Thread(m1);
        MyThread m2 = new MyThread("Good Aftenoon", 3000);
        Thread t2 = new Thread(m2);
        t1.start();
        t2.start();
    }

}