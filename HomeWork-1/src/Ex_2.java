package ro.siit.Homework;


public class Ex_2 {
    public static void main(String[] args) {
        int result = palidromeCheck(1221);
    }

    public static int reverseInt (int a){
        int R = 0;
        int reverse = 0;
        while(a >= 0){
            int reminder = a % 10;
            reverse = R * 10 + reminder;
            a = a/10;
        }
        return reverse;
    }

    public static int palidromeCheck(int a){
        if (a == reverseInt(a)){
            System.out.println("It is a palidrome");
        } else {
            System.out.println("It's not a palidrome");
        }
        return a;
    }
}
