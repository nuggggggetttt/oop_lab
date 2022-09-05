package lab_1;
import java.util.Scanner;
public class ques_2
{
   public static void main(String[] args)
   {
      int countP=0, countN=0, countZ=0, i;
      int[] arr = new int[10];
      Scanner sc= new Scanner(System.in);
      
      System.out.print("Enter 10 Numbers: ");
      for(i=0; i<10; i++)
         arr[i] = sc.nextInt();
      
      for(i=0; i<10; i++)
      {
         if(arr[i]<0)
            countN++;
         else if(arr[i]>0)
            countP++;
         else
            countZ++;
      }
      
      System.out.println("\nTotal Positive Number: " +countP);
      System.out.println("Total Negative Number: " +countN);
      System.out.println("Total Zero: " +countZ);
   }
}