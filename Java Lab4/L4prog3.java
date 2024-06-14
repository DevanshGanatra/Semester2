//Write a program that creates and initializes a four integer element array. Calculate and display the average of its values.

public class L4prog3 {
    public static void main(String[] args){
       int[] arr = {15,20,25,30};
       int sum=0;
       for(int i=0;i<4;i++){
        sum+= arr[i];
       }
       System.out.println("avg= "+sum/4.0);
    }
}