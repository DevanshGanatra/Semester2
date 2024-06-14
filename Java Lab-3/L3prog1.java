 /* The marks obtained by a student in 5 different subjects are input through the keyboard. 
The student gets a division as per the following rules:
        I. Percentage above or equals to 60-ƒrst division
        II. Percentage between 50 to 59-second division
        III. Percentage between 40 and 49-Third division
        IV. Percentage less than 40-fail
*/

import java.util.Scanner;

public class L3prog1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int[] mrks =new int[5];
       int sum=0;
       for(int i=0;i<5;i++)
       {
        System.out.println("enter your mrks of subject "+(i+1)+" :");
        mrks[i]=sc.nextInt();
        sum+=mrks[i];
       } 
       double per=sum/5.0;
       if(per>=60)
       {
        System.out.println("First class");
       }
       else if(per>=50)
       {
        System.out.println("Second class");
       }
       else if(per>=40)
       {
        System.out.println("Third class");
       }
       else
       {
        System.out.println("Fail oops!");
       }
       sc.close();
    }
}