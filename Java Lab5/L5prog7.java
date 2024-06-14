//Write a program in Java to demonstrate use of this keyword. 
//Check whether this can access the Static variables of the class or not

import java.util.Scanner;

class rectangle{
    int length;
    int breadth;
    int height;

    void getDimension(int length,int breadth, int height)
    {
        this.length=length;
        this.breadth=breadth;
        this.height=height;
        volume();
    }
    void volume()
    {
        int Vol=length*breadth*height;
        System.out.println("Volue ="+Vol);
    }
}

public class L5prog7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter LENGTH,BREADTH,HEIGHT of Rectangle:");
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        int height=sc.nextInt();
        rectangle one =new rectangle();
        one.getDimension(length,breadth,height);
    }
}
