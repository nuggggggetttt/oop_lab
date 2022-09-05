package lab_3;
import java.util.Scanner;
public class ques_3_4 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n ;
        System.out.println("enter the number of rows");
        n=s.nextInt();
        int arr[];
        arr = new int[n];
        for(int i =0; i<arr.length ; i++)
        {
            arr[i]=i+1;
        }
        //n = s.nextInt();
        //for(int i =1; i<=n ; i++)
        //{
        //    for(int j=1 ; j<=i ; j++)
        //    {
        //        System.out.print(i);
        //    }
        //    System.out.println();
        //}
        for(int i:arr)
        {
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
}
