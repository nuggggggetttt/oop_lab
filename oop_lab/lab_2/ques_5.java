package lab_2;
import java.util.Scanner;
public class ques_5 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double num1 , num2 , ans ;
        char c;
        do 
        {
            System.out.println("enter the first number :");
            num1 = s.nextDouble();
            System.out.println("enter the second number :");
            num2 = s.nextDouble();
            System.out.println("enter the operand ");
            c = s.next().charAt(0);
            switch(c)
            {
                case'+': ans = num1 + num2 ; break ;
                case'-': ans = num1 - num2 ; break ;
                case '*': ans = num1 * num2 ; break;
                case '/':ans = num1 /num2 ; break;
                default : ans =0;
            }
            System.out.println("the answer is :"+ans);
            System.out.println("do another y/n");
            c=s.next().charAt(0);
        }while(c!='n');


    }
    
}
