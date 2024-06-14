import java.util.Scanner;

public class L3prog2C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        int i = 2, count = 0;

        while (i <= a / 2) {
            if (a % i == 0) {
                count++;
                break;
            }
            i++;
        }
        if (count == 0) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
        sc.close();
    }
}