import java.util.Scanner;
 class Student{
  int id_no, no_of_sub_registered;
  int[] sub_code = new int[7];
  int[] sub_credit = new int[7];
  String[] grade_obtain = new String[10];
  int[] grade_point = new int[10];
  double spi;
  int sum = 0, sum1 = 0;

  public void Student(){
        no_of_sub_registered = 7;
        sub_code[0] = 150001;
        sub_credit[0] = 2;
        sub_code[1] = 150701;
        sub_credit[1] = 5;
        sub_code[2] = 150702;
        sub_credit[2] = 6;
        sub_code[3] = 150703;
        sub_credit[3] = 6;
        sub_code[4] = 150704;
        sub_credit[4] = 4;
        sub_code[5] = 150705;
        sub_credit[5] = 1;
        sub_code[6] = 150606;
        sub_credit[6] = 6;
  }

  public void calculate_spi(){
    for (int i = 0; i <= 6; i++) {
      if (grade_obtain[i].equals("AA"))
        grade_point[i] = 10;
      else if (grade_obtain[i].equals("AB"))
        grade_point[i] = 9;
      else if (grade_obtain[i].equals("BB"))
        grade_point[i] = 8;
      else if (grade_obtain[i].equals("BC"))
        grade_point[i] = 7;
      else if (grade_obtain[i].equals("CC"))
        grade_point[i] = 6;
      else if (grade_obtain[i].equals("CD"))
        grade_point[i] = 5;
      else if (grade_obtain[i].equals("DD"))
        grade_point[i] = 4;
      else if (grade_obtain[i].equals("FF"))
        grade_point[i] = 0;
      this.sum = sum + (sub_credit[i] * grade_point[i]);
      this.sum1 = sum1 + sub_credit[i];
    }
    spi = sum / sum1;
    System.out.println("your spi is = " + spi);
  }
}
 

public class L6prog1{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Student obj = new Student();
    int length = args.length;
    if (length <= 0) {
      System.out.println("enter enrollment no list");
    }
    for (int k = 0; k < length; k++) {
      System.out.println("Enter details about grade obtain for each subject \n \n");
      System.out.println("subject code \t subject credit \t obtain grade \n");
      System.out.println("------------------------------------------------ \n");
      for (int i = 0; i <= 6; i++) {
        System.out.print(obj.sub_code[i] + "\t \t \t" + obj.sub_credit[i] + "\t \t \t");
        String r = sc.nextLine();
        obj.grade_obtain[i] = r;
      }
      obj.calculate_spi();
    }
  }
  
}