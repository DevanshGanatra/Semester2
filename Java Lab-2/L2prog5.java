// Write a program to convert temperature from Fahrenheit to Celsius.

import java.util.Scanner;
public class L2prog5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Fahrenheit: ");
        double f = sc.nextFloat();

        double c = (f - 32) * (5/9.0);

        System.out.println("Celsius = " + c);
        sc.close();
    }
}