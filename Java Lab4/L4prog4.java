import java.util.Scanner;
public class L4prog4
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter size of array: ");
	    int size = sc.nextInt();
	    int[] arr = new int[size];
	    for (int i=0;i<size ;i++ ) {
	       System.out.printf("Enter arr[%d] : ",i);
	       arr[i] = sc.nextInt();
	    }
	    System.out.println("Array in rev : ");
	    for(int i= (arr.length-1);i>=0;i--){
	        System.out.print(arr[i]+" ");
	    }
	}
}