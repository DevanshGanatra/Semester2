import java.util.Scanner;

class  Bank_Account{
    int  accountNo;
    String  userName;
    String email;
    String accountType;
    double  accountBalance;

   void  getAccountDetails(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Please Enter Your Account No.:");
        accountNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Please  Enter Your Username:");
        userName = sc.nextLine();
        System.out.print("Please  Enter Your Email:");
        email = sc.nextLine();
        System.out.print("Please  Enter Your Account-Type:");
        accountType = sc.nextLine();
        System.out.print("Please  Enter Your Account-Balance:");
        accountBalance = sc.nextDouble();
    }
   void  displayAccountDetails(){
        System.out.println("Account No.:"+accountNo);
        System.out.println("Username:"+userName);
        System.out.println("Email:"+email);
        System.out.println("Account-Type:"+accountType);
        System.out.println("Account-Balance:"+accountBalance);
   }
}


public class L5prog4 {
    public static void main(String[] args) {
        Scanner cs =new Scanner(System.in);
        System.out.print("Enter No. OF Bank Account you want to Enter:");
        int n=cs.nextInt();
        Bank_Account accountholder[] =new Bank_Account[n];//array of object
        for(int i=0;i<n;i++)
        {
            accountholder[i] = new Bank_Account();//object
            System.out.println("Enter Account Details for User-"+(i+1));
            accountholder[i].getAccountDetails();
        }
        for(int j=0;j<n;j++) 
        {
            System.out.println("Account Details of User-"+(j+1));
            accountholder[j].displayAccountDetails();
        }
    }
}
