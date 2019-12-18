package ro.siit.Homework;

public class Ex3 {
    public static void main(String[] args) {
        int restult  = ifDimensionsAreZero(5, 5);
    }


    public static int ifDimensionsAreZero(int L, int W) {
        int area = 0;
        int perimeter = 0;
        if (L == 0 || W == 0)
            System.out.println("The numbers must not be equal with zero.");
        else
            area = L * W;
            perimeter = 2 * (L + W);
            System.out.println("The area of the rectangle is: " + area);
            System.out.println("The perimeter of the rectangle is: " + perimeter);

        return area;
    }


}
