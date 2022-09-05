package lab_3;
import java.util.Scanner;
public class ques_2 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double len , bre , cir , are;
        System.out.println("enter lenght :");
        len = s.nextDouble();
        System.out.println("enter breath :");
        bre = s.nextDouble();
        cir = 2*(len + bre);
        are = len*bre;
        System.out.println("circumference of the rectangle is : "+cir);
        System.out.println("area of the rectangle is :"+are);
    }
    
}
