package lab_2;
import java.util.Scanner;
public class ques_2 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter an integer value :");
        int a = s.nextInt();
        System.out.println("enter a double value :");
        double b =s.nextDouble();
        System.out.println("enter a character :");
        char c = s.next().charAt(0);
        byte d =(byte)a;
        int e=(int)c;
        int f=(int)b;
        System.out.println("The integer has been converted to byte :"+d);
        System.out.println("The double has been converted to int :"+f);
        System.out.println("The character has been converted to int :"+e);
    }
    
}
