package ro.siit.Homework;

public class Ex_1 {
    public static void main(String[] args) {
        System.out.println("The sum is " + calculateSumOfNumbers(100));
    }

    public static int calculateSumOfNumbers(int a){
        int sum = 0;
        for (int i = 0; i <= a; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
