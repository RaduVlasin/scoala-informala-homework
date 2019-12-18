package ro.siit.Homework;


public class Ex2 {
    public static void main(String[] args) {
//        int insertedNumber = 1221;
        int a = reverseInt(1221);

    }

    public static int reverseInt(int insertedNum) {
        int originalInt = insertedNum;
        int reversedInt = 0;
//
        while (insertedNum != 0) {
            int remainder = insertedNum % 10;
            reversedInt = reversedInt * 10 + remainder;
            insertedNum = insertedNum / 10;
        }

        if (originalInt == reversedInt) {
            System.out.println("The number " + originalInt + " is a palidrome");
        } else {
            System.out.println("The number " + originalInt + " is not a palidrome");
        }
        return reversedInt;
    }


}
