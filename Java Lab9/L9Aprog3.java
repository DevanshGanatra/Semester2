/*Write a complete multi-threaded program to meet following requirements: 
a. Read matrix [A] m x n 
b. Create m number of threads 
c. Each thread computes summation of elements of one row, 
i.e. ith row of the matrix is processed by ith thread. Where 0 <= i< m. d. Print the results. */

import java.util.Scanner;

class matrixThread extends Thread{
    int[] row;
    int rowno;
    public matrixThread(int[] row,int rowno)
    {
        this.row=row; 
        this.rowno=rowno;
    }
    @Override
    public void run() {
        int sum=0;
        for(int num:row)
        {
            sum+=num;
        }
        System.out.println("Sum of elements in the row:"+rowno+"= "+sum);
    }
}
public class L9Aprog3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. Of Rows of Your the Matrix:");
        int row=sc.nextInt();
        System.out.println("Enter No. Of cols of Your the Matrix:");
        int col=sc.nextInt();
        int [][] matrix= new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.println("Enter element a["+i+"]["+j+"] =");
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            matrixThread mt=new matrixThread(matrix[i], i+1);
            mt.start();
        }
    }
}
