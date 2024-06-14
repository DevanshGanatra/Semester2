/* Write a program to create basic calculator by getting 2 numbers and 1 string (operation) from the user and apply the 
operation given in a string on the given numbers */
import java.util.Scanner;

public class L2prog3 {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter two digits");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println("enter what operator you want to perform:");
        char c=sc.next().charAt(0);
        switch (c) {
            case '+': 
                System.out.println("summation="+(a+b));
                break;
            case '-':
                System.out.println("substraction="+(a-b));
                break;
            case '*':
                System.out.println("multiplication="+(a*b));
                break;
            case '/':
                System.out.println("Division="+(a/b));  
                break;  
            default:
                System.out.println("Invalid Operator.");
                break;
        }
        sc.close();
    }
}