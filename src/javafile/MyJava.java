package javafile;

import java.util.Scanner;

import static java.lang.Math.abs;

public class MyJava {
    public static void main(String[] args) {
        /*System.out.println("The Max Value among 3 and 5 is " + MyKotlin.maxVal(3, 5));
        System.out.println("The volume is " + MyKotlin.findVolume(3, 5)); //Default function*/
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
//        int num = 14531;
        MyJava myJava = new MyJava();
        if (myJava.isPalindrome(String.valueOf(num))) {
            System.out.println(num);
        } else {
            System.out.println(myJava.closestPalindrome(num));
        }

    }

    public static int add(int a, int b) {
        return a + b;
    }

    private boolean isPalindrome(String num) {
        char[] numArray = num.toCharArray();
        for (int i = 0; i < numArray.length / 2; i++)
            if (numArray[i] != numArray[numArray.length - 1 - i])
                return false;
        return true;
    }

    // function return closest Palindrome number
    private int closestPalindrome(int num) {

        // case1 : largest palindrome number
        // which is smaller to given number
        int RPNum = num - 1;

        while (!isPalindrome(String.valueOf(abs(RPNum))))
            RPNum--;

        // Case 2 : smallest palindrome number
        // which is greater than given number
        int SPNum = num + 1;

        while (!isPalindrome(String.valueOf(SPNum)))
            SPNum++;

        // check absolute difference
        if (abs(num - RPNum) > abs(num - SPNum))
            return SPNum;
        else
            return RPNum;
    }
}
