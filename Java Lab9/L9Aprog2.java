/* Write a program to create two threads, one thread will print odd numbers and second thread will print even numbers 
between 1 to 20 numbers */
class oddThread extends Thread {
    @Override
    public void run() {
        try{
            for(int i=1;i<20;i=i+2){
                try{
                    System.out.println(i);
                    Thread.sleep(1000);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

class evenThread extends Thread {
    @Override
    public void run() {
        try{
            for(int i=2;i<=20;i=i+2){
                try{
                    System.out.println(i);
                    Thread.sleep(1000);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

public class L9Aprog2 {
    public static void main(String[] args) {
        oddThread t1=new oddThread();
        evenThread t2=new evenThread();
        t1.start();
        t2.start();
    }
}
