/*
  Write a program to get 2 numbers from the user and print the sum of two numbers using command line and Scanner class. 
 */
import java.util.Scanner;
public class L2prog1B {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two integers:");
        int a= sc.nextInt();
        int b=sc.nextInt();
        System.out.println("sum of "+a+" and "+b+"= "+(a+b));
        sc.close();
    }
}
