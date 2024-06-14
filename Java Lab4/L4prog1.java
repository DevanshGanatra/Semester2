import java.util.Scanner;
public class L4prog1{
    public static void main(String[] args){
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);

        System.out.println("Addition by command line = "+(a+b));

        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter first num: ");
        a = sc.nextDouble();
        System.out.println("Enter second num: ");
        b = sc.nextDouble();

        System.out.println("Addition by Scanner class = "+(a+b));
        sc.close();

    }
}