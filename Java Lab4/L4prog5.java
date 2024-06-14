import java.util.Scanner;
public class L4prog5 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		int len = str.length();
		System.out.println("Length of string = "+len);
		for(int i=len/2;i<len;i++){
		    System.out.print(str.charAt(i));
		    }    
	}
}