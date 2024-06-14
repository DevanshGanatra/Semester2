/* Write a program to calculate the area of circle. */
import java.util.Scanner;

public class L2prog4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter radius of circle:");
        double a=sc.nextDouble();
        System.out.println("area of circle="+(Math.PI*a*a));
        sc.close();
    }
}
