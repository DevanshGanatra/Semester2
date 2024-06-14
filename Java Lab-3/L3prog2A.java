/* Write a program to find that given number or string is palindrome or no */
import java.util.Scanner;

public class L3prog2A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String:");
        String str = sc.next();
        sc.close();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                System.out.println("not palindrome");
                return;
            }
        }

        System.out.println("palindrome");

  
    }
}