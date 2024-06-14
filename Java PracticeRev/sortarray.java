class sorting{
    public static void printarray(int arr[])
    {
        for(int element:arr)
        {
            System.out.print(element);
        }
    }
}
public class sortarray {
    public static void main(String[] args) {
        int arr[]={7,8,3,2,1};
//bubble sort
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
       printarray(arr);

//selection sort
for(int i=0;i<arr.length-1;i++)
{
    int smallest=i;
    for(j=i+1;j<arr.length;j++)
    {
        if(arr[smallest]>arr[j])
        {
            smallest=j;
        }
                  int temp=arr[smallest];
                    arr[smallest]=arr[i];
                    arr[i]=temp;
    }
}

    }
}
