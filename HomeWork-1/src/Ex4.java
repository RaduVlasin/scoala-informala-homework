public class Ex4 {
    public static void main(String[] args) {
        System.out.println("The biggest number is: " + biggestNumber(12,34,-12));
    }

    public static int biggestNumber(int a, int b, int c) {
        int max = a;
        if (a > b && a > c)
            max = a;
        else if (b > c)
            max = b;
        else
            max = c;
        return max;
    }
}
