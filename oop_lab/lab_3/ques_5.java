package lab_3;
import java.util.Scanner;
public class ques_5 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int num1 , num2;
        System.out.println("enter the lower bound :");
        num1=s.nextInt();
        System.out.println("enter the upper bound :");
        num2=s.nextInt();
        for(int i = num1 ; i<=num2 ; i++)
        {   
            int flag=0;
            for(int j=1 ; j<=i ; j++)
            {
                if(i%j==0)
                {
                    flag++;
                }
            }
            if(flag==2)
            {
                System.out.println("the number "+i+" is a prime number is the given bounds");
            }
        }
    }
    
}
