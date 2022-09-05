package lab_2;
import java.util.Scanner;
public class ques_4 {
    public static void main(String[] args)
    {   
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number :");
        double d =s.nextDouble();
        if(d%1==0)
        {
            double n = (double)d;
            System.out.println("the given number is an integer value thus converted to double :"+n);
        }
        else 
        {
            int k =(int)d;
            System.out.println("the given number is an double value thus converted to integer :"+k);
        }

    }
}
