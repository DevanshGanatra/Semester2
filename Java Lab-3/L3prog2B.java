import java.util.Scanner;
public class L3prog2B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();
        System.out.println("Enter third number: ");
        int n3 = sc.nextInt();

        if(n1 == n2 && n1 == n3){
            System.out.println("All are equal");
        }
        else if(n1 >= n2){
            if (n1>=n3){
                System.out.println("Largest num = "+n1);
            }
            else{
                System.out.println("Largest num = "+n3);
            }
        }
        else{
            if (n2>=n3){
                System.out.println("Largest num = "+n2);
            }
            else{
                System.out.println("Largest num = "+n3);
            }
        }
        sc.close();
    }
}