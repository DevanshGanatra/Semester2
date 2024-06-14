import java.util.Scanner;

public class L4prog8 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter any digit: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int k=n-1;k>0;k--)
        {
            for(int l=1;l<=k;l++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
