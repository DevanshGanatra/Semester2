//Write a program to create circle class with area function to nd area of circle. 
import java.util.Scanner;

class Circle{
    double area(int r){
        return Math.PI*r*r;
    }
}

public class L5prog1 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Circle c=new Circle();
        System.out.print("Enter no. of Circle's area you want to find:");
        int n=sc.nextInt();
        int numofcircles[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter Radius For your Circle "+(i+1)+": ");
            numofcircles[i]=sc.nextInt();
            System.out.println("Area: "+(c.area(numofcircles[i])));
            
        }
    }
}
