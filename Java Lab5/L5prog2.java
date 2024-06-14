import java.util.Scanner;
class Time{
    int hr1,min1,sec1,hr2,min2,sec2;
    
    public Time()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter time-1 hh mm ss format: ");
        hr1 = sc.nextInt();
        min1= sc.nextInt();
        sec1= sc.nextInt();
        
        System.out.print("Enter time-2 hh mm ss format: ");
        hr2 = sc.nextInt();
        min2= sc.nextInt();
        sec2= sc.nextInt();
        sc.close();
        addTime();
    }

    public void addTime()
    {
        int hr=hr1+hr2;
        int min=min1+min2;
        int sec=sec1+sec2;
        while (sec>=60) {
            if(sec==60){
                sec=0;
                min++;
            }
           else{
            sec=sec-60;
            min++;
           }
        }
        while (min>=60){
            if(min==60){
                min=0;
                hr++;
            }
           else{
            min=min-60;
            hr++;
           }            
        }
        System.out.println("time= "+hr+":"+min+":"+sec);
    }

}

public class L5prog2 {

    public static void main(String[] args)
    {
        System.out.println("THIS IS ADDITION OF TWO SAMAYS:-");
        Time t=new Time();
    }
}