package lab_5;

import java.util.Scanner;

class box {
    double width, height, depth;

    void volume() {
        double volume = width * height * depth;
        System.out.println("the volume of the box is :" + volume);
    }
}

public class ques_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        box b = new box();
        System.out.println("enter the width of the box :");
        b.width = s.nextInt();
        System.out.println("enter the height of the box :");
        b.height = s.nextInt();
        System.out.println("enter the depth of the box ");
        b.depth = s.nextInt();
        b.volume();
    }

}
