package lab_3;
import java.util.Scanner;
public class ques_1 {
    public static void main(String[] args)
    {   
        Scanner s = new Scanner(System.in);
        int n , rem , org_num , res=0 ;
        System.out.println("enter a number :");
        n = s.nextInt();
        org_num = n;
        while(org_num!=0)
        {
            rem = org_num%10;
            res += Math.pow(rem , 3);
            org_num = org_num/10;
        }
        if(res==n)
        {
            System.out.println("the number is armstrong number ");
        }
        else
        {
            System.out.println("the number is not armstrong number ");
        }
        
    }
}
