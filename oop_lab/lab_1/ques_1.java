package lab_1;
public class ques_1 {
    public static void main(String[] args)
    {
        int length , breath ;
        length = Integer.parseInt(args[0]);
        breath =Integer.parseInt(args[1]);
        int area = length*breath;
        System.out.println("The area of the said rectangle is " + area);
        int circumference = 2*(length + breath);
        System.out.println("The circumfernce of the said rectangle is " + circumference);
    }
}
