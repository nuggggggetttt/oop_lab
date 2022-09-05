package lab_2;
import java.util.Scanner;
public class ques_1{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an year");
        int year = s.nextInt();
        boolean flag = false ;
        if(year%400==0)
        {
            flag=true;
        }
        else if(year%100==0)
        {
            flag=false;
        }
        else if(year%4==0)
        {
            flag=true;
        }
        else
        {
            flag=true;
        }
        if(flag)
        {
            System.out.println("The given year is a leap year");
        }
        else
        {
            System.out.println("The given year is not a leap year");
        }
    }
}