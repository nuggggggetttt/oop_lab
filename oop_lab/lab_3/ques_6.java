package lab_3;
import java.util.Scanner;
public class ques_6 {
    public static void main(String[] args)
    {   
        Scanner s=new Scanner(System.in);
        int n , k , ser;
        System.out.println("enter the number of elements in the array :");
        n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements of array :");
        for(int i =0 ; i<n ; i++)
        {
            k=s.nextInt();
            arr[i]=k;
        }
        System.out.println("enter the number to be searched for :");
        ser = s.nextInt();
        for(int i=0 ; i<n ;i++ )
        {
            if(ser==arr[i])
            {
                System.out.println("the element to be searched for is present at index :"+i);
            }
            
        }

    }
}
