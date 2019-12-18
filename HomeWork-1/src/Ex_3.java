package ro.siit.Homework;

import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {

    }


    public static void ifDimensionsAreZero(int L, int W){
        if (L == 0 || W == 0)
            System.out.println("The numbers must not be equal with zero.");
        else
            System.out.println("The area is: " + calculateArea(5, 5));
            System.out.println("The perimeter is: " + calculatePerimeter(5 ,5 ));
    }
 
    public static int calculateArea(int L, int W){
        int area = L * W;
        return area;
    }

    public static int calculatePerimeter(int L, int W){
        int per = 2 * L + 2 * W;
        return per;
    }

}
